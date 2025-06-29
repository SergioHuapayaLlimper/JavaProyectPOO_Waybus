package Proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ControladorAsignaciones {
    // Cargar la lista de buses desde el archivo
    public static List<Buses> cargarBusesDesdeArchivo(String nombreArchivo) {
        List<Buses> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 6) {
                    String placa = partes[0].trim();
                    String modelo = partes[1].trim();
                    String marca = partes[2].trim();
                    String estado = partes[3].trim();
                    int usos = Integer.parseInt(partes[4].trim());
                    int asientos = Integer.parseInt(partes[5].trim());
                    lista.add(new Buses(placa, modelo, marca, estado, usos, asientos));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Guardar la lista de buses actualizada en el archivo
    public static void guardarBusesEnArchivo(String nombreArchivo, List<Buses> listaBuses) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (Buses b : listaBuses) {
                pw.println(b.getPlaca() + "," +
                           b.getModelo() + "," +
                           b.getMarca() + "," +
                           b.getEstado() + "," +
                           b.getUsos() + "," +
                           b.getCantidadAsientos());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar asignaciones desde el archivo rutas.txt
    public static List<AsignacionesRutas> cargarAsignacionesDesdeArchivo(String nombreArchivo, List<Buses> listaBuses) {
        List<AsignacionesRutas> asignaciones = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 6) {
                    String fecha = datos[0].trim();
                    String hora = datos[2].trim();
                    String origen = datos[3].trim();
                    String destino = datos[4].trim();
                    String placaBus = datos[5].trim();  // asumiendo que aquí está la placa

                    Buses bus = buscarBusPorPlaca(placaBus, listaBuses);
                    if (bus != null) {
                        asignaciones.add(new AsignacionesRutas(fecha, hora, origen, destino, bus));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return asignaciones;
    }

    // Buscar un bus por su placa
    public static Buses buscarBusPorPlaca(String placa, List<Buses> listaBuses) {
        for (Buses b : listaBuses) {
            if (b.getPlaca().equalsIgnoreCase(placa)) {
                return b;
            }
        }
        return null;
    }

    // Asignar el primer bus operativo con asientos disponibles y actualizar archivo
    public static Buses asignarBusParaRuta(Rutas ruta, List<AsignacionesRutas> asignaciones, List<Buses> listaBuses, String archivoBuses) {
        // 1. Verificar si ya hay un bus asignado a esta ruta
        for (AsignacionesRutas asignacion : asignaciones) {
            if (asignacion.getFecha().equals(ruta.getFechaEmbarque()) &&
                asignacion.getHora().equals(ruta.getHorarioEmbarque()) &&
                asignacion.getOrigen().equals(ruta.getLugarPartida()) &&
                asignacion.getDestino().equals(ruta.getLugarLlegada())) {

                Buses bus = asignacion.getBus();
                if (bus.getCantidadAsientos() > 0 && bus.getEstado().equalsIgnoreCase("Operativo")) {
                    bus.setCantidadAsientos(bus.getCantidadAsientos() - 1);  // solo baja asientos
                    guardarBusesEnArchivo(archivoBuses, listaBuses);
                    return bus;
                }
            }
        }
        // 2. Si no hay un bus asignado aún, buscar uno nuevo disponible
        for (Buses bus : listaBuses) {
            if (bus.getCantidadAsientos() > 0 && bus.getEstado().equalsIgnoreCase("Operativo")) {
                bus.setCantidadAsientos(bus.getCantidadAsientos() - 1);
                guardarBusesEnArchivo(archivoBuses, listaBuses);
                return bus;
            }
        }
        return null; // No hay buses disponibles
    }
    
}
package Proyecto;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MantenimientoRutas {

    public static ArrayList<String[]> obtenerRutasDesdeArchivo() {
        ArrayList<String[]> listaRutas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("rutas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 7) {
                    for (int i = 0; i < datos.length; i++) {
                        datos[i] = datos[i].trim();
                    }
                    listaRutas.add(datos);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer rutas.txt: " + e.getMessage());
        }

        return listaRutas;
    }
    
    // Devuelve lista de códigos de conductores
    public static ArrayList<String> obtenerConductores() {
        ArrayList<String> conductores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 8 && datos[7].trim().equalsIgnoreCase("Conductor")) {
                    conductores.add(datos[0].trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer usuarios.txt: " + e.getMessage());
        }
        return conductores;
    }

    // Devuelve lista de placas de buses con estado "Listo"
    public static ArrayList<String> obtenerBusesDisponibles() {
        ArrayList<String> buses = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("buses.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length >= 4 && datos[3].trim().equalsIgnoreCase("Listo")) {
                    buses.add(datos[0].trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer buses.txt: " + e.getMessage());
        }
        return buses;
    }
    
    public static List<String> obtenerHorarios() {
        List<String> horarios = new ArrayList<>();
        horarios.add("Mañana - 08:00 AM");
        horarios.add("Tarde - 12:00 PM");
        horarios.add("Noche - 06:00 PM");
        return horarios;
    }
    
    public static void eliminarRutaDelArchivo(int filaAEliminar) {
    File archivoOriginal = new File("rutas.txt");
    File archivoTemporal = new File("temp_rutas.txt");

    try (Scanner sc = new Scanner(archivoOriginal);
         PrintWriter pw = new PrintWriter(archivoTemporal)) {

        int filaActual = 0;
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();

            if (filaActual != filaAEliminar) {
                pw.println(linea);
            }
            filaActual++;
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    // Reemplazar el archivo original por el temporal
    if (archivoOriginal.delete()) {
        archivoTemporal.renameTo(archivoOriginal);
    }
}
    
    public static List<String> obtenerLugares() {
        return Arrays.asList("Arequipa", "Alto Siguas", "Camaná", "Ica", "Atocongo", "Lima");
    }
    
    public static String obtenerPrecioDeRuta(String salida, String llegada) {
        if (salida == null || llegada == null) return "Ruta no permitida";

        double precio = EvaluadorRutas.obtenerPrecio(salida, llegada);
        return (precio > 0) ? "S/ " + precio : "Ruta no permitida";
    }
    
    public static void actualizarRutaEnArchivo(int fila, String[] nuevaRuta) {
        ArrayList<String[]> rutas = obtenerRutasDesdeArchivo();

        if (fila >= 0 && fila < rutas.size()) {
            rutas.set(fila, nuevaRuta); // Reemplazar por la nueva versión
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("rutas.txt"))) {
            for (String[] ruta : rutas) {
                String linea = String.join(",", ruta);
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar rutas.txt: " + e.getMessage());
        }
    }
}

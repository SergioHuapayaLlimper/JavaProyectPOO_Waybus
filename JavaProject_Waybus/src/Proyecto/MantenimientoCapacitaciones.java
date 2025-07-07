
package Proyecto;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class MantenimientoCapacitaciones {
    
    public List<String[]> leerHistorialDesdeArchivo(String archivo) {
        List<String[]> historial = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 3) {
                    historial.add(datos);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer historial: " + e.getMessage());
        }

        return historial;
    }

    public void guardarCapacitacion(String codigoEmpleado, String capacitacion, String comentario) {
        File archivo = new File("historial_capacitaciones.txt");
        List<String> lineasActualizadas = new ArrayList<>();
        boolean actualizado = false;

        try {
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;

                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(",");
                    if (partes.length >= 2 && partes[0].equalsIgnoreCase(codigoEmpleado)) {
                        lineasActualizadas.add(codigoEmpleado + "," + capacitacion + "," + comentario);
                        actualizado = true;
                    } else {
                        lineasActualizadas.add(linea);
                    }
                }
                br.close();
            }

            if (!actualizado) {
                lineasActualizadas.add(codigoEmpleado + "," + capacitacion + "," + comentario);
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for (String l : lineasActualizadas) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar capacitación: " + e.getMessage());
        }
    }

    public Map<String, String[]> cargarCapacitaciones() {
        Map<String, String[]> datos = new HashMap<>();
        File archivo = new File("historial_capacitaciones.txt");

        if (!archivo.exists()) return datos;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    datos.put(partes[0], new String[]{partes[1], partes[2]});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar historial de capacitaciones: " + e.getMessage());
        }

        return datos;
    }
}

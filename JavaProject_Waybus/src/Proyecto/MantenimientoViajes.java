package Proyecto;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class MantenimientoViajes {

    public Map<String, Integer> contarRutasDesdeArchivo(String archivo) {
        Map<String, Integer> conteoRutas = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 10) {
                    String ruta = datos[9].trim().replaceAll("\\s+", " ").toLowerCase(); // Normaliza espacios y minúsculas

                    // Mostrar en consola para verificar
                    System.out.println("Ruta procesada: " + ruta);

                    // Contar la ruta tal como aparece
                    conteoRutas.put(ruta, conteoRutas.getOrDefault(ruta, 0) + 1);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }

        return conteoRutas;
    }
    
    public void guardarClasificacion(String ruta, String clasificacion) {
        File archivo = new File("clasificaciones.txt");
        List<String> lineasActualizadas = new ArrayList<>();

        try {
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;
                boolean actualizada = false;

                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(",");
                    if (partes.length == 2 && partes[0].trim().equalsIgnoreCase(ruta.trim())) {
                        // Reemplaza la clasificación si ya existe
                        lineasActualizadas.add(ruta + "," + clasificacion);
                        actualizada = true;
                    } else {
                        lineasActualizadas.add(linea);
                    }
                }
                br.close();

                if (!actualizada) {
                    lineasActualizadas.add(ruta + "," + clasificacion); // Nueva entrada
                }
            } else {
                lineasActualizadas.add(ruta + "," + clasificacion); // Archivo nuevo
            }

            // Escribe todas las líneas actualizadas
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for (String l : lineasActualizadas) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();

            JOptionPane.showMessageDialog(null, "¡Etiqueta añadida con éxito: " + clasificacion + "!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar clasificación: " + e.getMessage());
        }
    }
}

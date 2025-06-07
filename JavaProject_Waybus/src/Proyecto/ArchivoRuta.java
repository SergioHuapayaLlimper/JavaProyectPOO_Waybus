package Proyecto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoRuta {

    private static final String DATOS_RUTAS = "rutas.txt";

    public static void guardarRuta(Rutas ruta) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATOS_RUTAS, true))) {
            String linea = ruta.getFechaEmbarque() + "," +
                           ruta.getHorarioEmbarque() + "," +
                           ruta.getLugarPartida() + "," +
                           ruta.getLugarLlegada();
            writer.write(linea);
            writer.newLine();
            System.out.println("Ruta guardada correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar la ruta: " + e.getMessage());
        }
    }
}

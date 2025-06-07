package Proyecto;

public class EvaluadorRutas {

    public static double obtenerPrecio(String salida, String llegada) {
        if (salida == null || llegada == null) return -1.0;

        salida = salida.trim().toLowerCase();
        llegada = llegada.trim().toLowerCase();

        if (salida.equals(llegada)) {
            return -1.0; // No se permite la misma ciudad
        }

        switch (salida) {
            case "arequipa" -> {
                if (llegada.equals("ica")) return 95.0;
                if (llegada.equals("atocongo")) return 100.0;
                if (llegada.equals("lima")) return 110.0;
            }

            case "alto siguas" -> {
                if (llegada.equals("ica")) return 85.0;
                if (llegada.equals("atocongo")) return 90.0;
                if (llegada.equals("lima")) return 95.0;
            }

            case "camaná" -> {
                if (llegada.equals("ica")) return 70.0;
                if (llegada.equals("atocongo")) return 75.0;
                if (llegada.equals("lima")) return 80.0;
            }
        }

        return -1.0; // Ruta no permitida
    }
}

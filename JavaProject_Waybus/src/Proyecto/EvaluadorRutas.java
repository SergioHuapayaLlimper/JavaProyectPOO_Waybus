package Proyecto;

public class EvaluadorRutas {

    public static double obtenerPrecio(String salida, String llegada) {
        if (salida == null || llegada == null) return -1.0;

        salida = salida.trim().toLowerCase();
        llegada = llegada.trim().toLowerCase();

        if (salida.equals(llegada)) {
            // No se permite viajar al mismo destino de origen
            return -1.0;
        }

        switch (salida) {
            case "arequipa" -> {
                if (llegada.equals("alto siguas")) return 20.0;
                if (llegada.equals("camaná")) return 25.0;
                if (llegada.equals("ica")) return 95.0;
                if (llegada.equals("atocongo")) return 100.0;
                if (llegada.equals("lima")) return 110.0;
            }

            case "alto siguas" -> {
                if (llegada.equals("arequipa")) return 20.0;
                if (llegada.equals("camaná")) return 15.0;
                if (llegada.equals("ica")) return 85.0;
                if (llegada.equals("atocongo")) return 90.0;
                if (llegada.equals("lima")) return 95.0;
            }

            case "camaná" -> {
                if (llegada.equals("arequipa")) return 25.0;
                if (llegada.equals("alto siguas")) return 15.0;
                if (llegada.equals("ica")) return 70.0;
                if (llegada.equals("atocongo")) return 75.0;
                if (llegada.equals("lima")) return 80.0;
            }

            case "ica" -> {
                if (llegada.equals("arequipa")) return 95.0;
                if (llegada.equals("alto siguas")) return 85.0;
                if (llegada.equals("camaná")) return 70.0;
                if (llegada.equals("atocongo")) return 35.0;
                if (llegada.equals("lima")) return 40.0;
            }

            case "atocongo" -> {
                if (llegada.equals("arequipa")) return 100.0;
                if (llegada.equals("alto siguas")) return 90.0;
                if (llegada.equals("camaná")) return 75.0;
                if (llegada.equals("ica")) return 35.0;
                if (llegada.equals("lima")) return 15.0;
            }

            case "lima" -> {
                if (llegada.equals("arequipa")) return 110.0;
                if (llegada.equals("alto siguas")) return 95.0;
                if (llegada.equals("camaná")) return 80.0;
                if (llegada.equals("ica")) return 40.0;
                if (llegada.equals("atocongo")) return 15.0;
            }
        }

        return -1.0; // Ruta no registrada
    }
}


package Proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MantenimientoBuses {
    private ArrayList<Buses> listregistrobus;
    
    public MantenimientoBuses(){
        listregistrobus = new ArrayList<>();
    }
    
    //Agrega clientes a la lista
    public void Agregar(Buses regBuses){
        listregistrobus.add(regBuses);
    }
    
    public ArrayList<Buses> getListaRegistroBuses(){
        return listregistrobus;
    }
    
    private final String rutaArchivo = "buses.txt";//Ruta del archivo
    
    //Método para obtener empleados desde archivo.txt
    public ArrayList<Buses> obtenerBuses() {
        ArrayList<Buses> lista = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(rutaArchivo))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine().trim();
                String[] datos = linea.split(",");

                if (datos.length == 5) {
                    String placa = datos[0];
                    String modelo = datos[1];
                    String marca = datos[2];
                    String estado = datos[3];
                    int usos = Integer.parseInt(datos[4]);

                    Buses bus = new Buses(
                        placa, modelo, marca, estado, usos
                    );
                    lista.add(bus);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer empleados: " + e.getMessage());
        }

        return lista;
    }
    
        // Método para actualizar un empleado por su código
    public boolean actualizarBuses(Buses nuevobus) {
        ArrayList<Buses> bus = obtenerBuses();
        boolean actualizado = false;

        for (int i = 0; i < bus.size(); i++) {
            if (bus.get(i).getPlaca().equals(nuevobus.getPlaca())) {
                bus.set(i, nuevobus);
                actualizado = true;
                break;
            }
        }

        if (actualizado) {
            guardarBuses(bus);
        }

        return actualizado;
    }

    //Método para sobrescribir el archivo con la lista actualizada
    private void guardarBuses(ArrayList<Buses> bus) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Buses b : bus) {
                String linea = String.join(",",
                    b.getPlaca(),
                    b.getModelo(),
                    b.getMarca(),
                    b.getEstado(),
                    String.valueOf(b.getUsos())
                );
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar buses: " + e.getMessage());
        }
    }
}

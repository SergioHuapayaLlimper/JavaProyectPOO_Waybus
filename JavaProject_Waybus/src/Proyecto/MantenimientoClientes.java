//Elaborado por el Grupo 04
package Proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//Clase para manejar operaciones de los clientes
public class MantenimientoClientes {
    private ArrayList<RegistroClientes> listregistroclientes;

    public MantenimientoClientes() {
        listregistroclientes = new ArrayList<>();
    }
    
    //Agrega clientes
    public void AgregarCliente(RegistroClientes registrocliente) {
        listregistroclientes.add(registrocliente);
    }

    public ArrayList<RegistroClientes> getListaRegistroClientes() {
        return listregistroclientes;
    } 
    
   //Ruta del archivo
   private final String rutaArchivo = "clientes.txt";
    
   public ArrayList<RegistroClientes> obtenerClientes() {
   ArrayList<RegistroClientes> lista = new ArrayList<>();

   try (Scanner scanner = new Scanner(new File(rutaArchivo))) {
       while (scanner.hasNextLine()) {
            String linea = scanner.nextLine().trim();
            String[] datos = linea.split(",");

            if (datos.length == 10) {
                String codigo = datos[0];
                String nombres = datos[1];
                String apellidos = datos[2];
                String dni = datos[3];
                String correo = datos[4];
                String telefono = datos[5];
                int edad = Integer.parseInt(datos[6]);
                String sexo = datos[7];
                String servicio = datos[8];
                String ruta = datos[9];

                RegistroClientes clientes = new RegistroClientes(
                    codigo, nombres, apellidos, dni, correo,
                    telefono, edad, sexo, servicio, ruta
                );

                lista.add(clientes);
            }
        }
    } catch (IOException | NumberFormatException e) {
        System.out.println("Error al leer clientes: " + e.getMessage());
    }

    return lista;
    }
    
        // Método para actualizar un empleado por su código
    public boolean actualizarCliente(RegistroClientes nuevoCliente) {
        ArrayList<RegistroClientes> clientes = obtenerClientes();
        boolean actualizado = false;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCodigo_c().equals(nuevoCliente.getCodigo_c())) {
                clientes.set(i, nuevoCliente);
                actualizado = true;
                break;
            }
        }

        if (actualizado) {
            guardarClientes(clientes);
        }

        return actualizado;
    }

    //Método para sobrescribir el archivo con la lista actualizada
    private void guardarClientes(ArrayList<RegistroClientes> clientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (RegistroClientes cli : clientes) {
                String linea =   String.join(",",
                cli.getCodigo_c(),
                cli.getNombres(),
                cli.getApellidos(),
                cli.getDni(),
                cli.getCorreo(),
                cli.getTelefono(),
                String.valueOf(cli.getEdad()),
                cli.getSexo(),
                cli.getServicio(),   
                cli.getRuta()        
                
            );
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar clientes: " + e.getMessage());
        }
    }
    
    public static ArrayList<String> obtenerResumenRutas() {
        ArrayList<String> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("rutas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 5) {
                    String salida = datos[3].trim();
                    String llegada = datos[4].trim();
                    String resumen = salida + " - " + llegada;

                    if (!lista.contains(resumen)) {
                        lista.add(resumen); // Evita duplicados
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer rutas.txt: " + e.getMessage());
        }
        return lista;
    }

}

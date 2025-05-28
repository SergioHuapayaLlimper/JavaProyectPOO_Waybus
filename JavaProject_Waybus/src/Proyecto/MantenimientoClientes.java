//Elaborado por el Grupo 04
package Proyecto;

import java.io.BufferedWriter;
import java.io.File;
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

            if (datos.length == 8) {
                String codigo = datos[0];
                String nombres = datos[1];
                String apellidos = datos[2];
                String dni = datos[3];
                String correo = datos[4];
                String telefono = datos[5];
                int edad = Integer.parseInt(datos[6]);
                String sexo = datos[7];

                RegistroClientes clientes = new RegistroClientes(
                    codigo, nombres, apellidos, dni, correo,
                    telefono, edad, sexo
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
            if (clientes.get(i).getCodigo().equals(nuevoCliente.getCodigo())) {
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
                String linea = String.join(",",
                    cli.getCodigo(),
                    cli.getNombres(),
                    cli.getApellidos(),
                    cli.getDni(),
                    cli.getCorreo(),
                    cli.getTelefono(),
                    String.valueOf(cli.getEdad()),
                    cli.getSexo()
                );
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar clientes: " + e.getMessage());
        }
    }

}

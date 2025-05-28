//Elaborado por el Grupo 04
package Proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//Clase para manejar operaciones de los Empleados
public class MantenimientoEmpleados {
    private ArrayList<RegistroEmpleados> listregistroemple;
    
    public MantenimientoEmpleados(){
        listregistroemple = new ArrayList<>();
    }
    
    //Agrega clientes a la lista
    public void AgregarEmpleado(RegistroEmpleados registroemple){
        listregistroemple.add(registroemple);
    }
    
    public ArrayList<RegistroEmpleados> getListaRegistroEmpleadoses(){
        return listregistroemple;
    }
    
        private final String rutaArchivo = "usuarios.txt";//Ruta del archivo
    
        //Método para obtener empleados desde archivo.txt
    public ArrayList<RegistroEmpleados> obtenerEmpleados() {
        ArrayList<RegistroEmpleados> lista = new ArrayList<>();

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
                    String oficina = datos[6];
                    String cargo = datos[7];
                    int edad = Integer.parseInt(datos[8]);
                    String sexo = datos[9];

                    RegistroEmpleados empleado = new RegistroEmpleados(
                        codigo, nombres, apellidos, dni, correo,
                        telefono, oficina, cargo, edad, sexo
                    );

                    lista.add(empleado);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer empleados: " + e.getMessage());
        }

        return lista;
    }
    
        // Método para actualizar un empleado por su código
    public boolean actualizarEmpleado(RegistroEmpleados nuevoEmpleado) {
        ArrayList<RegistroEmpleados> empleados = obtenerEmpleados();
        boolean actualizado = false;

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getCodigo().equals(nuevoEmpleado.getCodigo())) {
                empleados.set(i, nuevoEmpleado);
                actualizado = true;
                break;
            }
        }

        if (actualizado) {
            guardarEmpleados(empleados);
        }

        return actualizado;
    }

    //Método para sobrescribir el archivo con la lista actualizada
    private void guardarEmpleados(ArrayList<RegistroEmpleados> empleados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (RegistroEmpleados emp : empleados) {
                String linea = String.join(",",
                    emp.getCodigo(),
                    emp.getNombres(),
                    emp.getApellidos(),
                    emp.getDni(),
                    emp.getCorreo(),
                    emp.getTelefono(),
                    emp.getOficina(),
                    emp.getCargo(),
                    String.valueOf(emp.getEdad()),
                    emp.getSexo()
                );
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar empleados: " + e.getMessage());
        }
    }
}


package Proyecto;

import java.io.*;
import java.util.ArrayList;

public class ArchivoEmpleado {

    private final String rutaArchivo = "usuarios.txt";

    // Método para obtener todos los empleados
    public ArrayList<RegistroEmpleados> obtenerEmpleados() {
        ArrayList<RegistroEmpleados> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 10) {
                    try {
                        RegistroEmpleados emp = new RegistroEmpleados(
                            datos[0], // código
                            datos[1], // nombres
                            datos[2], // apellidos
                            datos[3], // dni
                            datos[4], // correo
                            datos[5], // teléfono
                            datos[6], // oficina
                            datos[7], // cargo
                            datos[9], // sexo
                            Integer.parseInt(datos[8]) // edad
                        );
                        lista.add(emp);
                    } catch (NumberFormatException e) {
                        System.out.println("Error al convertir edad en línea: " + linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
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

    // Método para sobrescribir el archivo con la lista actualizada
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

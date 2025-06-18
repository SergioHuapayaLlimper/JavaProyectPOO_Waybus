package Proyecto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MantenimientoLogistica {

    // Método para obtener la fecha y hora actuales
    public static String obtenerFechaYHora() {
        // Obtener la fecha y hora actuales
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd (HH:mm:ss)");
        return ahora.format(formatter); // Devolver la fecha y hora en el formato deseado
    }

    // Método para guardar un objeto en el archivo objetos.txt
    public static void guardarOActualizarObjeto(Logistica nuevoObjeto) {
        ArrayList<Logistica> listaObjetos = new ArrayList<>();
        boolean actualizado = false;

        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String codigo = partes[0].trim();
                    String fecha = partes[1].trim();
                    String objeto = partes[2].trim();
                    int cantidad = Integer.parseInt(partes[3].trim());
                    String area = partes[4].trim();

                    if (codigo.equalsIgnoreCase(nuevoObjeto.getCodigo().trim()) &&
                        objeto.equalsIgnoreCase(nuevoObjeto.getObjeto().trim())) {

                        // 🔁 Si ya existe el código y nombre, actualiza la cantidad
                        int nuevaCantidad = cantidad + nuevoObjeto.getCantidad();
                        listaObjetos.add(new Logistica(codigo, fecha, objeto, nuevaCantidad, area));
                        actualizado = true;

                    } else {
                        // 🔁 Agrega sin cambios
                        listaObjetos.add(new Logistica(codigo, fecha, objeto, cantidad, area));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Si no se actualizó ningún objeto, agregar el nuevo como línea nueva
        if (!actualizado) {
            listaObjetos.add(nuevoObjeto);
        }

        // Reescribir todo el archivo
        try (PrintWriter pw = new PrintWriter(new FileWriter("objetos.txt"))) {
            for (Logistica obj : listaObjetos) {
                pw.println(obj.getCodigo() + "," + obj.getFecha() + "," + obj.getObjeto() + "," + obj.getCantidad() + "," + obj.getArea());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
    
    public static void cargarDatos(DefaultTableModel modelo) {
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Asegúrate de que cada dato esté separado por una coma
                String[] datos = linea.split(","); // Usa la coma como delimitador

                // Verificar si la línea contiene la cantidad esperada de columnas
                if (datos.length == 5) {
                    modelo.addRow(datos); // Agregar los datos leídos a la tabla
                } else {
                    System.out.println("Línea incorrecta en el archivo: " + linea); // Manejo de líneas incorrectas
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Método para cargar los códigos desde el archivo objetos.txt en el ComboBox
    public static void cargarCodigos(JComboBox<String> cbmCodigo) {
        // Limpiar el ComboBox antes de llenarlo
        cbmCodigo.removeAllItems();
        cbmCodigo.addItem("Selecciona un código"); // Opción predeterminada

        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                cbmCodigo.addItem(datos[0]); // Agregar el código al ComboBox
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarCodigosEdicion(JComboBox<String> cbmCodigo) {
        cbmCodigo.removeAllItems();
        cbmCodigo.addItem("Selecciona un código");

        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 1) {
                    System.out.println("Cargando código para edición: " + datos[0]); // Consola
                    cbmCodigo.addItem(datos[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
    
    public static void editarObjeto(Logistica objetoEditado) {
        ArrayList<Logistica> listaObjetos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String codigo = partes[0];
                    String fecha = partes[1];
                    String objeto = partes[2];
                    int cantidad = Integer.parseInt(partes[3]);
                    String area = partes[4];

                    if (codigo.equals(objetoEditado.getCodigo())) {
                        listaObjetos.add(objetoEditado); // Se reemplaza con los nuevos datos
                    } else {
                        listaObjetos.add(new Logistica(codigo, fecha, objeto, cantidad, area));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer los datos: " + e.getMessage());
            return;
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("objetos.txt"))) {
            for (Logistica obj : listaObjetos) {
                pw.println(obj.getCodigo() + "," + obj.getFecha() + "," + obj.getObjeto() + "," + obj.getCantidad() + "," + obj.getArea());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
    
    public static boolean objetoExisteConOtroCodigo(String codigo, String nombreObjeto) {
        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 3) {
                    String cod = partes[0].trim();
                    String nombre = partes[2].trim();

                    if (nombre.equalsIgnoreCase(nombreObjeto.trim()) && !cod.equalsIgnoreCase(codigo.trim())) {
                        // El objeto ya existe con otro código
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al validar objeto duplicado: " + e.getMessage());
        }
        return false;
    }

    public static Logistica buscarObjetoPorCodigo(String codigoBuscado) {
        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String codigo = partes[0].trim();
                    if (codigo.equalsIgnoreCase(codigoBuscado.trim())) {
                        String fecha = partes[1].trim();
                        String objeto = partes[2].trim();
                        int cantidad = Integer.parseInt(partes[3].trim());
                        String area = partes[4].trim();
                        return new Logistica(codigo, fecha, objeto, cantidad, area);
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al buscar objeto: " + e.getMessage());
        }
        return null;
    }

    public static void registrarEnvio(Logistica envio) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("envios.txt", true))) {
            String registro = envio.getCodigo() + "," + envio.getFecha() + "," +
                              envio.getObjeto() + "," + envio.getCantidad() + "," +
                              envio.getArea();
            writer.write(registro);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al registrar el envío: " + e.getMessage());
        }
    }
    
    public static boolean descontarCantidadObjeto(String codigo, int cantidadADescontar) {
        ArrayList<Logistica> lista = new ArrayList<>();
        boolean encontrado = false;
        boolean envioPosible = true;

        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String cod = partes[0].trim();
                    String fecha = partes[1].trim();
                    String nombre = partes[2].trim();
                    int cantidad = Integer.parseInt(partes[3].trim());
                    String area = partes[4].trim();

                    if (cod.equalsIgnoreCase(codigo)) {
                        if (cantidad == 0) {
                            JOptionPane.showMessageDialog(null,
                                "❌ No se puede realizar el envío. El objeto \"" + nombre + "\" no tiene stock.",
                                "Sin stock",
                                JOptionPane.ERROR_MESSAGE);
                            return false;
                        }

                        if (cantidadADescontar > cantidad) {
                            JOptionPane.showMessageDialog(null,
                                "❌ No hay suficiente stock para enviar " + cantidadADescontar + " unidades del objeto \"" + nombre + "\".",
                                "Stock insuficiente",
                                JOptionPane.ERROR_MESSAGE);
                            return false;
                        }

                        int nuevaCantidad = cantidad - cantidadADescontar;

                        if (nuevaCantidad == 0) {
                            JOptionPane.showMessageDialog(null,
                                "⚠ Stock agotado: el objeto \"" + nombre + "\" se ha quedado sin unidades.",
                                "Stock agotado",
                                JOptionPane.WARNING_MESSAGE);
                        } else if (nuevaCantidad <= 10) {
                            JOptionPane.showMessageDialog(null,
                                "⚠ Advertencia: el stock del objeto \"" + nombre + "\" ha bajado a " + nuevaCantidad + " unidades.",
                                "Stock bajo",
                                JOptionPane.WARNING_MESSAGE);
                        }

                        lista.add(new Logistica(cod, fecha, nombre, nuevaCantidad, area));
                        encontrado = true;

                    } else {
                        lista.add(new Logistica(cod, fecha, nombre, cantidad, area));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            return false;
        }

        // Guardar archivo solo si se encontró y se permitió enviar
        if (encontrado && envioPosible) {
            try (PrintWriter pw = new PrintWriter(new FileWriter("objetos.txt"))) {
                for (Logistica obj : lista) {
                    pw.println(obj.getCodigo() + "," + obj.getFecha() + "," + obj.getObjeto() + "," + obj.getCantidad() + "," + obj.getArea());
                }
            } catch (IOException e) {
                System.out.println("Error al guardar archivo: " + e.getMessage());
                return false;
            }
            return true;
        }

        return false;
    }
    
    public static void eliminarObjetoPorCodigo(String codigoAEliminar) {
        ArrayList<Logistica> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("objetos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String codigo = partes[0].trim();
                    if (!codigo.equalsIgnoreCase(codigoAEliminar)) {
                        String fecha = partes[1].trim();
                        String objeto = partes[2].trim();
                        int cantidad = Integer.parseInt(partes[3].trim());
                        String area = partes[4].trim();

                        lista.add(new Logistica(codigo, fecha, objeto, cantidad, area));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer archivo para eliminar: " + e.getMessage());
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("objetos.txt"))) {
            for (Logistica obj : lista) {
                pw.println(obj.getCodigo() + "," + obj.getFecha() + "," + obj.getObjeto() + "," + obj.getCantidad() + "," + obj.getArea());
            }
        } catch (IOException e) {
            System.out.println("Error al escribir archivo después de eliminar: " + e.getMessage());
        }
    }
}
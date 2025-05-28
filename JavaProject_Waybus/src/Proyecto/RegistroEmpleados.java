//Elaborado por el Grupo 04
package Proyecto;
// Clase para registrar datos de un empleado
public class RegistroEmpleados extends Persona {
    private String codigo_e;
    private String oficina;
    private String cargo;

    public RegistroEmpleados() {}

    // Constructor con todos los datos en el mismo orden del archivo
    public RegistroEmpleados(String codigo, String nombres, String apellidos, String dni, String correo, String telefono, String oficina, String cargo, int edad, String sexo ) {
        super(nombres, apellidos, dni, correo, telefono, edad, sexo);
        this.codigo_e = codigo;
        this.oficina = oficina;
        this.cargo = cargo;
    }
    
    // Getters y Setters propios
    public String getCodigo_e() {
        return codigo_e;
    }

    public void setCodigo_e(String codigo_e) {
        this.codigo_e = codigo_e;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

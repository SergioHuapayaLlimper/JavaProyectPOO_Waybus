package Proyecto;

public class RegistroEmpleados extends Persona {
    private String codigo;
    private String oficina;
    private String cargo;

    public RegistroEmpleados() {}

    // Constructor con todos los datos en el mismo orden del archivo
    public RegistroEmpleados(String codigo, String oficina, String cargo, String nombres, String apellidos, String dni, String correo, String telefono, int edad, String sexo) {
        super(nombres, apellidos, dni, correo, telefono, edad, sexo);
        this.codigo = codigo;
        this.oficina = oficina;
        this.cargo = cargo;
    }
    
    // Getters y Setters propios
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

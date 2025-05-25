package Proyecto;

public class RegistroClientes extends Persona {

    private String Codigo;

    public RegistroClientes(String Codigo, String nombres, String apellidos, String dni, String correo, String telefono, int edad, String sexo) {
        super(nombres, apellidos, dni, correo, telefono, edad, sexo);
        this.Codigo = Codigo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
}

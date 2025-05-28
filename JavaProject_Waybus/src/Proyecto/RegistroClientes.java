//Elaborado por el Grupo 04
package Proyecto;

// Clase para registrar datos de un cliente
public class RegistroClientes extends Persona {

    //Atributo
    private String Codigo;
    //constructor
    public RegistroClientes(String Codigo, String nombres, String apellidos, String dni, String correo, String telefono, int edad, String sexo) {
        super(nombres, apellidos, dni, correo, telefono, edad, sexo);
        this.Codigo = Codigo;
    }
    //Getter y Setter
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
}

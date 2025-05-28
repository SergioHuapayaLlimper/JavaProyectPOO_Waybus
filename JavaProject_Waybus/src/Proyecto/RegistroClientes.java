//Elaborado por el Grupo 04
package Proyecto;

// Clase para registrar datos de un cliente
public class RegistroClientes extends Persona {

    //Atributo
    private String Codigo_c;
    //constructor
    public RegistroClientes(String Codigo, String nombres, String apellidos, String dni, String correo, String telefono, int edad, String sexo) {
        super(nombres, apellidos, dni, correo, telefono, edad, sexo);
        this.Codigo_c = Codigo;
    }
    //Getter y Setter
    public String getCodigo_c() {
        return Codigo_c;
    }

    public void setCodigo_c(String Codigo_c) {
        this.Codigo_c = Codigo_c;
    }
    
}

//Elaborado por el Grupo 04
package Proyecto;

// Clase para registrar datos de un cliente
public class RegistroClientes extends Persona {

    //Atributo
    private String Codigo_c;
    private String servicio; 
    private String ruta; 
    //constructor
    
    public RegistroClientes(String Codigo_c, String nombres, String apellidos, String dni, String correo, String telefono, int edad, String sexo, String servicio, String ruta) {
        super(nombres, apellidos, dni, correo, telefono, edad, sexo);
        this.Codigo_c = Codigo_c;
        this.servicio = servicio;
        this.ruta = ruta;
    }
    //Getter y Setter
    public String getCodigo_c() {
        return Codigo_c;
    }

    public void setCodigo_c(String Codigo_c) {
        this.Codigo_c = Codigo_c;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
}

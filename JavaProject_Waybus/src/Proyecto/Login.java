package Proyecto;
//Clase que representa el login del usuario
public class Login {
    //Atributos
    private String usuario;
    private String contraseña;
    //Constructor
    public Login(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public Login(){
    }
    //Metodo getter y setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    } 
}

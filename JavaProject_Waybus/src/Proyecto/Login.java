package Proyecto;

public class Login {
    private String usuario;
    private String contraseña;

    public Login(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public Login(){
    }

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

package Proyecto;

public class Logistica {
    
    private String codigo;
    private String fecha;
    private String objeto;
    private int cantidad;
    private String area;

    // Constructor
    public Logistica(String codigo, String fecha, String objeto, int cantidad, String area) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.objeto = objeto;
        this.cantidad = cantidad;
        this.area = area;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObjeto() {
        return objeto; 
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

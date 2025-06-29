package Proyecto;

public class Buses {
    private String placa;
    private String modelo;
    private String marca;
    private String estado;
    private int usos;
    private int cantidadAsientos;

    public Buses(String placa, String modelo, String marca, String estado, int usos, int cantidadAsientos) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.estado = estado;
        this.usos = usos;
        this.cantidadAsientos = cantidadAsientos;
    }
    
    public Buses(){
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = usos;
        actualizarEstado();
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    private void actualizarEstado() {
        if (usos > 10) {
            estado = "Fuera de servicio";
        } else if (usos > 4) {
            estado = "En revisión";
        } else {
            estado = "Operativo";
        }
    }
}


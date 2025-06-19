package Proyecto;

public class Buses {
    private String placa;
    private String modelo;
    private String marca;
    private String estado;
    private int usos;

    public Buses(String placa, String modelo, String marca, String estado, int usos) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.estado = estado;
        this.usos = usos;
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
    }
}


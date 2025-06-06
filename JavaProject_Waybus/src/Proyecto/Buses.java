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

    // Convierte el objeto a una línea para guardar en el archivo .txt
    @Override
    public String toString() {
        return placa + ";" + modelo + ";" + marca + ";" + estado + ";" + usos;
    }

    // Crea un objeto Bus a partir de una línea del archivo .txt
    public static Buses fromString(String linea) {
        String[] p = linea.split(";");
        return new Buses(p[0], p[1], p[2], p[3], Integer.parseInt(p[4]));
    }
}


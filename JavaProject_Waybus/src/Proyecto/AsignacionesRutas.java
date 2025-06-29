package Proyecto;

public class AsignacionesRutas {
    private String fecha, hora, origen, destino;
    private Buses bus;

    public AsignacionesRutas(String fecha, String hora, String origen, String destino, Buses bus) {
        this.fecha = fecha;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.bus = bus;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public Buses getBus() { return bus; }
}

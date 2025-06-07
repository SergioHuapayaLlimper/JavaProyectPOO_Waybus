package Proyecto;

public class Rutas {

    private String fechaEmbarque;
    private String horarioEmbarque;
    private String lugarPartida;
    private String lugarLlegada;

    // Constructor
    public Rutas(String fechaEmbarque, String horarioEmbarque, String lugarPartida, String lugarLlegada) {
        this.fechaEmbarque = fechaEmbarque;
        this.horarioEmbarque = horarioEmbarque;
        this.lugarPartida = lugarPartida;
        this.lugarLlegada = lugarLlegada;
    }

    // Getters y setters
    public String getFechaEmbarque() {
        return fechaEmbarque;
    }

    public void setFechaEmbarque(String fechaEmbarque) {
        this.fechaEmbarque = fechaEmbarque;
    }

    public String getHorarioEmbarque() {
        return horarioEmbarque;
    }

    public void setHorarioEmbarque(String horarioEmbarque) {
        this.horarioEmbarque = horarioEmbarque;
    }

    public String getLugarPartida() {
        return lugarPartida;
    }

    public void setLugarPartida(String lugarPartida) {
        this.lugarPartida = lugarPartida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }
    
}

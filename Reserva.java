package Programacion.Herencias.ConsecionarioPareja;

public class Reserva {
    // Atributos
    private Vehiculo vAlquilado;
    private String fechaAlquiler;
    private int diasAlquilado;
    private Cliente alquilador;

    // Constructor
    public Reserva(Vehiculo vAlquilado, String fechaAlquiler, int diasAlquilado, Cliente alquilador) {
        this.vAlquilado = vAlquilado;
        this.fechaAlquiler = fechaAlquiler;
        this.diasAlquilado = diasAlquilado;
        this.alquilador = alquilador;
    }

    // Getters & Setters
    public Vehiculo getvAlquilado() {
        return vAlquilado;
    }

    public void setvAlquilado(Vehiculo vAlquilado) {
        this.vAlquilado = vAlquilado;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getDiasAlquilado() {
        return diasAlquilado;
    }

    public void setDiasAlquilado(int diasAlquilado) {
        this.diasAlquilado = diasAlquilado;
    }

    public Cliente getAlquilador() {
        return alquilador;
    }

    public void setAlquilador(Cliente alquilador) {
        this.alquilador = alquilador;
    }

}

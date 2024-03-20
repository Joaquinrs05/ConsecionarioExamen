package Programacion.Herencias.ConsecionarioPareja;

public class Furgon extends Vehiculo {
    // Atributos
    private float cargaMaxima;
    private int plazas;

    // Constructor

    public Furgon(String matricula, String modelo, String marca, float kms, float precioDia, String tipoMotor,
            float cargaMaxima, int plazas) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plazas = plazas;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}

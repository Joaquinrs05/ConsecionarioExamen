package Programacion.Herencias.ConsecionarioPareja;

public class Coche extends Vehiculo {
    // ATRIBUTOS
    private int plazas;
    private int puertas;
    private float volumenMaletero;
    private String tipoCoche;

    // CONSTRUCTOR
    public Coche(String matricula, String modelo, String marca, float kms, float precioDia, String tipoMotor,
            int plazas, int puertas, float volumenMaletero, String tipoCoche) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.plazas = plazas;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
        this.tipoCoche = tipoCoche;
    }

    // GETTERS & SETTERS
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getVolumenMaletero() {
        return volumenMaletero;
    }

    public void setVolumenMaletero(float volumenMaletero) {
        this.volumenMaletero = volumenMaletero;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

}

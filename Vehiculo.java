package Programacion.Herencias.ConsecionarioPareja;

public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String marca;
    protected float Kms;
    protected float precioDia;
    protected String tipoMotor;

    // constructor
    public Vehiculo(String matricula, String modelo, String marca, float kms, float precioDia, String tipoMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.Kms = kms;
        this.precioDia = precioDia;
        this.tipoMotor = tipoMotor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public float getKms() {
        return Kms;
    }

    public void setKms(float kms) {
        Kms = kms;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void actualizarKms(float kmExtra) {
        this.Kms += kmExtra;
    }

    public void actualizarPrecioDia() {
        this.precioDia *= 1.2f;
    }
}

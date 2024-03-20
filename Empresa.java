package Programacion.Herencias.ConsecionarioPareja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa {
    // Atributos
    private String nombreEmpresa;
    private ArrayList<Vehiculo> listavehiculo;
    private Map<String, Cliente> coleccionCLiente;
    private ArrayList<Reserva> listaReserva;

    // Constructor
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listavehiculo = new ArrayList<>();
        this.coleccionCLiente = new HashMap<>();
        this.listaReserva = new ArrayList<>();
    }
    // geters

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public ArrayList<Vehiculo> getListavehiculo() {
        return listavehiculo;
    }

    public Map<String, Cliente> getColeccionCLiente() {
        return coleccionCLiente;
    }

    public ArrayList<Reserva> getlistaReserva() {
        return listaReserva;
    }

    // Metodos add vehiculo y cliente

    public boolean addCliente(Cliente c) {
        if (c != null && !coleccionCLiente.containsKey(c.getDni())) {
            coleccionCLiente.put(c.getDni(), c);
            return true;
        }
        return false;
    }

    public boolean addVehiculo(Vehiculo v) {
        if (v != null) {
            for (Vehiculo unvehiculo : listavehiculo) {
                if (unvehiculo.getMatricula().equals(v.getMatricula())) {
                    return false;
                }
            }
            return listavehiculo.add(v);
        }
        return false;
    }

    public boolean addReserva(Reserva r) {
        if (r != null) {
            for (Reserva unaReserva : listaReserva) {
                if (unaReserva.getvAlquilado().getMatricula().equals(r.getvAlquilado().getMatricula())) {
                    return false;
                }
            }
            return listaReserva.add(r);
        }
        return false;
    }
}

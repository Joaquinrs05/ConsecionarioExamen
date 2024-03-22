package Programacion.Herencias.ConsecionarioPareja;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static String op, op2, op3, op4, op5;
    static float f1, f2;
    static int n1;
    static Empresa miEmpresa = new Empresa("Juakines");
    static Vehiculo tempVehiculo;
    static Cliente tempCliente;
    static Reserva tempReserva;

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "----------\na) Dar de alta un vehiculo\nb) Dar de alta un cliente\nc) Alquilar un vehiculo\nd) Listar vehiculos\ne) Devolver vehiculo\nPulse cualquier otra letra para salir\n----------");
            System.out.print("Eleccion: ");

            op = sc.nextLine();
            if (op.equalsIgnoreCase("a")) {

                tempVehiculo = crearVehiculo();
                miEmpresa.addVehiculo(tempVehiculo);
                System.out.println("-- Vehiculo creado dado de alta correctamente --\n");

            } else if (op.equalsIgnoreCase("b")) {

                tempCliente = crearCliente();
                miEmpresa.addCliente(tempCliente);
                System.out.println("-- Cliente dado de alta correctamente --\n");

            } else if (op.equalsIgnoreCase("c")) {

                tempReserva = crearReserva();
                miEmpresa.addReserva(tempReserva);
                System.out.println("-- Reserva creada correctamente --\n");

            } else if (op.equalsIgnoreCase("d")) {

                listarVehiculos();

            } else if (op.equalsIgnoreCase("e")) {

                System.out.print("Matricula: ");
                op = sc.nextLine();
                System.out.print("Kms Extra: ");
                f1 = Float.valueOf(sc.nextFloat());
                miEmpresa.devolverVehiculo(op, f1);

            } else {
                break;
            }
        }
    }

    public static Vehiculo crearVehiculo() {
        System.out.print("Matricula: ");
        op = sc.nextLine();
        System.out.print("Modelo: ");
        op2 = sc.nextLine();
        System.out.print("Marca: ");
        op3 = sc.nextLine();
        System.out.print("Kilometros: ");
        f1 = Float.valueOf(sc.nextLine());
        System.out.print("Precio por dia: ");
        f2 = Float.valueOf(sc.nextLine());
        System.out.print("Tipo de motor: ");
        op4 = sc.nextLine();

        return new Vehiculo(op, op2, op3, f1, f2, op4);
    }

    public static Cliente crearCliente() {
        System.out.print("Nombre: ");
        op = sc.nextLine();
        System.out.print("Apellidos: ");
        op2 = sc.nextLine();
        System.out.print("Mail: ");
        op3 = sc.nextLine();
        System.out.print("Telefono: ");
        op4 = sc.nextLine();
        System.out.print("DNI: ");
        op5 = sc.nextLine();
        System.out.print("Numero tarjeta: ");
        n1 = Integer.valueOf(sc.nextLine());

        return new Cliente(op, op2, op3, op4, op5, n1);
    }

    public static Reserva crearReserva() {
        System.out.print("Matricula del vehiculo a reservar: ");
        op = sc.nextLine();
        for (Vehiculo i : miEmpresa.getListavehiculo()) {
            if (i.getMatricula().equals(op)) {
                tempVehiculo = i;
            }
        }

        System.out.print("Fecha del alquiler: ");
        op = sc.nextLine();
        System.out.print("Dias alquilado: ");
        n1 = Integer.valueOf(sc.nextLine());

        System.out.print("DNI del cliente que alquila: ");
        op2 = sc.nextLine();
        tempCliente = miEmpresa.getColeccionCLiente().get(op2);

        return new Reserva(tempVehiculo, op, n1, tempCliente);
    }

    public static void listarVehiculos() {
        while (true) {
            System.out.print(
                    "Elige que listar:\na) Coche\nb) Furgon\nc)Camion\nPulsa cualquier otra letra para salir\nEleccion: ");
            op = sc.nextLine();

            if (op.equalsIgnoreCase("a")) {

                System.out.print("Plazas a buscar: ");
                op = sc.nextLine();
                System.out.print("Tipo de motor: ");
                op2 = sc.nextLine();

                for (Vehiculo i : miEmpresa.getListavehiculo()) {
                    if (i instanceof Coche) {

                    }
                }

            } else if (op.equalsIgnoreCase("b")) {

                System.out.print("Carga del furgon: ");
                op = sc.nextLine();
                System.out.print("Plazas a buscar: ");
                op2 = sc.nextLine();

            } else if (op.equalsIgnoreCase("c")) {

                System.out.print("Carga del camion: ");
                op = sc.nextLine();
                System.out.print("Longitud del camion: ");
                op2 = sc.nextLine();

            } else {
                break;
            }
        }
    }
}

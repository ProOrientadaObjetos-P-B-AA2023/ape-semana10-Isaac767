package paquete3;

import Paquete5.Persona;
import paquete2.Prestamo;


public class PrestamoAutomovil extends Prestamo {
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPagoPrestamo;

    public PrestamoAutomovil(Persona beneficiario, int tiempoMeses, String ciudad,
                             String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(beneficiario, tiempoMeses, ciudad);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        this.valorMensualPagoPrestamo = calcularValorMensualPagoPrestamo();
    }

    // Getters y Setters
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
        this.valorMensualPagoPrestamo = calcularValorMensualPagoPrestamo();
    }

    public double getValorMensualPagoPrestamo() {
        return valorMensualPagoPrestamo;
    }

    private double calcularValorMensualPagoPrestamo() {
        return valorAutomovil / getTiempoMeses();
    }

    @Override
    public String toString() {
        return super.toString() +
       ", Tipo de Automóvil: " + tipoAutomovil +
       ", Marca del Automóvil: " + marcaAutomovil +
       ", Garante 1: " + garante1.getNombre() + " " + garante1.getApellido() +
       ", Valor del Automóvil: " + String.format("%.2f", valorAutomovil) +
       ", Valor Mensual de Pago del Préstamo: " + String.format("%.2f", valorMensualPagoPrestamo);

    }
}

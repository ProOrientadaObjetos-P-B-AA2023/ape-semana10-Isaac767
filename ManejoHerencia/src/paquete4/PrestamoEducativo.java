
package paquete4;

import Paquete5.InstitucionEducativa;
import Paquete5.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPagoPrestamo;

    public PrestamoEducativo(Persona beneficiario, int tiempoMeses, String ciudad,
                             String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoMeses, ciudad);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        this.valorMensualPagoPrestamo = (valorCarrera / tiempoMeses) - (0.1 * (valorCarrera / tiempoMeses));
    }

    // Getters y Setters
    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensualPagoPrestamo() {
        return valorMensualPagoPrestamo;
    }

    public void setValorMensualPagoPrestamo(double valorMensualPagoPrestamo) {
        this.valorMensualPagoPrestamo = valorMensualPagoPrestamo;
    }

    @Override
    public String toString() {
        return super.toString() +
            ", Nivel de Estudio: " + nivelEstudio +
            ", Centro Educativo: " + centroEducativo.getNombre() +
            ", Valor de la Carrera: " + String.format("%.2f", valorCarrera) +
            ", Valor Mensual de Pago del Préstamo de la Carrera: " + String.format("%.2f", valorMensualPagoPrestamo);
   }
}

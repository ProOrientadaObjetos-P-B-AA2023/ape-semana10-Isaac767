
package paquete2;

import Paquete5.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

public class Prestamo {
    private Persona beneficiario;
    private int tiempoMeses;
    private String ciudad;

    public Prestamo(Persona beneficiario, int tiempoMeses, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoMeses = tiempoMeses;
        this.ciudad = ciudad;
    }

    // Getters y Setters
    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoMeses() {
        return tiempoMeses;
    }

    public void setTiempoMeses(int tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toLowerCase(); // Convertir la ciudad a minúscula
    }

    @Override
    public String toString() {
    String beneficiarioStr;
    
    if (this instanceof PrestamoAutomovil) {
        beneficiarioStr = "Beneficiario del Automóvil: " + ((PrestamoAutomovil) this).getBeneficiario().getNombre() + " " + ((PrestamoAutomovil) this).getBeneficiario().getApellido();
    } else if (this instanceof PrestamoEducativo) {
        beneficiarioStr = "Beneficiario de la Institución: " + ((PrestamoEducativo) this).getBeneficiario().getNombre() + " " + ((PrestamoEducativo) this).getBeneficiario().getApellido();
    } else {
        beneficiarioStr = "Beneficiario: " + beneficiario.getNombre() + " " + beneficiario.getApellido();
    }
    
    return beneficiarioStr +
            ", Tiempo de Préstamo en Meses: " + tiempoMeses +
            ", Ciudad del Préstamo: " + ciudad;
}
}

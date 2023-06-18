
package paquete1;

import Paquete5.InstitucionEducativa;
import Paquete5.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

public class Ejecutor {
    public static void main(String[] args) {
        List<Prestamo> listaPrestamos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú");
            System.out.println("1. Ingresar préstamo de tipo PrestamoAutomovil");
            System.out.println("2. Ingresar préstamo de tipo PrestamoEducativo");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar datos del préstamo de tipo PrestamoAutomovil.");

                    System.out.print("Ingrese el nombre del beneficiario del automóvil: ");
                    String nombreBeneficiarioAutomovil = scanner.next();
                    System.out.print("Ingrese el apellido del beneficiario del automóvil: ");
                    String apellidoBeneficiarioAutomovil = scanner.next();
                    System.out.print("Ingrese el username del beneficiario del automóvil: ");
                    String usernameBeneficiarioAutomovil = scanner.next();
                    Persona beneficiarioAutomovil = new Persona(nombreBeneficiarioAutomovil, apellidoBeneficiarioAutomovil, usernameBeneficiarioAutomovil);

                    System.out.print("Ingrese el tiempo de préstamo en meses: ");
                    int tiempoMesesAutomovil = scanner.nextInt();

                    System.out.print("Ingrese la ciudad del préstamo: ");
                    String ciudadAutomovil = scanner.next();

                    System.out.print("Ingrese el tipo de automóvil: ");
                    String tipoAutomovil = scanner.next();
                    System.out.print("Ingrese la marca del automóvil: ");
                    String marcaAutomovil = scanner.next();

                    System.out.print("Ingrese el nombre del garante 1: ");
                    String nombreGarante1 = scanner.next();
                    System.out.print("Ingrese el apellido del garante 1: ");
                    String apellidoGarante1 = scanner.next();
                    System.out.print("Ingrese el username del garante 1: ");
                    String usernameGarante1 = scanner.next();
                    Persona garante1 = new Persona(nombreGarante1, apellidoGarante1, usernameGarante1);

                    System.out.print("Ingrese el valor del automóvil: ");
                    double valorAutomovil = scanner.nextDouble();

                    PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(beneficiarioAutomovil, tiempoMesesAutomovil,
                            ciudadAutomovil, tipoAutomovil, marcaAutomovil, garante1, valorAutomovil);

                    listaPrestamos.add(prestamoAutomovil);
                    System.out.println("Préstamo de tipo PrestamoAutomovil ingresado exitosamente.");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Ingresar datos del préstamo de tipo PrestamoEducativo.");

                    System.out.print("\nIngrese el nombre del beneficiario de la institución educativa: ");
                    String nombreBeneficiarioEducativo = scanner.next();
                    System.out.print("Ingrese el apellido del beneficiario de la institución educativa: ");
                    String apellidoBeneficiarioEducativo = scanner.next();
                    System.out.print("Ingrese el username del beneficiario de la institución educativa: ");
                    String usernameBeneficiarioEducativo = scanner.next();
                    Persona beneficiarioEducativo = new Persona(nombreBeneficiarioEducativo, apellidoBeneficiarioEducativo, usernameBeneficiarioEducativo);

                    System.out.print("Ingrese el tiempo de préstamo en meses: ");
                    int tiempoMesesEducativo = scanner.nextInt();

                    System.out.print("Ingrese la ciudad del préstamo: ");
                    String ciudadEducativo = scanner.next();

                    System.out.print("Ingrese el nivel de estudio: ");
                    String nivelEstudio = scanner.next();

                    System.out.print("Ingrese el nombre de la institución educativa: ");
                    String nombreInstitucion = scanner.nextLine();
                    nombreInstitucion = scanner.nextLine(); // Consumir el carácter de nueva línea pendiente
                    System.out.print("Ingrese las siglas de la institución educativa: ");
                    String siglasInstitucion = scanner.next();
                    InstitucionEducativa institucionEducativa = new InstitucionEducativa(nombreInstitucion, siglasInstitucion);

                    System.out.print("Ingrese el valor de la carrera: ");
                    double valorCarrera = scanner.nextDouble();

                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(beneficiarioEducativo, tiempoMesesEducativo,
                            ciudadEducativo, nivelEstudio, institucionEducativa, valorCarrera);

                    listaPrestamos.add(prestamoEducativo);
                    System.out.println("Préstamo de tipo PrestamoEducativo ingresado exitosamente.");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    System.out.println();
                    break;
            }
        } while (opcion != 3);

        System.out.println("Lista de préstamos ingresados:");
        for (Prestamo prestamo : listaPrestamos) {
            System.out.println(prestamo.toString());
        }
    }
}


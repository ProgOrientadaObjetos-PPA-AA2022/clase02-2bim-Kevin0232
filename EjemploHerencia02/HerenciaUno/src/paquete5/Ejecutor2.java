/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        
        System.out.print("Ingrese el nombre del Estudiante: ");
        String nombre = leer.nextLine();
        System.out.println(" ");
        System.out.print("Ingrese el apellido del Estudiante: ");
        String apellido = leer.nextLine();
        System.out.println("");
        System.out.print("Ingrese la identificacion del Estudiante: ");
        String identificacion = leer.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese la edad del Estudiante: ");
        int edad = leer.nextInt();
        System.out.println("");
        
        System.out.print("Ingrese el numero de creditos del Estudiante: ");
        int numeroCreditos = leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese el costo de los creditos: ");
        double costoCreditos = leer.nextDouble();
        System.out.println("");
        
        
        EstudiantePresencial ep = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numeroCreditos, costoCreditos);
        ep.calcularMatriculaPresencial();
        
        
        System.out.println(ep);
    }
}

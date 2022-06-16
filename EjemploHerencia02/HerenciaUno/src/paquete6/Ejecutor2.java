/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;
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
        String cadena = "Lista de Estudiantes:\n";
        int opc = 0;
        do{
            menu();
            System.out.print("Seleccione una opcion: ");
            opc = leer.nextInt();
            leer.nextLine();
            // ----------------------------------------------------------------
            if(opc >1 || opc<0){
                System.out.println("Ha seleccionado un numero fuera de rango");
                opc =0;
            }else{
                if(opc ==1){

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

                    cadena = String.format("%s"
                            + "%s\n",cadena ,ep);
                }
            }
        }while(opc !=0);
        System.out.printf("%s\n", cadena);
    }
    public static void menu(){
        System.out.println("----------------------------");
        System.out.println("(1) Ingresar un nuevo Estudiante");
        System.out.println("(0) Salir del programa");
        System.out.println("----------------------------");
    }
}

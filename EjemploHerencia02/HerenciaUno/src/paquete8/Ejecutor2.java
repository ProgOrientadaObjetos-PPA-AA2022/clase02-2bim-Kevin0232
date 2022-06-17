/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "RENÉ";
        String apellido = "ELIZALDE";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        EstudiantePresencial ep = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);
        
        ep.calcularMatriculaPresencial();
        
        System.out.println(ep);
    }
}

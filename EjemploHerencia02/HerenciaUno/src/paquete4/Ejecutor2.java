/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        //1. Crear y presentar un objeto de tipo estudiante Presencial
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudiantePresencial ep = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        ep.establecerNumeroCreditos(5);
        ep.establecerCostoCredito(60.3);
        ep.calcularMatriculaPresencial();
        
        
        System.out.println(ep);
    }
}

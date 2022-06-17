/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author kevin
 */
public class EstudiantePresencial extends Estudiante{
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    // Constructor
    public EstudiantePresencial(String n, String ap, String iden, int e, int nc, double cc){
        super(ap, iden, e);
        establecerNombresEstudiante(n);
        numeroCreditos = nc;
        costoCredito = cc;
    }
    public EstudiantePresencial(String ap, String iden, int e, int nc, double cc){
        super(ap, iden, e);
        numeroCreditos = nc;
        costoCredito = cc;
    }
    
    @Override
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom.toLowerCase(); // Juan.toUpperCase() >> JUAN 
    }
    public void establecerApellidoEstudiante(String a){
        apellidosEstudiante = a.toLowerCase(); // Juan.toUpperCase() >> JUAN 
    }
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo Creditos: %.2f\n"
                + "Número de Creditos: %d\n"
                + "Total Matricula Presencial: %.2f\n",
                nombresEstudiante,
                obtenerApellidoEstudiante(), // apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerCostoCredito(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    /*
    @Override
    public String toString(){
        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = cadena2 + "\n" + (i+1) + ")\n" +lista.get(i);
        }

        String cadena = String.format("Carrera: %s\n"
                + "Ciclo: %s\n"
                + "%s\n"
                + "El total de matriculas es: %.2f\n", 
                carrera,
                cadena2,
                ciclo,
                obtenerTotalMatriculasDistancia());
        return cadena;
    }*/
    @Override
    public String toString(){
        
        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = String.format("%s%d).\n%s",cadena2,(i+1), lista.get(i));
        }
        String cadena = String.format("Carrera: %s\n"
                + "Lista de Estudiantes: \n%s"
                + "Ciclo: %s\n"
                + "El total de matriculas es: %.2f\n", 
                carrera,
                cadena2,
                ciclo,
                obtenerTotalMatriculasDistancia());
        return cadena;
    }
    
}

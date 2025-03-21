/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Circulo {
    final float PI = (float) (Math.PI);
    private float radio;
/**
 *
 * Constructor vacío
 */
    public Circulo() {
    }
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros
 */
    public Circulo(float radio) {
        this.radio = radio;
    }
/**
 *
 * setter para el radio, recibe un float
 */
    public void setRadio(float radio) {
        if (radio>0){
        
            this.radio = radio;
            
        }else {
        
            System.out.println("El radio no puede ser negativo");
            this.radio = 0;
        }
        
    }
    /**
 *
 * getter para el radio, no recive nada, devuelve un float.
 */
    public float getRadio() {
        return radio;
    }

    /**
 *
 * Método para calular el perimetro, no recive nada, devuelve un float.
 */
    public float CalcularPerimetro(){
    
        return radio * 2 * PI;
        
    }
     /**
 *
 * Método para calular el area, no recive nada, devuelve un float.
 */   
    public float CalcularArea(){
    
        return (float) Math.pow(radio, 2) * PI;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class POOP5 {

    public static void main(String[] args) {
       
        System.out.println("Circulo 1 constructor vacio y set");
        Circulo circulo1 = new Circulo(2.0f);
        
        circulo1.setRadio(-2.0f);
       
        System.out.println("El perimetro es: " + circulo1.CalcularPerimetro());
        System.out.println("El area es: " + circulo1.CalcularArea());
        
        System.out.println("Circulo 2 constructor lleno");
        Circulo circulo2 = new Circulo(5.0f);
        
        System.out.println("El perimetro es: " + circulo2.CalcularPerimetro());
        System.out.println("El area es: " + circulo2.CalcularArea());
        
        System.out.println("Circulo 3 get");
        Circulo circulo3 = new Circulo(18.0f);
        
        System.out.println("El radio es: "+circulo3.getRadio());
        System.out.println("El perimetro es: " + circulo3.CalcularPerimetro());
        System.out.println("El area es: " + circulo3.CalcularArea());
        
        System.out.println("####### Pokeball #######");
        
        Pokemon rayquaza = new Pokemon("Rayquaza",150,90,90,150,95,105,100);
        Pokeball ultraball = new Pokeball("Ultra",50, null);
        System.out.println("####### Atrapar pokemon #######");
        ultraball.atraparPokemon(rayquaza);
        System.out.println("####### Mandar pokemon #######");
        ultraball.soltarPokemon();
        
    }
    
}

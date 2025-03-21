/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

import java.util.Random;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Pokeball {
    
    private String tipo;
    private float ratioCaptura;
    private Pokemon pokemon;
/**
 *
 * Constructor vacío.
 */
    public Pokeball() {
    }
/**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */
    public Pokeball(String tipo, float ratioCaptura, Pokemon pokemon) {
        this.tipo = tipo;
        this.ratioCaptura = ratioCaptura;
        this.pokemon = pokemon;
    }
/**
 *
 * setter para el tipo de pokeball, recibe un String, no devuelve nada.
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/**
 *
 * setter para el ratio de captura, recibe un float, no devuelve nada.
 */
    public void setRatioCaptura(float ratioCaptura) {
        this.ratioCaptura = ratioCaptura;
    }
/**
 *
 * setter para el pokemon, recibe un pokemon, no devuelve nada.
 */
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
/**
 *
 * getter para el tipo, no recibe nada, devuelve un String.
 */
    public String getTipo() {
        return tipo;
    }
/**
 *
 * getter para el ratio de captura, no recibe nada, devuelve un float.
 */
    public float getRatioCaptura() {
        return ratioCaptura;
    }
/**
 *
 * getter para el pokemon, no recibe nada, devuelve un Pokemon.
 */
    public Pokemon getPokemon() {
        return pokemon;
    }
/**
 *
 * Método para atrapar un pokemon, recive un Pokemon, no devuelve nada.
 */  
    public void atraparPokemon(Pokemon pokemon){
    
        Random random= new Random();
        
        int numAleatorio = random.nextInt(pokemon.getCaptura());
        
        if (numAleatorio <= ratioCaptura){
            
           this.pokemon = pokemon;
           System.out.println("Se atrapo al pokemon: "+pokemon.getNombre());
        }else{ 
        
            System.out.println("No se atrapo al pokemon intenta de nuevo!");
        }
    }
    /**
 *
 * Método para soltar al pokemon, no recibe nada, devuelve un Pokemon.
 */
    public Pokemon soltarPokemon(){
        
        if(this.pokemon!=null){
            System.out.println("Yo te elijo: "+this.pokemon.getNombre());
            return this.pokemon;
        }else{
        
            System.out.println("No hay pokemon!");
            return null;
        
        }
    }
}

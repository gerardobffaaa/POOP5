/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class Pokemon {
    
    private String nombre;
    private int ataque;
    private int defensa;
    private int defensaEsp;
    private int ataqueEsp;
    private int velocidad;
    private int vida;
    private int captura;
    
/**
 *
 * Constructor vacío.
 */    
   public Pokemon(){}
 /**
 *
 * Constructor lleno inicializa todos los atributos dependiedo que se ingrese en los parametros.
 */
   public Pokemon(String nombre,int atk, int def, int defesp, int atkesp,int 
   spd, int hp, int captura  ){
       
       this.nombre= nombre;
       ataque = atk;
       defensa = def;
       defensaEsp = defesp;
       ataqueEsp = atkesp;
       velocidad = spd;
       vida = hp;
       this.captura = captura;
   } 
/**
 *
 * setter para el nombre del pokemon, recibe un String.
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 *
 * setter para el ataque del pokemon, recibe un entero.
 */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
/**
 *
 * setter para la defensa del pokemon, recibe un entero.
 */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
/**
 *
 * setter para la defensa especial del pokemon, recibe un entero.
 */
    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }
/**
 *
 * setter para el ataque especial del pokemon, recibe un entero.
 */
    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }
/**
 *
 * setter para la velocidad del pokemon, recibe un entero.
 */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
/**
 *
 * setter para la vida del pokemon, recibe un entero.
 */
    public void setVida(int vida) {
        this.vida = vida;
    }
/**
 *
 * setter para la dificultad del pokemon, recibe un entero.
 */
    public void setCaptura(int captura) {
        this.captura = captura;
    }
/**
 *
 * getter para el nombre del pokemon, devuelve un String.
 */
    public String getNombre() {
        return nombre;
    }
/**
 *
 * getter para el ataque del pokemon, devuelve un entero.
 */
    public int getAtaque() {
        return ataque;
    }
/**
 *
 * getter para la defensa del pokemon, devuelve un entero.
 */
    public int getDefensa() {
        return defensa;
    }
/**
 *
 * getter para la defensa especial del pokemon, devuelve un entero.
 */
    public int getDefensaEsp() {
        return defensaEsp;
    }
/**
 *
 * getter para el ataque especial del pokemon, devuelve un entero.
 */
    public int getAtaqueEsp() {
        return ataqueEsp;
    }
/**
 *
 * getter para la velocidad del pokemon, devuelve un entero.
 */
    public int getVelocidad() {
        return velocidad;
    }
/**
 *
 * getter para la vida del pokemon, devuelve un entero.
 */
    public int getVida() {
        return vida;
    }
/**
 *
 * getter para la dificultad del pokemon, devuelve un entero.
 */
    public int getCaptura() {
        return captura;
    }
   
/**
 *
 * Metodo para el pokemon ataque, no recive nada, no devuelve nada.
 */  
   public void Atacar(){
   
       System.out.println(nombre +" te ha golpeado");
   }
/**
 *
 * Metodo para el pokemon use un objeto, no recive nada, no devuelve nada.
 */   
  public void UsarObjeto(){
       
       System.out.println(nombre +" ha usado un objeto");
       
   }
/**
 *
 * Metodo para que el pokemon se retire, no recive nada, no devuelve nada.
 */   
   public void Retirarse(){
   
        System.out.println(nombre +" se ha retirado");
   }
/**
 *
 * Metodo para que el pokemon se cure, no recive nada, no devuelve nada.
 */   
   public void Curarse(){
       
       System.out.println(nombre +" se ha curado");
       
   }
/**
 *
 * Metodo para el pokemon defienda, no recive nada, no devuelve nada.
 */   
  public void defenderse(){
   
       System.out.println(nombre +" se ha defendido");
   }
   
   
}

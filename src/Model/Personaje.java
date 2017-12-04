/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Modelo del personaje
 * @author Diego Moreno
 */



public class Personaje {
    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;
    private int fuerza;
    private int acSalud;
    private int acAtaque;
    private int acDefensa;
    private int acFuerza;
    /**
     * decalaramos los atributos
     * @param nombre
     * @param salud
     * @param ataque
     * @param defensa
     * @param fuerza 
     */
    
    public Personaje(String nombre, int salud, int ataque,int defensa, int fuerza){
        this.nombre=nombre;
        this.salud=salud;
        this.ataque=ataque;
        this.defensa=defensa;
        this.fuerza=fuerza;
        this.acSalud=salud;
        this.acAtaque=ataque;
        this.acDefensa=defensa;
        this.acFuerza=fuerza;
        
        //creamos los getters y los setters
    }

    /**
     * @return Nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establecemos el Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Salud inicial
     */
    public int getSalud() {
        return salud;
    }

    /**
     * @param salud Estblecemos la salud del personaje
     * 
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * @return Ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque Establecemos el ataque del personaje
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return Defensa del personaje
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa Establecemos la defensa del personaje
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return Fuerza del personaje
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza Establecemos la fuerza del personaje
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return Salud Actual
     */
    public int getAcSalud() {
        return acSalud;
    }

    /**
     * @param acSalud Se establece la salud actual del personaje
     */
    public void setAcSalud(int acSalud) {
        this.acSalud = acSalud;
    }

    /**
     * @return the Ataque Actual
     */
    public int getAcAtaque() {
        return acAtaque;
    }

    /**
     * @param acAtaque Se establece el ataque actual del personaje
     */
    public void setAcAtaque(int acAtaque) {
        this.acAtaque = acAtaque;
    }

    /**
     * @return DEfensa Actual
     */
    public int getAcDefensa() {
        return acDefensa;
    }

    /**
     * @param acDefensa Se establece la defensa actual del personaje     */
    public void setAcDefensa(int acDefensa) {
        this.acDefensa = acDefensa;
    }

    /**
     * @return the Fuerza actual
     */
    public int getAcFuerza() {
        return acFuerza;
    }

    /**
     * @param acFuerza Se establece la fuerza actual del personaje
     */
    public void setAcFuerza(int acFuerza) {
        this.acFuerza = acFuerza;
    }
}

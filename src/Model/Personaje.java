/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the salud
     */
    public int getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the acSalud
     */
    public int getAcSalud() {
        return acSalud;
    }

    /**
     * @param acSalud the acSalud to set
     */
    public void setAcSalud(int acSalud) {
        this.acSalud = acSalud;
    }

    /**
     * @return the acAtaque
     */
    public int getAcAtaque() {
        return acAtaque;
    }

    /**
     * @param acAtaque the acAtaque to set
     */
    public void setAcAtaque(int acAtaque) {
        this.acAtaque = acAtaque;
    }

    /**
     * @return the acDefensa
     */
    public int getAcDefensa() {
        return acDefensa;
    }

    /**
     * @param acDefensa the acDefensa to set
     */
    public void setAcDefensa(int acDefensa) {
        this.acDefensa = acDefensa;
    }

    /**
     * @return the acFuerza
     */
    public int getAcFuerza() {
        return acFuerza;
    }

    /**
     * @param acFuerza the acFuerza to set
     */
    public void setAcFuerza(int acFuerza) {
        this.acFuerza = acFuerza;
    }
}

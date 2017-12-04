/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
//importamos la clase Personaje del paquete Modelo
//esta es la parte donde se efectua el controlador 

import Model.Personaje;


/**
 *implementamos el ataque de los personajes
 * @author Diego Miguel Moreno Duran
 */
public class Ataque {
    
    //Creamos los objetos
    Personaje heroe;
    Personaje jefe;
    
    public Ataque(Personaje heroe, Personaje jefe){
        //declaramos los objetos
        
        this.heroe=heroe;
        this.jefe=jefe;
        
        
    }
    
    public String ataca(int select){
        String total= "";
        Personaje ataca, defiende;
        boolean sd = false;
        int selectPc = (int) ((Math.random()*5)+1);
        //determinamos quien inicia por ser el mas fuerte
        if (heroe.getAcFuerza()>jefe.getAcFuerza()){
            ataca=heroe;
            sd=true;
            defiende=jefe;
        }else{
            ataca=jefe;
            defiende=heroe;
            
        }
        total= atackSelect(ataca, defiende, sd?select:selectPc);
        if (defiende.getAcSalud()>0){
            total += "\n"+ atackSelect(defiende, ataca,!sd?select:selectPc );
            
        }
        return total;
    }
    private String atackSelect(Personaje ataca, Personaje defiende, int select){
        String total= "";
        switch (select){
            case 1:
                int lesion=(ataca.getAtaque()-defiende.getDefensa());
                lesion= lesion >0? lesion : 1;
                defiende.setAcSalud(defiende.getAcSalud()-lesion);
                total= ataca.getNombre()+"Ataco a "+ defiende.getNombre()+ " y este recibio "+lesion+" puntos de daño";
                break;
            case 2:
                lesion=(5+ ataca.getAtaque()-defiende.getDefensa());
                lesion= lesion >0? lesion : 1;
                defiende.setAcSalud(defiende.getAcSalud()-lesion);
                total= ataca.getNombre()+"Ataco a "+ defiende.getNombre()+ " y este recibio "+lesion+" puntos de daño";
                break;
            case 3:
                lesion=(10+ ataca.getAtaque()-defiende.getDefensa());
                lesion= lesion >0? lesion : 1;
                defiende.setAcSalud(defiende.getAcSalud()-lesion);
                total= ataca.getNombre()+"Ataco a "+ defiende.getNombre()+ " y este recibio "+lesion+" puntos de daño";
                break;
            default:
                total="No hubo ataque";
        }
        return total;
    }
}

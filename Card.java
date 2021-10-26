/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;

/**
 *
 * @author abii_
 */
public class Card {
    private String palo;
    private String color;
    private String valor;
    
    public Card(String palo, String color, String valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    
    public String getPalo(){
        return palo;
    }
   public void setPalo(String palo){
       this.palo = palo;
   }
   
   public String getValor(){
        return valor;
    }
   public void setValor(String valor){
       this.valor = valor;
   }
   
   
}


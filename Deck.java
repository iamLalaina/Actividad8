/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad10;
import java.util.List;
import java.util.*;
/**
 *
 * @author abii_
 */
public class Deck {
    private List<Card> card;
    private Integer numCard = 52;
    
   public List<Card> getCard(){
        return card;
    }
   public void setCard(List<Card> card){
       this.card = card;
   }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    public String mezclar(){
        Collections.shuffle(card);
        return "Mezclando... ";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author abii_
 */
public class Actividad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        String[] palo = {"Tréboles", "Corazones", "Picas", "Diamantes"};
       String[] valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
       Integer cont = 1;
       Deck deck = new Deck();
       deck.setCard(new ArrayList<Card>());
       for(int i = 0; i < palo.length; i++){
           for (int j = 0; j < valor.length; j++){
               Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
               deck.getCard().add(card);
              
           }
           
       }
       System.out.println("BIENVENIDO A POKER!");
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Mezclar deck ");
            System.out.println("2. Sacar una carta ");
            System.out.println("3. Carta al azar ");
            System.out.println("4. Generar una mano de 5 cartas ");
            System.out.println("0. Salir ");
        
            Scanner in = new Scanner(System.in);
            int opcion;
            System.out.print("Ingresa un numero: ");
            opcion = in.nextInt();
       switch(opcion){
           case 1: System.out.println("Se mezcló el Deck " + deck.mezclar());
           break;
           case 2: 
               System.out.println("Prmera: " + deck.getCard().get(0).getPalo() + " " + deck.getCard().get(0).getValor());
               System.out.println("Quedan: 51");
           break;
           case 3: 
                System.out.println("Al azar: " + deck.getCard().get(0).getPalo() + " " + deck.getCard().get(0).getValor());
                System.out.println("Quedan: 51");
           break;
           case 4: 
                System.out.println("Prmera: " + deck.getCard().get(0).getPalo() + " " + deck.getCard().get(0).getValor());
                System.out.println("Segunda: " + deck.getCard().get(0).getPalo() + " " + deck.getCard().get(1).getValor());
                System.out.println("Tercera: " + deck.getCard().get(0).getPalo() + " " + deck.getCard().get(2).getValor());
                System.out.println("Cuarta: " + deck.getCard().get(0).getPalo() + " " + deck.getCard().get(3).getValor());
                System.out.println("Quinta: " + deck.getCard().get(0).getPalo() + " " + deck.getCard().get(4).getValor());
                System.out.println("Quedan: 47");
                break;
           case 0: System.out.println("Salir");
           break;
           default: 
               System.out.println("Opción no valida"); 
       } return;
       };
       
       
     
     
    
     
    
    public static String getColor(String palo){
           if (palo.toLowerCase().equals("Picas")||palo.toLowerCase().equals("Tréboles")){
               return "negro";
           }
           if (palo.toLowerCase().equals("Corazones")||palo.toLowerCase().equals("Diamantes")){
               return "rojo";
           }
           return null;
    } 
    

    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Ryan Franco ID: 991787696
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random randomCard = new Random(); 
            c.setValue(randomCard.nextInt(13) +1);
            c.setSuit(Card.SUITS[randomCard.nextInt(4)]); 
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        

        Scanner scan = new Scanner(System.in); 
        
        
        System.out.println("Entere a card value from (1 - 13): "); 
        
        int input = scan.nextInt(); 
        
        System.out.println("Enter a suit (0-3 where 0 = hearts, 1= diamonds, 2=clubs, 3= spades: ");
        int inputSuit = scan.nextInt(); 
        String suit = Card.SUITS[inputSuit];
        

        
        for ( int i = 0; i < magicHand.length; i ++){
            if (magicHand[i].getValue() == input && magicHand[i].getSuit().equals(suit)){
                System.out.println("Your card is in magic hand !"); 
                return; 
            }
        }
       
          System.out.println("sorry your card is not in the magic hand ");
        
          
            magicHand[0].setValue(2);
            magicHand[0].setSuit("Clubs");

            magicHand[0].setValue(1);
            magicHand[0].setSuit("Diamonds");

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}

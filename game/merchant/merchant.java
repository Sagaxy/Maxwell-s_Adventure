package game.merchant;


import java.util.Scanner;

import game.character.Player;





public class merchant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("How many transport coins you have ?");
        int numCoins =sc.nextInt();
        System.out.println("where do you come from, and where are you going ? ");
        String comeFrom = sc.nextLine();
        String going = sc.nextLine();
        System.out.println("You want to exchange your coins for threshold in the jewel ?");
        boolean trade = sc.nextBoolean();
        
        if (numCoins < 5  && trade == true ){ 
            //Perde 1 moeda e ganha 1 de limiar na joia 
         }
        else if (numCoins < 5 && trade == false){    
            //Perde 1 moeda 
                }
        else if (numCoins < 5 && trade == true) {
            //Perde 1 moeda e ganha 2 de limiar na joia 
        }
        else if (numCoins < 5 && trade == false){
            //Ganha 2 moedas 
        }
        else if (numCoins >= 5 && trade == true){
            //Perde 3 moedas e ganha 2 de limiar na joia 
        }
        else if (numCoins >= 5 && trade == false){
            //Perde 2 moedas
        }
        else if (numCoins >= 5 && trade == true){
            //Perde 1 moeda e ganha 3 de limiar na joia 
        }
        else if (numCoins >= 5 && trade == false){
            //Perde 3 moedas 
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
}
}
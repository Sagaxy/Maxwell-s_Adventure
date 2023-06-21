package game.merchant;

import java.util.Scanner;

import game.character.Player;

public class Merchant {

        Scanner sc = new Scanner(System.in);
       
        public int manyCois() {
    		System.out.println("How many transport coins you have ?");
    		int numCoins =sc.nextInt();
    		try {
				if(numCoins == .getCoin()) {
		
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    			
    		return numCoins;    		
        	}
        public String whereFromGo() {
	        System.out.println("where do you come from? ");
	        String comeFrom = sc.nextLine();
	        System.out.println("Where are you going? ");
	        String going = sc.nextLine();
	        
	        System.out.println("You want to exchange your coins for threshold in the jewel ?(Y/N)");
        
        String trade = sc.next();
        
        trade.toUpperCase();
        
        if (numCoins < 5  && trade ){ 
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
}

sc.close();}}
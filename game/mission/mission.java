package game.mission;
import java.util.Scanner;

import game.character.Player;


public class mission {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Do you accept this mission ? ")
    x = sc.next();
    //Missão de Kingdom of Kalb 
    if (sc.next().equals("yes")){   
        Player.setCoin = +4 ;
        System.out.println("Go to the city of Grand Duchy of Smalia and receive the gloves of power ");
    
        //chegando em Grand Duchy, completando a missão 
        //coin + 2 
        //Power Threshold + 2 
    }
    else{
        System.out.println("OK! Have a good trip ");
    }
    //Missão de Defalsia
    if (sc.next().equals("yes")){   
        Player.setCoin = +6 ;
        System.out.println("Go to the city of Principality of Kasya and receive the boots of power ");
    
        //chegando em Principality of Kasya, completando a missão 
        //coin + 3 
        //Power Threshold + 1
    }
    else{
        System.out.println("OK! Have a good trip ");
    }
    //Missão de Venuse Empire 
    if (sc.next().equals("yes")){   
        Player.setCoin = +1 ;
        System.out.println("Go to Ubud and receive the Glory of the Returnees ");
    
        //chegando em Ubud, completando a missão 
        //coin + 10
        //Power Threshold - 4
    }
    else{
        System.out.println("OK! Have a good trip ");
    }

}


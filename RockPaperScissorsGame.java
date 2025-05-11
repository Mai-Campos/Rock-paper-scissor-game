import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.println("Introduzca su elección (roca, papel o tijeras)");
      String userChoice = in.nextLine();

      while (!userChoice.equals("roca" ) && !userChoice.equals("papel" ) && !userChoice.equals("tijeras") ) {
        System.out.println("Por favor introduzca uno de los valores aceptados (roca, papel o tijeras)");
        userChoice = in.nextLine();
    }
        Random random = new Random();
        int computerChoice = random.nextInt(3);
        String computerChoiceString;

        switch (computerChoice) {
            case 0:
                computerChoiceString = "roca";
                break;
        
            case 1:
                computerChoiceString = "papel";
                break;

            case 2:
                computerChoiceString = "tijeras";
                break;

            default:
                computerChoiceString = "";
                break;
        }
        
        System.out.println("Tu oponente saca " + computerChoiceString);

        if (userChoice.equals("roca") && computerChoiceString.equals("tijeras") || (userChoice.equals("papel") && computerChoiceString.equals("roca")) || (userChoice.equals("tijeras") && computerChoiceString.equals("papel"))) {
            System.out.println("¡Ganaste!");
            
        }else if (computerChoiceString.equals(userChoice)) {
            System.out.println("Empate!");
            
        }else{
            System.out.println("Perdiste!");
        }
            
        

    }
}

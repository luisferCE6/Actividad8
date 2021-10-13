/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8;

/**
 *
 * @author ferna
 */
import java.util.Scanner;

public class Actividad8 {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Deck op = new Deck();
        int x = 0;
        do {
            System.out.println("Poker \n" + "1 mezclar\n " + "2 Sacar carta\n " + "3 Carta alazar\n " + "4 mano de 5 cartas\n " + "5 salir\n ");
            x = entrada.nextInt();

            switch (x) {
                case 1:
                    op.shuffle();
                    break;
                case 2:
                    op.head();
                    break;
                case 3:
                    op.pick();
                    break;
                case 4:
                    op.hand();
                    break;
                default:
                    System.out.println("Gracias por jugar");
            }
        } while (x != 5);

    }
}

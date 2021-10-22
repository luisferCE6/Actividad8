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
        
        Deck op = new Deck();
        
        op.shuffle();
        op.head();      
        op.pick();
        op.hand();       
       
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lsanchezc9
 */
public class Cajero {

    public static void main(String[] args) throws InterruptedException {

        Random rnd = new Random();


        int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de usuarios"));

        Queue<Object> x = new LinkedList();

        for (int i = 0; i < val; i++) {
            x.add(i);
        }
        int total = 0;
        int time = 0;
        for (Iterator s = x.iterator(); s.hasNext();) {
            {
                time = rnd.nextInt(1000);
                Thread.sleep(time);
                total = total + time;

                System.out.println("El usuario " + x.remove() + " se demoro " + total + " Milisegundos");
            }

            System.out.println("++++++" + x.peek());
        }
    }
}

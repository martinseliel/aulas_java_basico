/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somas;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class SomaS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        x = sc.nextInt();

        if (x >= 1 && x <= 1000) {
            for (int i = 0; i < x; i++) {
                if (i % 2 != 0) {
                    System.out.println("Valor:" + i);
                }
            }
        } else {
            System.out.println("X não pode ser menor que 1 e não pode ser maior que mil");
        } // TODO code application logic here
    }

}

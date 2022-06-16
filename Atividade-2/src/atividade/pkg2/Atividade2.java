/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg2;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = 2, p2 = 3, p3 = 5, n = sc.nextInt();
        float x1 = 0, x2 = 0, x3 = 0, mp = 0;
        

        for (int  i = 0; i < n; i++) {
            System.out.println("Digite o primeiro caso: ");
            x1 = (float) sc.nextDouble();

            System.out.println("Digite o segundo caso: ");
            x2 = (float) sc.nextDouble();

            System.out.println("Digite o terceiro caso: ");
            x3 = (float) sc.nextDouble();

            mp = ((x1 * p1) + (x2 * p2) + (x3 * p3)) / (p1 + p2 + p3);
            System.out.println("media ponderada do caso " + i + "é: " + mp);
        }

    }
}

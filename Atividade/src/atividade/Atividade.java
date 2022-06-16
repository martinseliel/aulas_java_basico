/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;
import java.util.Scanner;
/**
 *
 * @author marti
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você deseja ler?");
        int n = sc.nextInt();
        int in = 0, out = 0;
        System.out.println("Agora insira os valores:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "º valor:");
            int input = sc.nextInt();
            if (input > 10 && input < 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println("in " + in + "\nout" + out);
        
       
    }

}

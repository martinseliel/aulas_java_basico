/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;
import java.util.Scanner;
/**
 *
 * @author marti
 */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b;
        
        System.out.printf("Informe o primeiro valor: ");
        a = ler.nextInt();//entrada de dados - lendo valor inteiro
        
        System.out.printf("Informe o segundo valor: ");
        b = ler.nextInt();// entrada de dados - lendo valor inteiro
        
        System.out.printf("\nResultado:\n");
        System.out.printf("%d + %d = %3d\n", a,b,(a + b));
        System.out.printf("%d - %d = %3d\n", a,b,(a - b));
        System.out.printf("%d * %d = %3d\n", a,b,(a * b));
        System.out.printf("%d / %d = %3d (divisao inteira)\n",a,b,(a / b));
        System.out.printf("%d / $d = %6.2f (divisao exata)\n",a,b,((double)a / b));
        
    }
}

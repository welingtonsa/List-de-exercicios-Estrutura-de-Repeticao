import java.util.Scanner;
/* Problema 12 "par_impar": Leia um valor inteiro N. Este valor será a quantidade de números inteiros que
 * serão lifos em seguida. Para cada valor lido, mostre uma mensagem dizendo se este valor lido é par ou ímpar, 
 * e também se é  positivo ou negativo. No caso do calor se igual a zwro(0), seu programa deverá imprimir
 * apenas nulo. 
 */
public class Problema12 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int usernInput, count;
       
        /** Entrada *********************************************/ 
        System.out.print("Quantos números você vai digitar? ");
        usernInput = input.nextInt();

        /** Saida e Calculos necessarios**************************/
        for (int i = 0; i < usernInput; i++) {
            System.out.print("Digite um mumero: ");
            count = input.nextInt();
            if (count == 0) {
                System.out.println("NULO");
            } else {
                if ((count % 2 ) == 0) {
                    System.out.print("PAR ");
                    if (count < 0) {
                        System.out.println("NEGATIVO");
                    } else {
                        System.out.println("POSITIVO");
                    }
                }
                else{
                    System.out.print("IMPAR ");
                    if (count < 0) {
                        System.out.println("NEGATIVO");
                    } else {
                        System.out.println("POSITIVO");
                    }
                }
            }
            
        }

       input.close();
    }
    
}

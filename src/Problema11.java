import java.util.Scanner;
/* Problema 01 "crescente": Leia uma quantidade indeterminada de duplas de valores inteiros 
 * X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados
 * em ordem crescemte ou decrescente. O programa deve finalizar quando forem digitados dois
 * valores iguais. 
 */
public class Problema11 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int userInpunt, numerosDentroIntervalo = 0, numerosForaIntervalo = 0, count;
      
        /** Entrada *********************************************/ 
        System.out.print("Quantos números você vai digitar? ");
        userInpunt = input.nextInt();
       
        /** Saida e Calculos necessarios**************************/
        for (int i = 0; i < userInpunt; i++) {
            System.out.print("Digite um numero: ");
            count = input.nextInt();
            if (count < 10 || count > 20) {
                numerosDentroIntervalo ++;
            } else {
                numerosForaIntervalo ++;
            }
        }
        System.out.printf("%d DENTRO\n%d FORA", numerosDentroIntervalo, numerosForaIntervalo);

       input.close();
    }
    
}

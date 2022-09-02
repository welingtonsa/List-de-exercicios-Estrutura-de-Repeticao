import java.util.Scanner;
/* Problema 01 "crescente": Leia uma quantidade indeterminada de duplas de valores inteiros 
 * X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados
 * em ordem crescemte ou decrescente. O programa deve finalizar quando forem digitados dois
 * valores iguais. 
 */
public class Problema01 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int numeroA, numeroB;
                 
        do {
            /** Entrada *********************************************/ 
            System.out.println("Digite dois números:");   
            numeroA = input.nextInt();
            numeroB = input.nextInt();

            /** Saida e Calculos necessarios**************************/
            if (numeroA > numeroB) {
                System.out.println("DECRESCENTE!");
            }
            if (numeroB > numeroA) {
                System.out.println("CRESCENTE!");
            }
        } while (numeroA != numeroB);   
       input.close();
    }
    
}

import java.util.Scanner;
/* Problema 08 "tabuada": Ler um número inteiro N, daí mostrar na tela a tabuada
 * de N para 1 a 10, conforme exemplo.
 */
public class Problema08 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);  
        int valorDaTabuada;     

        /** Entrada *********************************************/
        System.out.print("Deseja a tabuada para qual valor? "); 
        valorDaTabuada = input.nextInt();
 
        /** Saida e Calculos necessarios**************************/
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", valorDaTabuada, i, valorDaTabuada * i);
        }            
       input.close();
    }
    
}

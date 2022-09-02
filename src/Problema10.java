import java.util.Scanner;
/* Problema 10 "sequencia_impares": Leia um calor inteiro. Em seguida mostre os impares de 1
 * até X, um calor por lina, inclusive o X, se for o caso. 
 */
public class Problema10 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);                
        int valorDeX;

        /** Entrada *********************************************/ 
       System.out.print("Digite o valor de X: ");
       valorDeX = input.nextInt();

        /** Saida e Calculos necessarios**************************/
        for (int i = 0; i < valorDeX; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
            
       input.close();
    }
    
}

import java.util.Scanner;
/* Problema 09 "soma_impares": Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir
 * calcule e mostre a soma dos números impares entre eles.
 */
public class Problema09 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int primeiroValor, segundoValor;
                 
        
        /** Entrada *********************************************/ 
        System.out.println("Digite dois numeros:");
        primeiroValor = input.nextInt();
        segundoValor = input.nextInt();     

        /** Saida e Calculos necessarios**************************/
        for (int i = primeiroValor; i < segundoValor; i++) {
        }  
        
        
       input.close();
    }
    
}

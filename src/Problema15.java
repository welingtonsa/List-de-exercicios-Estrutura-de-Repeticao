import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int valorN, fatorial= 1;
        
        /** Entrada *********************************************/ 
        System.out.print("Digite o calor de N: ");
        valorN = input.nextInt();

        /** Saida e Calculos necessarios**************************/
        if (valorN == 0) {
            System.out.print("Fatorial = 1");
        } else {
            for (int i = 1; i <= valorN; i++) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }   
       input.close();
    }
    
}

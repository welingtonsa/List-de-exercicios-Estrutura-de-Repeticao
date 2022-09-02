import java.util.Scanner;

public class Problema14 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int numerosDeCasos, denominador, numerodor;
        double divisao;
                 
      
         /** Entrada *********************************************/ 
        System.out.print("Quantos casos vocÇe vai digitar? ");
        numerosDeCasos = input.nextInt();

        /** Saida e Calculos necessarios**************************/
        for (int i = 0; i < numerosDeCasos; i++) {
            System.out.print("Entre com o numerador: ");
            numerodor = input.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = input.nextInt();
            double count = numerodor;
            if (denominador == 0 ) {
                System.out.println("DIVISÃO IMPOSSÍVEL");
            } else {
                divisao = count / denominador;
                System.out.printf("DIVISÃO = %.2f\n", divisao);
            }
        }
          
       input.close();
    }
    
}

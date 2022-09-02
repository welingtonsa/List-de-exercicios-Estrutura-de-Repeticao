import java.util.Scanner;
/* Problema 07 "pares_consecutivos": O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá
 * para quando o calor X for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, 
 * inclusive o X, se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o 
 * resultado da operaçção: 4 + 6 + 8 + 10 + 12, enquanto que se o valor de entrada for 11, por exemplo, a 
 * saída deve ser 80, que é a soma de 12 + 14 + 16 + 18 + 20. */
public class Problema07 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);  
        int userInput, count = 0, soma = 0, temp;  
        
        /** Entrada Saida e Calculos necessarios ********************/ 
        do {
            userInput = 0;
            soma = 0;
            temp = 0;
            count = 0;
            System.out.print("Digite um número inteiro:");
            userInput = input.nextInt();
            temp = userInput;
            if ((temp % 2) == 1 ) {
                temp = temp + 1;
                do {
                    soma = soma + temp;
                    temp = temp + 2;
                    count++;
                } while (count <= 4);
                System.out.printf("SOMA = %d\n", soma);
            }else if (temp != 0){
                count = 0;
                do {
                    soma = soma + temp;
                    temp = temp + 2;
                    count++;
                } while (count <= 4);
                System.out.printf("SOMA = %d\n", soma);
            }                   
        } while (userInput != 0);  
        input.close();
    }
    
}

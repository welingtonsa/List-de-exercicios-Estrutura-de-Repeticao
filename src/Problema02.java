import java.util.Scanner;

/* Problema 02 "media_idades" Faça um programa para ler um número indeterminado de dados
 * contendo cada um, a idade de um individuo. O ultimo dado, que entrará nos cálculos
 *  contém um valor de idade negativa. Calcular e imprimir a idade média desde grupo
 * de individuos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem
 * !IMPOSSIVEL CALCULAR"
 */
public class Problema02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, count = 0;
        double media = 0, totalIdades = 0;
        
        System.out.println("Digite as idades:");
        do {
           
            idade = input.nextInt();
            totalIdades = totalIdades + idade;
            
            if (idade > 0) {
                count = count +1; 
            }
            
        } while (idade > 0);

        media = totalIdades / count; 

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            System.out.printf("MEDIA = %.2f", media);
        }  
        input.close();      

    }
    
}

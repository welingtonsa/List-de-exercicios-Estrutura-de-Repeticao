import java.util.Scanner;
/* Problema 13 "media_poderada": Leia um valor inteiro N, que representa o número de casos de teste
 * que vem a seguir. Casa caso de teste consiste de 3 valores reais, para os quais você deverá calcular
 * e mostrar a média  ponderada, sendo que o primeiro calor tem peso 2, o segundo calor tem peso 3 
 * e o terceiro calor tem peso 5. Vale lembrar que a média ponderada é a soma de todos os calores
 * multiplicado pelo sei respectivo peso, dividida pela soma os pesos. 
 */
public class Problema13 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int quantidadeDeCasos;
        double  primeiroValor, segundoValor, terceiroValor, mediaPonderada;
        
        /** Entrada *********************************************/ 
        System.out.print("Quantos casos você vai digitar? ");
        quantidadeDeCasos = input.nextInt();

        /** Saida e Calculos necessarios**************************/
          for (int i = 0; i < quantidadeDeCasos; i++) {
            System.out.println("Digite três números:");
            primeiroValor = input.nextDouble();
            segundoValor = input.nextDouble();
            terceiroValor = input.nextDouble();
            
            mediaPonderada = ((primeiroValor * 2) + (segundoValor * 3) + (terceiroValor * 5)) / (2 + 3 + 5);
            System.out.printf("MEDIA = %.1f\n", mediaPonderada);
          }
       input.close();
    }
    
}

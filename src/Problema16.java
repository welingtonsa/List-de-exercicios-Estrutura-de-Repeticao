import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);        
        int quantidadeDeCasos, quantidadeDeCobais = 0, totalDeCobais = 0;
        int totalDeCoelhos = 0, totalDeRatos = 0, totalDeSapos = 0 ;
        double percentualDeAnimais;
        char tipoDaCobaia;
        
        /** Entrada *********************************************/ 
        System.out.print("Quantos casos de teste serão digitados? ");
        quantidadeDeCasos = input.nextInt();

        for (int i = 0; i < quantidadeDeCasos; i++) {
            quantidadeDeCobais = 0;
            System.out.print("Quantidade de cobais: ");
            quantidadeDeCobais = input.nextInt();
            System.out.print("Tipo da cobaia: ");
            tipoDaCobaia =   input.next().toUpperCase().charAt(0);

            totalDeCobais += quantidadeDeCobais;

            if (tipoDaCobaia == 'C') {
                totalDeCoelhos += quantidadeDeCobais;
            }
            if (tipoDaCobaia == 'R') {
                totalDeRatos += quantidadeDeCobais;
            }
            if (tipoDaCobaia == 'S') {
                totalDeSapos += quantidadeDeCobais;
            }

        }
        /** Saida e Calculos necessarios**************************/
        System.out.println("RELATÓRIO FINAL:");
        System.out.printf("Total: %d cobais \n", totalDeCobais);
        System.out.printf("Total de coelhos: %d \n", totalDeCoelhos);
        System.out.printf("Total de ratos: %d \n", totalDeRatos);
        System.out.printf("Total de sapos: %d \n", totalDeSapos);


        percentualDeAnimais = (Double.valueOf(totalDeCoelhos) * 100) / Double.valueOf(totalDeCobais);
        System.out.printf("Percentual de coelhos: %.2f \n", percentualDeAnimais);
        percentualDeAnimais = (Double.valueOf(totalDeRatos) * 100) / Double.valueOf(totalDeCobais);
        System.out.printf("Percentual de ratos: %.2f \n", percentualDeAnimais);
        percentualDeAnimais = (Double.valueOf(totalDeSapos) * 100) / Double.valueOf(totalDeCobais);
        System.out.printf("Percentual de sapos: %.2f \n", percentualDeAnimais);
           
       input.close();
    }
    
}

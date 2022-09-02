import java.util.Scanner;
/* Problema 05 "validacao_de_nota": Faça um programa que leia às notas referentes às
 * duas valiações de um aluno. Calcule e imprima a média semestral. Faça com que o 
 * algoritimo só aceite notas válidas (uma nota válida deve pertencer ao intervalo
 * [0,10]). Cada nota deve ser calidade separadamente.
 */
public class Problema05 {
    public static void main(String[] args) {
        /* Variaveis de Controle *******************************************/
        Scanner input = new Scanner(System.in);
        double primeiraNota, segundaNota, media;

        /* Entrada do usuario **********************************************/
        System.out.print("Digite a primeira nota: ");
        primeiraNota = Float.parseFloat(input.nextLine().replace(",", "."));
        do {
            
            if (primeiraNota < 0 || primeiraNota > 10 ) {
                System.out.print("Valor invalido! Tente novamente: ");
                primeiraNota = Float.parseFloat(input.nextLine().replace(",", "."));
            }
        } while (primeiraNota < 0 || primeiraNota > 10);
        System.out.print("Digite a egunda nota: ");
        segundaNota = Float.parseFloat(input.nextLine().replace(",", "."));
        do {
            
            if (segundaNota < 0 || segundaNota > 10 ) {
                System.out.print("Valor invalido! Tente novamente: ");
                segundaNota = Float.parseFloat(input.nextLine().replace(",", "."));
            }
        } while (segundaNota < 0 || segundaNota > 10);

        /** Calculos necessarios ****************************************/
        media = (primeiraNota + segundaNota) / 2;
        
        /* Saida ********************************************************/
        System.out.printf("MÉDIA = %.2f", media);
        input.close();

    }

    
}

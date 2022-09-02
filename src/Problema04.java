import java.util.Scanner;
/* Problema 04 "quadrante": Escrva um programa para ler as coordenadas (x.y) de uma
 * quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
 * o quadrante a que ele pertence (Q1,Q2,Q3,Q4). O algoritimo será encerrado
 * quando pelo menos uma de duas coordenadas for  NULA( nesta situaçao sem 
 * esvrever mensagem alguma).
 */
public class Problema04 {
    public static void main(String[] args) {
        /* Variaveis de controle *******************************/
        Scanner input = new Scanner(System.in);
        int coordenadaX, coordenadaY;

        do {
            System.out.println("Digite os valores das coordenadas X e Y:");
            coordenadaX = input.nextInt();
            coordenadaY = input.nextInt();

            if (coordenadaX > 0 & coordenadaY > 0) {
                System.out.println("Quadrante Q1!");
            }
            if (coordenadaX < 0 & coordenadaY > 0) {
                System.out.println("Quadrante Q2!");
            }
            if (coordenadaX < 0 & coordenadaY < 0) {
                System.out.println("Quadrante Q3!");
            }
            if (coordenadaX > 0 & coordenadaY < 0) {
                System.out.println("Quadrante Q4!");
            }

        } while (coordenadaX != 0 & coordenadaY != 0);
        input.close();


    }
    
}

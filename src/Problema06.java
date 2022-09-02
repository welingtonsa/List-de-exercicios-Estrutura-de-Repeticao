import java.util.Scanner;
/* Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus 
 * clientes. Escreva m algoritimo para ler o tipo de combustível abastecido (codificado da 
 * seguinte forma 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuario informe um código inválido
 * (fora da faixa de 1 a 4)deve ser solicitado um novo código (até que seja válido). O programa será
 * encerrado quando o código informado for o número 4, devendo então mostrar a mensagem 
 * "MUITO OBRIGADO", bem como as quantdades de cada combustível.
 */
public class Problema06 {
    public static void main(String[] args) {
        /** Variaveis de controle ***********************************/
        Scanner input = new Scanner(System.in);  
        int codigoInput, alcool = 0, gasolina = 0, diesel = 0;      
       
        /** Entrada *********************************************/ 
        do {
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar:");
            codigoInput = input.nextInt();
            if (codigoInput == 1) {
                alcool ++;
            }
            if (codigoInput == 2) {
                gasolina ++;
            }
            if (codigoInput == 3) {
                diesel ++;
            }
        } while (codigoInput != 4);

        /** Saida *******************************************/
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Álcool: %d\n", alcool);
        System.out.printf("Gasolinal: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
             
       input.close();
    }
    
}

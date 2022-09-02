import java.util.Scanner;
/* Problema 03 "senha_fixa": Escreva um programa que repita a leitura de uma
 * senha até que ela seja válida. Para cada leitura de senha incorreta informada, 
 * escreva a mensagem "Senha Inválida! Tente novamamente:". Quando a senha for 
 * informada corretamente deve ser impressa a mensagem "Acesso permetido" e o 
 * algoritmo encerrando. Considere que a senha correta é valor 2002.
 */
public class Problema03 {
    public static void main(String[] args) {
        /* Variaveis de controle *******************************/
        Scanner input = new Scanner(System.in);
        int senha, registroSenha = 2002;

        /* Entrada do usuario **********************************/
        System.out.print("Digite a senha:");
        do {
            senha = input.nextInt();
            if (senha != registroSenha) {
                System.out.print("Senha Inválida! Tente Novamente:");
                senha = input.nextInt();
            } else {
                System.out.println("Acesso permitido!");
            }
            
        } while (senha != registroSenha);
        input.close();
    }
    
}

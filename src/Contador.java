import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //exceção capturada pelo teste que envia uma mensagem para o terminal do usuário
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //teste para saber se o parametroUm é maior que o parametroDois
        if(parametroUm>parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        //lógica de contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
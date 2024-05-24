import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }

}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmentro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int resultado = 1; resultado <= contagem; resultado++) {
            System.out.println("Imprimindo resultado: " + resultado);
        }

    }
}
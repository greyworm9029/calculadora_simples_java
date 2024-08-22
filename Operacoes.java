// Importa a biblioteca de input
import java.util.Scanner;

// Calculadora simples
public class Operacoes {
    public static void main(String[] args) {

        // Tentativa de funcao para calcular dois numeros
        try (Scanner scanner = new Scanner(System.in)) {

            // Pede ao usuario para digitar um numero
            System.out.println("Digite um numero: ");
            // Armazena o valor na variavel 'numero1'
            int numero1 = scanner.nextInt();

            // Pede ao usuario para digitar outro numero
            System.out.println("Digite outro numero: ");
            // Armazena o valor na variavel 'numero2'
            int numero2 = scanner.nextInt();

            // Pede ao usuario para digitar a operacao desejada
            System.out.println("Digite a operacao desejada (soma, subtracao, multiplicacao, divisao): ");
            // Armazena o valor na variavel 'operacao'
            String operacao = scanner.next();

            // Condicoes para a operacao escolhida
            if ("soma".equals(operacao)) {
                System.out.println("A soma de " + numero1 + " + " + numero2 + " = ");
            } else if ("subtracao".equals(operacao)) {
                System.out.println("A subtracao de " + numero1 + " - " + numero2 + " = ");
            } else if ("multiplicacao".equals(operacao)) {
                System.out.println("A multiplicacao de " + numero1 + " * " + numero2 + " = ");
            } else if ("divisao".equals(operacao)) {
                System.out.println("A divisao de " + numero1 + " / " + numero2 + " = ");
            } else {
                System.out.println("Operacao invalida! Tente novamente!");
            }
        }
    }
}
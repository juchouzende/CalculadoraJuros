import java.util.Scanner;

public class CalculadoradeJuros {

    public static void main(String[] args) {
        // Declaração de variáveis
        int Capital, Taxa, Tempo, Juros;

        // Criação e instância de objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // Apresentação
        System.out.println("\n\t\t\t -- Calculadora de Juros Simples --\n");

        // Entrada
        System.out.println("\nJuros Simples ");
        System.out.print("Informe Capital: ");
        Capital = entrada.nextInt();
        System.out.print("Informe Taxa: ");
        Taxa = entrada.nextInt();
        System.out.print("Informe Tempo: ");
        Tempo = entrada.nextInt();

        Juros = (Capital * Taxa * Tempo) / 100;
        System.out.println(Capital + " * " + Taxa + " * " + Tempo + " = " + Juros);

        entrada.close();
    
    }
}
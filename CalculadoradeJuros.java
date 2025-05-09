import java.util.Scanner;

public class CalculadoradeJuros {

    public static void main(String[] args) {
        // Declaração de variáveis
        int Capital, Taxa, Tempo, Juros, op;

        // Criação e instância de objeto de entrada
        Scanner entrada = new Scanner(System.in);

        // Apresentação
        System.out.println("\n\t\t\t -- Calculadora de Juros Simples --\n");

        // Menu
        System.out.println("1 - Calcular Juros");
        System.out.println("2 - Calcular Capital");
        System.out.println("3 - Calcular Taxa");
        System.out.println("4 - Calcular Tempo");

        // Opção do usuário
        System.out.print("Opção: ");
        op = entrada.nextInt();

        if (op == 1) {
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

        } else if (op == 2) { 
            // Entrada


        } else if (op == 3) {
            // Entrada

        
        } else if (op == 4) {
            // Entrada


        entrada.close();

    }
    
    }
}
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) throws Exception {
        
        /* Iniciando variáveis e scanner*/
        Double a = 0.0;
        Double b = 0.0;
        Double soma = 0.0;
        Scanner tecladoSc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        a = tecladoSc.nextDouble();
        System.out.print("Digite um número: ");
        b = tecladoSc.nextDouble();

        /* Manipulação matemática */
        soma = a + b;

        System.out.println("A soma de " + a + " e " + b + " é [" + soma + "].");
        tecladoSc.close();
    }
}

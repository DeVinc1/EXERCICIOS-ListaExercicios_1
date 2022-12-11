import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) throws Exception {

        /* Iniciando váriaveis e scanner */
        Double raio = 0.0;
        Double area = 0.0;
        Double pi = Math.PI;

        Scanner tecladoSc = new Scanner(System.in);

        System.out.print("Digite o raio (diâmetro / 2) de um círculo: ");
        raio = tecladoSc.nextDouble();

        /*
         * Manipulação matemática
         * Área do Círculo = pi * r²
         */

        area = pi * (Math.pow(raio, 2));

        System.out.printf("A área do círculo de raio " + raio + " é %.2f", area);

        tecladoSc.close();
    }
}

/* Faça um Programa que converta metros para centímetros. */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {

        /* Iniciando variáveis e scanner */
        Double metros = 0.0;
        Double centimetros = 0.0;

        Scanner tecladoSc = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        metros = tecladoSc.nextDouble();

        /*
         * Manipulação matemática
         * 1 metro = 100 centimetros
         */

        centimetros = metros * 100;

        System.out.println(metros + "m é igual a " + centimetros + "cm.");

        tecladoSc.close();

    }
}

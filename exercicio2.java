/* Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. */

import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) throws Exception {

        /* Inicializando scanner e váriaveis */
        Scanner tecladoSc = new Scanner(System.in);
        Double num = 0.0;

        System.out.print("Digite um número: ");
        num = tecladoSc.nextDouble();
        System.out.println("O número informado foi: [" + num + "].");

        tecladoSc.close();
    }
}

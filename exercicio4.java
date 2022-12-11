/* Faça um Programa que peça as 4 notas bimestrais e mostre a média. */

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) throws Exception {

        /* Iniciando variáveis e scanner */
        Double nota1 = 0.0;
        Double nota2 = 0.0;
        Double nota3 = 0.0;
        Double nota4 = 0.0;

        Double media = 0.0;

        Scanner tecladoSc = new Scanner(System.in);

        System.out.print("Digite a 1ª nota bimestral do aluno: ");
        nota1 = tecladoSc.nextDouble();
        System.out.print("Digite a 2ª nota bimestral do aluno: ");
        nota2 = tecladoSc.nextDouble();
        System.out.print("Digite a 3ª nota bimestral do aluno: ");
        nota3 = tecladoSc.nextDouble();
        System.out.print("Digite a 4ª nota bimestral do aluno: ");
        nota4 = tecladoSc.nextDouble();

        /* Manipulação matemática */
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno foi: [" + media + "]");

        tecladoSc.close();
    }
}

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) throws Exception {

        /* Iniciando váriaveis e scnaner */
        Double ladoQuadrado = 0.0;
        Double area = 0.0;
        Double areaDobro = 0.0;

        Scanner tecladoSc = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        ladoQuadrado = tecladoSc.nextDouble();

        /*
         * Manipulação matemática
         * Área do quadrado = Lado²
         */

        area = Math.pow(ladoQuadrado, 2);
        areaDobro = area * 2;

        System.out.println("O quadrado de lado " + ladoQuadrado + " tem o dobro de sua área igual a " + areaDobro);

        tecladoSc.close();
    }
}

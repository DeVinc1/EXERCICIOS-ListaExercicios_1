import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) throws Exception {
       
        /* Iniciando variáveis e scanner */
        Double celsius = 0.0;
        Double fahrenheit = 0.0;

        Scanner tecladoSc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        fahrenheit = tecladoSc.nextDouble();

        /* Manipulação matemática */
        celsius = 5 * ((fahrenheit-32) / 9);

        System.out.printf(fahrenheit + "ºF é igual a " + celsius +"ºC");

        tecladoSc.close();
    }
}

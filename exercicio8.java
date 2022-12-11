import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) throws Exception {
        
        /* Iniciando variáveis e scanner */
        Double horasTrabalhadas = 0.0;
        Double valorDaHora = 0.0;
        Double salario = 0.0;

        Scanner tecladoSc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora em R$? ");
        valorDaHora = tecladoSc.nextDouble();
        System.out.print("Quantas horas você trabalha por mês? ");
        horasTrabalhadas = tecladoSc.nextDouble();

        /* Manipulação matemárica */
        salario = horasTrabalhadas * valorDaHora;

        System.out.println("O seu salário é de: R$" + salario);

        tecladoSc.close();
    }
}

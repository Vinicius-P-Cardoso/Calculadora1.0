import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Calculadora 1.0");
        Scanner sc = new Scanner(System.in);
        double valor1, valor2, resultado;
        int operador;
        String resposta = "S";
        resultado = 0;
        do {
            System.out.print("Digite o primeiro valor: ");
            valor1 = sc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            valor2 = sc.nextDouble();
            System.out.print("""
                    Selecione um operador
                    1 > +
                    2 > -
                    3 > *
                    4 > /
                    Escolha:""");
            operador = sc.nextInt();
            if (operador == 1) {
                resultado = valor1 + valor2;
            } else if (operador == 2) {
                resultado = valor1 - valor2;
            } else if (operador == 3) {
                resultado = valor1 * valor2;
            } else if (operador == 4) {
                if (valor2 == 0) {
                    System.out.println("Erro. Não é possível dividir por 0.");
                } else {
                    resultado = valor1 / valor2;
                }
            } else {
                System.out.println("""
                        Erro. Selecione um operador válido
                        1 > +
                        2 > -
                        3 > *
                        4 > /""");
            }
            if (operador >= 1 && operador <= 4 && !(operador == 4 && valor2 == 0)) {
                System.out.printf("Resultado = %.2f", resultado);
                System.out.println();
            }
            do {
                System.out.print("Deseja continuar? [S/N]: ");
                resposta = sc.next().toUpperCase();
                if (!Objects.equals(resposta, "S") && (!Objects.equals(resposta, "N"))) {
                    System.out.print("Resposta Inválida! ");
                }
            } while (!Objects.equals(resposta, "S") && (!Objects.equals(resposta, "N")));
        } while (Objects.equals(resposta, "S"));
        System.out.print("Programa finalizado com sucesso!");
        sc.close();
    }
}

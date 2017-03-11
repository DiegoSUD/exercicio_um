package resolucao1;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Htrabalhadas;
        float Vhora;
        float salario;
        System.out.println("Quantas Horas Trabalhadas");
            Htrabalhadas = leia.nextInt();
        System.out.println("Valor da Hora Trabalhada");
            Vhora = leia.nextFloat();
        salario = (Vhora*Htrabalhadas)*30;
        System.out.println("Seu Salário è :"+salario);
    }
}

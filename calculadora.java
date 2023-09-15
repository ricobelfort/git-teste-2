import java.util.Scanner;

public class calculadora{

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        sc.close();

        double soma = (numero1 + numero2);
        double subtracao = (numero1 - numero2);
        double multiplicacao = (numero1 * numero2);
        double divisao = (numero1 / numero2);
        double modificador = (numero1 % numero2);


        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Modificador = " + modificador);

    }
}
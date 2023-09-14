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

        System.out.println("Soma = " + soma);
;
}
}
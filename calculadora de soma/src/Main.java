import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o Primeiro Numero :");
        Scanner numero1 = new Scanner(System.in);
        double primeiroNumero = numero1.nextDouble();
        System.out.println("Digite o Segundo Numero :");
        Scanner numero2 = new Scanner(System.in);
        double segundoNumero = numero2.nextDouble();
        System.out.println("A Soma e : " + (primeiroNumero+segundoNumero));


}
}

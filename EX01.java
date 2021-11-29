import java.util.Scanner;
public class EX01{
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 4 números para a multiplicação");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        scanner.close();
        System.out.println("A soma desses dois números é: "+ (n1+ n3+ n4 + n2));
    }
}
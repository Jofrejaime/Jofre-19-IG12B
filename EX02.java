import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite os 2 numeros para a subtração deles");
    float n1 = s.nextFloat();
    float n2 = s.nextFloat();
     s.close();
    System.out.println("A subtração é :"+ (n1-n2));
    }
}

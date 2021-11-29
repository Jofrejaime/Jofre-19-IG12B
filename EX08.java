import java.util.Scanner;
public class EX08 {
        
    public static void main(String[] args) {
       System.out.println("Digite os lados do quadrado desejado");
       Scanner s = new Scanner(System.in);
       float l1  = s.nextFloat();
       float l2 = s.nextFloat();
       s.close();
       System.out.println("A area desse triangulo é de "+ l1*l2);

    }
}

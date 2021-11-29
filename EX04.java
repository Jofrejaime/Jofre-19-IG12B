import java.util.Scanner;

public class EX04{
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os Dois numeros para a divisão");
        float n1 = s.nextFloat();
        float n2 = s.nextFloat();
        s.close();
        System.out.println("Divisão: "+ n1/n2);


    }
}
import java.util.Scanner;
public class EX09{
    public static void main(String[] args) {
    System.out.println("Digite o peso em kilo");
    Scanner s = new Scanner(System.in);
    float kilo = s.nextFloat();
    s.close();
    System.out.println("O seu peso em gramas é :"+ kilo*1000);
        
    }
}
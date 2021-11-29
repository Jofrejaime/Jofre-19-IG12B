import java.util.Scanner;
public class EX07 {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro em seguida a segunda diagonal do losangulo desejado");
        Scanner s = new Scanner(System.in);
        float d1 = s.nextFloat();
        float  d2 = s.nextFloat(); 
        s.close();
        System.out.println("O valor deste losangulo é de: "+ d1*d2);
    }
        
}

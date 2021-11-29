import java.util.Scanner;
public class EX13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int ano1 = s.nextInt();
        System.out.println("Digite a data actual ");
        int anoact = s.nextInt();
        int a = anoact-ano1;
       
        System.out.println("A sua idade é: " +a );
        System.out.println("E em 2050 teras "+ (2050-ano1));
       s.close(); 
    }
    
}


import java.util.Scanner;
public class EX16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número em jardas: ");
        int n1 = s.nextInt();
        System.out.println("Este número em polegadas é igual a = "+ n1*120);
        System.out.println("\n E em jardar é igual a = "+n1/3);
        System.out.println("Em milhas equivale = "+(n1/3)/(1.763));
        s.close();
    }
}

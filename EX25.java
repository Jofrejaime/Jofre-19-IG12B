import java.util.Scanner;
public class EX25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Deposito: ");
        float dep = s.nextFloat();
        System.out.print("TAXA DE JUROS: ");
        float juros = s.nextFloat();
        System.out.println("O rendimento é de "+juros+"\nO valor total é de "+(dep+((dep*juros)/juros)));
        s.close();
    }
}

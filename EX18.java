import java.util.Scanner;
public class EX18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o preço: ");
        Float preco = s.nextFloat();
        float  aumento = (preco/100)*10;
        System.out.println("Sofreu um amumento de 10 e o seu novo preço é de "+ (preco+aumento)+"kz");
        s.close();
    }
}

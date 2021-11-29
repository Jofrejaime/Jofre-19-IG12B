import java.util.Scanner;
public class EX10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os dados do Trapézio");
        System.out.print("Base Maior: ");
        float base1 = s.nextFloat();
        System.out.print("\nBase Menor: ");
        float base2 = s.nextFloat();
        System.out.print("\nAltura: ");
        float altura = s.nextFloat();
        s.close();
        System.out.println("A Área de trapézio é de: "+ ((base1 + base2) * altura) /2);
    }
    
}

import java.util.Scanner;
public class EX22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o seu salario base: ");
        float sal = s.nextFloat();
        float  comi = (sal/100)*4;
        System.out.print("Informe quantas vendas: ");
        float vendas = s.nextFloat();
        System.out.println("Sofreu um amumento de 5 porcento e com imposto de 7 o seu novo salario é de "+ (sal+(comi*vendas))+ "KZ");
        s.close();

    
    }
}

import java.util.Scanner;
public class EX21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o seu salario base: ");
        float sal = s.nextFloat();
        float  aumento = (sal/100)*5;
        float desc = ((sal/100)*7);
        System.out.println("Sofreu um amumento de 5 porcento e com imposto de 7 o seu novo salario é de "+( (sal+aumento) - desc)+ "KZ");
        s.close();

    
    }
}

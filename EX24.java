import java.util.Scanner;
public class EX24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o seu salario base: ");
        float sal = s.nextFloat();
        float  aumento = sal + 50;
        float desc = ((sal/100)*10);
        System.out.println("Sofreu um amumento de 50R$ porcento e com imposto de 10 o seu novo salario é de "+(aumento - desc)+ "R$");
        s.close();

    
    }
}

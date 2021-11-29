import java.util.Scanner;
public class EX17 {
    public static void main(String[] args) {
        

    
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o seu salario: ");
        float sal = s.nextFloat();
        float  aumento = (sal/100)*25;
        System.out.println("Sofreu um amumento de 25 porcento e o seu novo salario é de "+ (sal+aumento)+"kz");
        s.close();


    }
}

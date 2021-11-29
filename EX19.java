import java.util.Scanner;
public class EX19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    System.out.println("Informe o seu salario: ");
    float sal = s.nextFloat();
    System.out.print("Informe o seu aumento: ");
    float  aumento = s.nextFloat();
    System.out.println("Sofreu um amumento de 25 porcento e o seu novo salario é de "+ (sal+(sal*100)/aumento)+"kz");
    s.close();
    }
    

}

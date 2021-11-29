import java.util.Scanner;
public class EX23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o pesoo: ");
        float peso = s.nextFloat();
        System.out.println("Se sofrer um amumento de 15 porcento e o seu peso será de "+ ((peso/100)*15)+"k\n caso ser de 20 porcento a mesma será de "+((peso/100)*20) );
        s.close();
    }
}

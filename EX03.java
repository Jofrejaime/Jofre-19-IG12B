
import java.util.Scanner;
public  class EX03{ 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe os 3 numeros para a multiplicação deles");
        int n1 = s.nextInt();
        int n2= s.nextInt();
        int n3= s.nextInt();
        s.close();
        System.out.println("Multiplicação "+ (n1*n2*n3));
    }
}
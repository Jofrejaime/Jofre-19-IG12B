 import java.lang.Math;
import java.util.Scanner;
public class EX15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        if(n1 <= 0){
            System.out.print("Apenas números maiores que zero digite o primeiro número novamente: ");
             n1 = s.nextInt();
        }

        System.out.println("Digite o segundo número ");
        int n2 = s.nextInt();
        if(n2 <= 0){
            System.out.print("Apenas números maiores que zero digite o segundo número novamente: ");
             n2 = s.nextInt();      
        }
       s.close();
       
        System.out.println( n1+" elevado a "+ n2 +" é igual a " +Math.pow(n1, n2));
        System.out.println(n2+" elavado a "+ n1+" é igual a " +Math.pow(n2, n1));
                
           
    }

    
}

import java.util.Scanner;
public class EX26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int n1 = s.nextInt();
        if(n1 <= 0){
            System.out.println("Apenas números maiores que zero digite o primeiro número novamente: ");
             n1 = s.nextInt();
        }else{
            System.out.println("O quadrado deste número "+Math.pow(n1, 2)+"\nO cubo deste número "+Math.pow(n1, 3)+"\nA raiz quadrada deste número "+(n1*0.5));
        }
        s.close();
    }
   

}

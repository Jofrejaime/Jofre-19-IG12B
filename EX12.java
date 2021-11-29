import java.util.Scanner;
public class EX12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite O valor da Base do triangulo desejado");
        float base = s.nextFloat();
        System.out.println("Digite O valor da altura do triangulo");
        float altura = s.nextFloat();
        s.close();
        System.out.println("A area desse triangulo é de: "+ (base*altura)/2);
    }
}

import java.util.Scanner;

public class EX05{
     public static void main(String[] args) {
        System.out.println("Digite as notas para a media");
        Scanner s = new Scanner(System.in);
        float n1 = s.nextFloat();
        float n2 =s.nextFloat();
        float n3 = s.nextFloat();
        s.close();
        System.out.println("Media = "+ (n1+n2+n3)/3);
    }
}
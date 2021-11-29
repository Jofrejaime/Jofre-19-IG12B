import java.util.Scanner;
public class EX06 {
    public static void main(String[] args){
        System.out.println("Media 'ponderada', digite as notas na respectiva ordem\n X\n Y\n Z ");
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        float y = s.nextFloat();
        float z = s.nextFloat();
        System.out.println("Media 'ponderada', digite os pessos K1\nK2\n:");
        float k1 = s.nextFloat();
        float k2 = s.nextFloat();
        s.close();
        System.out.println("Media Ponderada é de :"+ (k1*(x+y) + k2*(z))) ;


    }
    
}

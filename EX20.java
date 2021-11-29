import java.util.Scanner;
public class EX20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
    System.out.print("Informe o custo do espetaculo: ");
    float esp = s.nextFloat();
    System.out.print("Informe o preco do convite: ");
    float  convite = s.nextFloat();
    float n = 0;
    int b = 0; s.close();
    for(; n < esp; b++ )
    {
         n = b*convite;
    }
    System.out.print((b-1 )+" convites têm que ser vendidos");
    
    }
    
  
}

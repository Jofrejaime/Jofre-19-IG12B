import java.util.Scanner;
public class EX14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
 System.out.print("Digite o seu ano de nascimento: ");
        int ano1 = s.nextInt();
        System.out.println("Digite a data actual ");
        int anoact = s.nextInt();
        s.close();
        System.out.print("A tua idade em anos é: "+ (anoact - ano1)+"\nA sua idade em meses é: "+ (anoact - ano1)*12+"\nA sua idade em Dias é: "+(anoact - ano1)*365+"\nA sua idade em semanas é: "+(anoact - ano1)*48);

  }
    
}

import java.util.Scanner;
public class EX30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float racaopeso, gatoracaoqt;
	System.out.printf("Digite O peso do saco de racao e quantidade para cada gato em gramas:\n");
	racaopeso= s.nextFloat();
    gatoracaoqt = s.nextFloat();
	
	float quantgeralpordia = gatoracaoqt*2;
	//agora vou converter a racao consumida em quilo
	 float raccgatoquilo=((racaopeso*1000)/(racaopeso*quantgeralpordia));
	System.out.printf("quantidade entre os dois " +quantgeralpordia+"\nO quilo "+ raccgatoquilo );
	 float dias5 = racaopeso - gatoracaoqt*5;
	 System.out.printf("\nEm cinco dia ainda restara  de racao "+ dias5+"kg" );
     s.close();
}
    }
    

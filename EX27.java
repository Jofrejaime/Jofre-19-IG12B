import java.util.Scanner;
public class EX27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float preco, perlucro, pdesconto, pimposto;
	System.out.println("Digite o Preco de fabrica do carro: ");
	preco = s.nextFloat();
	 System.out.println("Digite a percenagem de Lucro: ");
	perlucro = s.nextFloat();
	System.out.println("O percentual de Desconto: ");
	pdesconto= s.nextFloat();
	System.out.println("O percentual de imposto; ");
	pimposto= s.nextFloat();
	s.close();
	float distrib = (preco/100)*perlucro;
	float imposto = (preco/100)*pimposto;
	float precoveiculo = preco +(distrib + imposto);
  System.out.println("O preco do Distribuidor e de: "+distrib+"\nO preco do imposto e: "+ imposto);
   System.out.println("O preco do veiculo e: "+preco+" e com o desconto e:  "+ (precoveiculo - pdesconto));	
    }
}

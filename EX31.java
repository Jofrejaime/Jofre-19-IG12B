import java.util.Scanner;
public class EX31 {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Digite o Salario minimo e o numero de Quillowatts consumidos: ");
       float salmin = s.nextFloat();
       float kw = s.nextFloat();
      
       //float cadakw = salmin*(1/5);
       //float contaDacasa = kw*cadakw;
       //float desconto = contaDacasa - (contaDacasa/100)*15;
       System.out.printf("Cada KW tem o valor de "+salmin*(1/5)+"Kz\nEsta residencia deverá pagar "+kw*(salmin*(1/5))+"kz\n com o desconto o preço final é de "+(kw*(salmin*(1/5)) - ((kw*(salmin*(1/5)))/100)*15)+"kz");
        s.close();
   } 
}

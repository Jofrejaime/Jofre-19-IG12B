import java.util.Scanner;
public class EX28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float salamin, horastrab;
        System.out.printf("Digite o Salario minimo e o numero de horas trabalhadas:\n");
       salamin = s.nextFloat();
       horastrab = s.nextFloat();
        
       float horatra = salamin/2;
       float salabruto = horastrab * horatra;
       float imposto = (salabruto/100)*3;
       float salario = salabruto - imposto;
       System.out.printf("\nO salario a receber e de: %f", salario );
       s.close();
    }
}

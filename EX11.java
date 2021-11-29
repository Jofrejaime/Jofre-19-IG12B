import java.util.Scanner;
public class EX11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite O valor do salário minimo em seguida o salário maximo");
        float salamin  = s.nextFloat();
        float salamax = s.nextFloat();
        s.close();
        int n=0;
       
    do{
       n--;
           salamax = salamax- salamin;
           
       
    }while(salamax  > salamin );  
    System.out.println("O funcionario ganha :"+ n+" salario/s minimo"); 
    s.close();
    }
    
}

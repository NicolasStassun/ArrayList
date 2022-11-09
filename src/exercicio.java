import java.util.Scanner;
import java.util.ArrayList;

public class exercicio {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<Double>();
        double reajuste=0.0;

        for(double salario=0;salario!=-1;salario=salario){

            System.out.println("Informe o salário: ");
            salario = sc.nextDouble();
            salarios.add(salario);
        }
        System.out.println("Informe o reajuste: ");
        reajuste = sc.nextDouble();
        reajuste = reajuste/100;
        for(int i=0;i< salarios.size();i++){
            salarios.get(i)=reajuste;
        }



    }


}

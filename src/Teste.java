import java.util.ArrayList;
public class Teste{

    public static void main(String[]args){

        ArrayList<String> clientes = new ArrayList<String>();

        clientes.add("Aline");
        clientes.add("Anderson");
        //clientes.remove(0);
        //clientes.clear();

        System.out.println(clientes.get(0));
        System.out.println(clientes.size());

        System.out.printf(clientes.toString());
    }

}

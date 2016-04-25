/**
 * Created by vinicius on 4/24/16.
 */
public class loops {

    public static void main(String[] args) {

        int contExterno = 2;
        int contInterno = 1;

        for(int contador = 0; contador < contExterno; contador++){
            System.out.println(":: Comeca loop externo");

            System.out.println("Contador: " + contador);


            for(int contadorInterno = 0; contadorInterno < contInterno; contadorInterno++){
                System.out.println(":::: Comeca loop interno");
                System.out.println("contadorInterno: " + contadorInterno);
                System.out.println(":::: Termina loop interno");
            }


            System.out.println(":: Termina loop externo");

        }

    }

}

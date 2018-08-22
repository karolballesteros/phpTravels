package Net.phptravels.Utils;

public class Utils {

    public static void noRetorna(){
        System.out.println("Método NO Retorna");
    }

    public static String siRetorna(){
        String msj="Método SI Retorna";
        return msj;
    }


    public static void main(String[] args) {
        noRetorna();
       System.out.println(siRetorna());
    }

}

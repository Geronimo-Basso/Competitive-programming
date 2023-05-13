package acepta_el_reto.nos_mudamos;

public class Main {


    public static void nosMudamos(String primerEntrada, String segundaEntrada, String tercerEntrada){
        String devolucion= "";
        boolean condicion = true;

        String[] primeraLinea = primerEntrada.split(" ");
        String nString = primeraLinea[0];
        String mString = primeraLinea[1];
        int n = Integer.parseInt(nString);
        int m = Integer.parseInt(mString);

        if( m < n){
            condicion = false;
        }else{

            String[] segundaLinea = segundaEntrada.split(" ");
            int sumaSegundaLinea = 0;
            for (int i = 0 ; i < segundaLinea.length ; i++){
                sumaSegundaLinea += Integer.parseInt(segundaLinea[i]);
            }

            String[] terceraLinea = tercerEntrada.split(" ");
            int sumaTercerLinea = 0;
            for (int i = 0 ; i < terceraLinea.length ; i++){
                sumaTercerLinea += Integer.parseInt(terceraLinea[i]);
            }

            condicion = sumaSegundaLinea <= sumaTercerLinea;
        }

        devolucion = condicion ? "SI" : "NO";

        System.out.println(devolucion);
    }

    public static void main(String[] args) {
        nosMudamos("3 3","10 20 30", "31 12 20");

        nosMudamos("3 2","10 20 30", "100 200");

        nosMudamos("3 4","20 10 30", "20 20 50 40");


    }
}
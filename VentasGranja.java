package miniproyecto2;

import java.text.DecimalFormat;

public class VentasGranja {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[]agrs){
        int i=0, opcion = 0;
        double totaldolares;

        RegistroDatos rg=new RegistroDatos();



        while(i<10){
            opcion=rg.Menu();

            switch (opcion){

                case 1:

                    rg.IngresarDatos();
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("La produccion total en dolares de cada productos es de: "+ df.format(rg.TotalProduct()));

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    System.exit(0);
                    break;
            }



        }


    }
}

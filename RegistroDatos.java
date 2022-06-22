package miniproyecto2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroDatos {

    private String [] array_productos=new String[5];
    private String[] array_meses=new String[12];
    private double[][] array_ventas=new double[5][12];
    private double[][] array_kilogramos=new double[5][12];



    public void setArray_ventas(double[][] array_ventas) {
        this.array_ventas = array_ventas;
    }

    public void setArray_kilogramos(double[][] array_kilogramos) {this.array_kilogramos = array_kilogramos;}

    public void setArray_meses(String[] array_meses) {
        this.array_meses = array_meses;
    }

    public void setArray_productos(String[] array_productos) {
        this.array_productos = array_productos;
    }

    public double[][] getArray_kilogramos() {return array_kilogramos; }

    public double[][] getArray_ventas() {
        return array_ventas;
    }

    public String[] getArray_meses() {
        return array_meses;
    }

    public String[] getArray_productos() {
        return array_productos;
    }

    public double[] TotalProduct(){
        double suma=0;
        int i, j;
        double[] array_aux = new double[5];

        for (i=0; i<array_productos.length; i++){

            for (j=0; j<array_meses.length; j++){

                suma = suma + array_ventas[i][j];
            }

            array_aux[i] = suma;
            suma=0;
        }
        System.out.println(Arrays.toString(array_aux));

        return array_aux;
    }

    public void IngresarDatos(){
        String nombre;
        int i,j;
        double ventas;
        String [] array_product = new String[5];
        String [] array_mes = new String[12];
        double [][] array_ventas = new double[5][12];
        double [][] array_kilo = new double[5][12];

        Scanner sc=new Scanner(System.in);

        for (i=0; i<5; i=i+1){
            System.out.println("Ingrese los productos:");
            nombre = sc.next();
            array_product[i]= nombre;
        }

        for (i=0; i<12; i=i+1){
            System.out.printf("Ingrese el nombre del mes %d:\n", i+1);
            nombre = sc.next();
            array_mes[i] = nombre;
        }

        for (i=0; i<5; i=i+1){

            for (j=0; j<12; j=j+1){

                System.out.println("Ingrese la cantidad de ventas de "+array_product[i]+" en el mes de "+array_mes[j]);
                array_ventas[i][j] =sc.nextDouble();
            }
        }
        for (i=0; i<5; i=i+1){

            for (j=0; j<12; j=j+1){

                System.out.println("Ingrese la cantidad de kilogramos de "+array_product[i]+" en el mes de "+array_mes[j]);
                array_kilo[i][j] =sc.nextDouble();
            }
        }

        setArray_productos(array_product);
        setArray_meses(array_mes);
        setArray_ventas(array_ventas);
        setArray_kilogramos(array_kilo);

        System.out.println(Arrays.toString(array_mes));
        System.out.println(Arrays.toString(array_product));
        System.out.println(Arrays.deepToString(array_ventas));
        System.out.println(Arrays.deepToString(array_kilo));

    }

    public int Menu(){
        int opcion=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("1-Ingresar datos");
        System.out.println("2- Producto que mas rindio a final de anio");
        System.out.println("3- Producto que menos rindio a final de anio");
        System.out.println("4- Produccion total en kg");
        System.out.println("5- Produccion total en dolares");
        System.out.println("6- Producto que mas dinero produjo a final de anio");
        System.out.println("7- Producto que menos dinero produjo a final de anio");
        System.out.println("8- Mes que obtuvo la venta más alta");
        System.out.println("9- Mes que obtuvo la venta más baja");

        return opcion;
    }
}

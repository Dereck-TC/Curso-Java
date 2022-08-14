import java.util.*;

public class arrays {
    public static void main(String[] args){
        //*********      Punto A
        ArrayList<String> meses = new ArrayList<>(Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre",
                "Octubre","Noviembre"));
        System.out.println(meses);

        //************    Punto B
        meses.add("Diciembre");
        System.out.println(meses);

        //*******       Punto C
        ArrayList<String> mesesDos = new ArrayList<>(Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre",
                "Octubre","Noviembre","Diciembre"));
        System.out.println(mesesDos);

        //*******        Punto D
        for(String valores : mesesDos){
            System.out.println(valores);
        }

        //*******        Punto E
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes a eliminar: ");
        String mes = scanner.next();
        mesesDos.remove(mes);
        System.out.println(mesesDos);

        //********       Punto F
        System.out.println("Ingrese el mes a buscar: ");
        String mesBuscar = scanner.next();

        int encontrado = mesesDos.indexOf(mesBuscar);
        if(encontrado >= 0 && encontrado < mesesDos.size()){
            System.out.println("El mes " + mesBuscar + " fue encontrado");
        }else{
            System.out.println("Mes no encontrado");
        }

        //*********     Punto G
        Collections.sort(meses);
        System.out.println(meses);

        //*********     Punto H
        System.out.println("En la lista meses hay " + meses.size() + " meses");
        System.out.println(meses);
        System.out.println("En la lista mesesDos hay " + mesesDos.size() + " meses");
        System.out.println(mesesDos);

    }
    public static class ordenarMeses{
        public static void main(String[] args){

        }
        public static void ordenar(){

        }
    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {

    //construccion de objeto anomimo
    public static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args){

        //Ejemplo con el constructor completo

        Cliente Completo=new Cliente("Cristopher","Gutierrez Vega",
                "208980456",'M',"San Jose");


        //Ejemplo con el constructor parcial

        Cliente Parcial=new Cliente("alinna","Rodriguez","309890654","Heredia ");


        //Ejemplo con el constructor por defecto

        Cliente Defecto=new Cliente();


        //Suscripcion

        Suscripcion C1=new Suscripcion(Suscripcion.TipoSuscripcion.INDIVIDUAL,2500,2);

        Suscripcion C2=new Suscripcion(Suscripcion.TipoSuscripcion.DUO,4500,6);

        Suscripcion C3=new Suscripcion(Suscripcion.TipoSuscripcion.FAMILIAR,10000,1);



        Completo.Suscribirse(C1);
        Parcial.Suscribirse(C2);

        //Anonimo
        Defecto.Suscribirse(new Suscripcion(Suscripcion.TipoSuscripcion.FAMILIAR,2000,1));


    }

}

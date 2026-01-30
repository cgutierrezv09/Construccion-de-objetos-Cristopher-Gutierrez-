public class Cliente {
//atributos

    String nombre;
    String apellidos;
    String cedula;
    char sexo;
    String ubicacion;

    //metodos
    //constructor

     Cliente(String nombre,String apellidos,String cedula,char sexo,String ubicacion){

         this.nombre=nombre;
         this.apellidos=apellidos;
         this.cedula=cedula;
         this.sexo=sexo;
         this.ubicacion=ubicacion;

     }

    public Cliente(String nombre,String apellidos,String cedula,String ubicacion){

         this.nombre=nombre;
         this.apellidos=apellidos;
         this.cedula=cedula;
         this.sexo='F';
         this.ubicacion=ubicacion;
     }

     public Cliente(){

     }

     void Suscribirse (Suscripcion suscripcion){
         System.out.println(nombre + " " + apellidos + " Adquirio una suscripcion " + suscripcion.tipo);
     }

}

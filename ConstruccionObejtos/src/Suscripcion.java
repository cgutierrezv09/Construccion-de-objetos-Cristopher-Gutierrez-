public class Suscripcion {

    public enum TipoSuscripcion {
        GRATIS,
        INDIVIDUAL,
        DUO,
        FAMILIAR,
        ESTUDIANTE
    }
    //Atributos
    TipoSuscripcion tipo;
    double costo;
    int periodicidadPago;

    //metodos
    //constructor
    public Suscripcion(TipoSuscripcion tipo, double costo, int periodicidadPago) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidadPago = periodicidadPago;
    }


}

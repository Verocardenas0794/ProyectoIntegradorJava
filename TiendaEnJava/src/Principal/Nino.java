package Principal;

public class Nino extends Producto{

    // Constructor
    public Nino() {
    }

    public Nino(String prenda, double precioUnit, int cantStock, boolean disponible) {
        super(prenda, precioUnit, cantStock, disponible);
    }

    // Methods
    @Override
    public String toString() {
        return "PRENDA DE NIÑO\n" + super.toString();
    }




}

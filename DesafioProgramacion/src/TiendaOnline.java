public class TiendaOnline {
    private String procesoValidacion;
    private String cargosAsociados;
    private String manejoTransacciones;
    private FormaPago formaPago ;


    public TiendaOnline(String procesoValidacion, String cargosAsociados, String manejoTransacciones) {
        this.procesoValidacion = procesoValidacion;
        this.cargosAsociados = cargosAsociados;
        this.manejoTransacciones = manejoTransacciones;
    }

    public TiendaOnline(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "TiendaOnline{" +
                "procesoValidacion='" + procesoValidacion + '\'' +
                ", cargosAsociados='" + cargosAsociados + '\'' +
                ", manejoTransacciones='" + manejoTransacciones + '\'' +
                ", formaPago=" + formaPago +
                '}';
    }
}

package electrodomesticos;

public class Television extends Electrodomesticos {

    private int resolucion = 20;
    private boolean sintonizadorTdt = false;

    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTdt, int precioTamano, int precioCategoria) {
        super(precioBase, color, consumoEnergetico, peso, precioCategoria, precioTamano);
    }

    public Television() {

    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(int resolucion) {
        this.resolucion = resolucion;
    }

    public Television(boolean sintonizador) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

//Metodos________________________________________________________________________________
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public void PrecioFinal() {

        int totaltv = 0;

        if (resolucion > 40) {
            totaltv = getPrecioBase() + 30; // este 30 representa el 30% adicional del precio base que es de 100

            if (sintonizadorTdt == true) {
                totaltv +=50; // este 50 representa el adicional de 50 € por tener sintonizador 
            }
        }

        
        else {
            if (sintonizadorTdt == true) {
                totaltv = getPrecioBase() + 50;
            }
            
            else{
            totaltv = getPrecioBase();
            }
        }
        System.out.println("Su precio final es de:  " + totaltv);

    }

}

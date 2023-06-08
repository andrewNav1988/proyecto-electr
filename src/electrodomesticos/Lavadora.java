package electrodomesticos;

public class Lavadora extends Electrodomesticos {

    private int carga = 5;
    
    
/*constructor que hereda de la clase padre "Electrodomesticos" junto con atributo "carga" de la presente clase*/
        public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga, int precioCategoria, int precioTamano) {  
        super(precioBase, color, consumoEnergetico, peso, precioCategoria, precioTamano);
        this.carga = carga;
    }

        //constructor precio base heredado de la clase padre " Electrodomesticos"
    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    // constructor por defecto clase lavadora
    public Lavadora() {
    }

    // Metodos ____________________________________________________________________________

    public int getCarga() {
        return carga;
    }
    
   public void precioFinal(){
   }
    
    
    
    
    
    
    
}

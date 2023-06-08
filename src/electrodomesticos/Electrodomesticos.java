package electrodomesticos;

public class Electrodomesticos {
private String prueba;
    private int precioBase = 100;
    private int precioCategoria = 0;
    private int PrecioTamano = 0;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private int Peso = 5;

    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso, int precioCategoria, int precioTamano) { // constructor todoslos atributos
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.Peso = peso;
        this.PrecioTamano = precioTamano;
        this.precioCategoria = precioCategoria;
    }

    public Electrodomesticos(int precioBase, int peso) { // constructor precio, peso
        this.precioBase = precioBase;
        this.Peso = peso;

    }

    public Electrodomesticos() { // cosntructor por defecto

    }

    public Electrodomesticos(String color) { // constructor por defecto para color
        this.color = color;
    }

    public Electrodomesticos(char consumoEnergetico) { // constructor por defecto para consumo energetico
        this.consumoEnergetico = consumoEnergetico;
    }

    // Metodos-----------------------------------------------------------------------------------------------------------------------------------------------------
    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return Peso;
    }

    public int getPrecioCategoria() {
        return precioCategoria;
    }

    public int getPrecioTamano() {
        return PrecioTamano;
    }
    
    

    public void ComprobarConsumoEnergetico(char letra) {
        switch (letra) {

            case 'A':
                precioCategoria += 100;
                consumoEnergetico = 'A';

                break;

            case 'B':
                precioCategoria += 80;
                consumoEnergetico = 'B';

                break;

            case 'C':
                precioCategoria += 60;
                consumoEnergetico = 'C';

                break;

            case 'D':
                precioCategoria += 50;
                consumoEnergetico = 'D';

                break;

            case 'E':
                precioCategoria += 30;
                consumoEnergetico = 'E';

                break;

            case 'F':
                precioCategoria += 10;
                consumoEnergetico = 'F';

                break;
            default:
                precioCategoria += 10;

                System.out.println("Digito una opcion invalida, su consumo sera por defecto el valor igual al consumo F");

        }
    }

    public void ComprobarColor(String color1) {

        if (color1 == "BLANCO" || color1 == "blanco" || color1 == "NEGRO" || color1 == "negro" || color1 == "ROJO" || color1 == "rojo" || color1 == "AZUL" || color1 == "azul" || color1 == "GRIS" || color1 == "gris") {

            this.color = color1;
            System.out.println("si entro al if");

        }
        

    }

    public void comprobarTamano(int peso) {

        if (peso >= 0 && peso <= 19) {
            PrecioTamano += 10;

        }
        if (peso >= 20 && peso <= 49) {
            PrecioTamano += 50;

        }

        if (peso >= 50 && peso <= 80) {
            PrecioTamano += 80;

        }

        if (peso >80) {
            PrecioTamano += 100;

        }
    }

    public void precioFinal(){ // no se utiliza ya que no se usaran los arreglos planteados por el ejericio 
         
    }
}

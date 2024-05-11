package UNOGame;

class Carta {

    private String color;
    private String valor;

    public Carta(String color, String valor) {
        this.color = color;
        this.valor = valor;
    }

    public String obtenerColor() {
        return color;
    }

    public String obtenerValor() {
        return valor;
    }
    
}

package main.java.br.com.utp.trabalho1;

public class Ticket {
    private float price;

    public Ticket() {
    }

    public Ticket(float price) {
        this.price = price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public static void printValue(String type, float price){
        System.out.println("Ingresso: " + type + " Valor: " + price);
    }
}

package main.java.br.com.utp.trabalho1;

public class LowerCabin extends Ticket {
    private String location;

    public LowerCabin(float price, String location) {
        super(price);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void printValue(String type, float price, String location){
        System.out.println("Ingresso: " + type + " Valor: " + price + " Localização: " + location);
    }
}

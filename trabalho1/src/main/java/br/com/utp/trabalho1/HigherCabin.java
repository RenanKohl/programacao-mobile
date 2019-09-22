package main.java.br.com.utp.trabalho1;

public class HigherCabin extends Vip {
    private String location;

    public HigherCabin(float price, float additional, String location) {
        super(price, additional);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void printValue(String type, float price, float aditional, String location){
        System.out.println("Ingresso: " + type + " Valor: " + price + " Adicional: " + aditional + " Localização: " + location);
    }
}

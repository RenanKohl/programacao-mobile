package main.java.br.com.utp.trabalho1;
/**
 * Atividade 6
 * Sexto Exercício do Estudo Dirigido da disciplina de Programação Mobile
 * @author Renan Kohl
 * @version 1.0
 */
public class Atividade6 {
    public static void main(String[] args) {

        Ticket normalTicket = new Ticket(10.0F);
        Ticket.printValue("Ingresso Normal", normalTicket.getPrice());

        Vip vipTicket = new Vip(10.0F, 5.0F);
        Vip.printValue("Ingresso VIP", vipTicket.getPrice());

        LowerCabin camaroteInferior = new LowerCabin(50.0F, "Rua da Sé");
        LowerCabin.printValue("Ingresso Camarote Inferior", camaroteInferior.getPrice(), camaroteInferior.getLocation());

        HigherCabin camaroteSuperior = new HigherCabin(50.0F, 40.0F, "Rua da Sé");
        HigherCabin.printValue("Ingresso Camarote Inferior",camaroteSuperior.getPrice(), camaroteSuperior.getAdditional(), camaroteSuperior.getLocation());

    }
}

package Cooktique;

public class MainApp {
    public static void main(String[] args) {
        Member member = new Member();
        Resep resep = new Resep();
        AssistantAI ai = new AssistantAI();

        member.login();
        resep.buatResep();
        ai.generateRekomendasi();
    }
}

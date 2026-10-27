public class Charmender extends Pokemon implements Evolve {

    public Charmender() {
        super("Charmander", "Fire");
    }

    @Override
    public String cry() {
        return "Char!";
    }

    @Override
    public void evolution() {
        System.out.println(name + " berevolusi menjadi Charmeleon!");
        name = "Charmeleon";
    }
}
public class Pikachu extends Pokemon implements Evolve {

    public Pikachu() {
        super("Pikachu", "Electric");
    }

    @Override
    public String cry() {
        return "Pika Pika!";
    }

    @Override
    public void evolution() {
        System.out.println(name + " berevolusi menjadi Raichu!");
        name = "Raichu";
    }
}

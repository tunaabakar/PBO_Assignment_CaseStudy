public class Mew extends Pokemon implements Flying {

    public Mew() {
        super("Mew", "Psychic");
    }

    @Override
    public String cry() {
        return "Mew~";
    }

    @Override
    public void fly() {
        System.out.println(name + " melayang di udara.");
    }
}
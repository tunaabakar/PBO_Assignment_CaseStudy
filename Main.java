public class Main {
    public static void main(String[] args) {
        Pokemon[] pokedex = { new Pikachu(), new Charmender(), new Mew() };

        for (Pokemon p : pokedex) {
            System.out.println("=== " + p.introduce() + " ===");

            System.out.println("Suara: " + p.cry());

            if (p instanceof Evolve) {
                ((Evolve) p).evolution();
                System.out.println("Sekarang: " + p.introduce());
            } else {
                System.out.println(p.introduce() + " tidak bisa evolve.");
            }

            if (p instanceof Flying) {
                ((Flying) p).fly();
            }
            System.out.println();
        }
    }
}

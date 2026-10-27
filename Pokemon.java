public abstract class Pokemon {
    protected String name;
    protected String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract String cry();

    public String introduce() {
        return name + " (" + type + ")";
    }
}
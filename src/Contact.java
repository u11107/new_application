public abstract class Contact {
        private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract void sendMessage();

    abstract void print();

    public String getName() {
        return name;
    }
}
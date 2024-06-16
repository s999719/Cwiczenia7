
class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Nazwa przedmiotu: " + name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}

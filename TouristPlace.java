public class TouristPlace {
    private int id;
    private String name;
    private String category;
    private double entryFee;

    public TouristPlace(int id, String name, String category, double entryFee) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.entryFee = entryFee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Entry Fee: ₹" + entryFee);
        System.out.println("------------------------");
    }
}
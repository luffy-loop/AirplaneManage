public class Main {
    public static void main(String[] args) {

        BST tourismBST = new BST();

        tourismBST.insert(new TouristPlace(101, "Araku Valley", "Nature", 200));
        tourismBST.insert(new TouristPlace(102, "Borra Caves", "Adventure", 150));
        tourismBST.insert(new TouristPlace(103, "Charminar", "Historical", 50));

        System.out.println("All Tourist Places:");
        tourismBST.displayAll();

        System.out.println("\nSearching for Place ID 102:");

        TouristPlace place = tourismBST.search(102);

        if (place != null) {
            place.display();
        } else {
            System.out.println("Tourist Place Not Found");
        }
    }
}
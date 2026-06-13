package tourism;

public class DestinationManager {
public void displayAllDestinations() {

    System.out.println("\n========== DESTINATIONS ==========");

    System.out.println("\nNature");
    System.out.println("AR101 - Araku Valley");
    System.out.println("AR102 - Lambasingi");
    System.out.println("AR103 - Munnar");

    System.out.println("\nAdventure");
    System.out.println("AD101 - Borra Caves");
    System.out.println("AD102 - Rishikesh");
    System.out.println("AD103 - Manali");

    System.out.println("\nHistorical");
    System.out.println("HI101 - Charminar");
    System.out.println("HI102 - Golconda Fort");
    System.out.println("HI103 - Hampi");

    System.out.println("\nReligious");
    System.out.println("RE101 - Tirupati");
    System.out.println("RE102 - Varanasi");
    System.out.println("RE103 - Srisailam");

    System.out.println("\nBeach");
    System.out.println("BE101 - RK Beach");
    System.out.println("BE102 - Goa");
    System.out.println("BE103 - Kovalam");
}

public void displayCategoryDestinations(String category) {

    System.out.println("\nAvailable Destinations");

    switch(category) {

        case "Nature":

            System.out.println("1. Araku Valley");
            System.out.println("2. Lambasingi");
            System.out.println("3. Munnar");
            break;

        case "Adventure":

            System.out.println("1. Borra Caves");
            System.out.println("2. Rishikesh");
            System.out.println("3. Manali");
            break;

        case "Historical":

            System.out.println("1. Charminar");
            System.out.println("2. Golconda Fort");
            System.out.println("3. Hampi");
            break;

        case "Religious":

            System.out.println("1. Tirupati");
            System.out.println("2. Varanasi");
            System.out.println("3. Srisailam");
            break;

        case "Beach":

            System.out.println("1. Goa");
            System.out.println("2. RK Beach");
            System.out.println("3. Kovalam");
            break;
    }
}
}

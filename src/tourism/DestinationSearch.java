package tourism;

public class DestinationSearch {
public void searchDestination(String destinationId) {

    switch (destinationId.toUpperCase()) {

        case "AR101":
            System.out.println("Destination : Araku Valley");
            System.out.println("Category    : Nature");
            System.out.println("Entry Fee   : Rs.200");
            break;

        case "AR102":
            System.out.println("Destination : Lambasingi");
            System.out.println("Category    : Nature");
            System.out.println("Entry Fee   : Rs.150");
            break;

        case "AD101":
            System.out.println("Destination : Borra Caves");
            System.out.println("Category    : Adventure");
            System.out.println("Entry Fee   : Rs.100");
            break;

        case "HI101":
            System.out.println("Destination : Charminar");
            System.out.println("Category    : Historical");
            System.out.println("Entry Fee   : Rs.50");
            break;

        default:
            System.out.println("Destination Not Found!");
    }
}

}

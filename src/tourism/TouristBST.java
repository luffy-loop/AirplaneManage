package tourism;

class TouristBSTNode {
Tourist tourist;
TouristBSTNode left;
TouristBSTNode right;

public TouristBSTNode(Tourist tourist) {

    this.tourist = tourist;
    this.left = null;
    this.right = null;
}
}

public class TouristBST {
private TouristBSTNode root;

public TouristBST() {

    root = null;
}

public void insert(Tourist tourist) {

    root = insertRec(root, tourist);
}

private TouristBSTNode insertRec(TouristBSTNode root, Tourist tourist) {

    if (root == null) {

        return new TouristBSTNode(tourist);
    }

    int currentId = Integer.parseInt(
            tourist.getTravelId().replace("YT", "")
    );

    int rootId = Integer.parseInt(
            root.tourist.getTravelId().replace("YT", "")
    );

    if (currentId < rootId) {

        root.left = insertRec(root.left, tourist);

    } else if (currentId > rootId) {

        root.right = insertRec(root.right, tourist);
    }

    return root;
}

public Tourist search(String travelId) {

    return searchRec(root, travelId);
}

private Tourist searchRec(TouristBSTNode root, String travelId) {

    if (root == null) {

        return null;
    }

    if (root.tourist.getTravelId().equalsIgnoreCase(travelId)) {

        return root.tourist;
    }

    int searchId = Integer.parseInt(
            travelId.replace("YT", "")
    );

    int rootId = Integer.parseInt(
            root.tourist.getTravelId().replace("YT", "")
    );

    if (searchId < rootId) {

        return searchRec(root.left, travelId);
    }

    return searchRec(root.right, travelId);
}

}

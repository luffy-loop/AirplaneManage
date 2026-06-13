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
public void displayAllTourists() {

    System.out.println(
            "\n===== TOURIST RECORDS =====");

    inorder(root);
}

private void inorder(TouristBSTNode root) {

    if (root != null) {

        inorder(root.left);

        System.out.println(
                root.tourist.getTravelId()
                + " - "
                + root.tourist.getName()
        );

        inorder(root.right);
    }
}

public void delete(String travelId) {

    root = deleteRec(root, travelId);
}

private TouristBSTNode deleteRec(
        TouristBSTNode root,
        String travelId) {

    if (root == null) {
        return null;
    }

    int deleteId =
            Integer.parseInt(
                    travelId.replace("YT", "")
            );

    int rootId =
            Integer.parseInt(
                    root.tourist.getTravelId()
                            .replace("YT", "")
            );

    if (deleteId < rootId) {

        root.left =
                deleteRec(root.left,
                        travelId);

    } else if (deleteId > rootId) {

        root.right =
                deleteRec(root.right,
                        travelId);

    } else {

        if (root.left == null) {
            return root.right;
        }

        if (root.right == null) {
            return root.left;
        }

        root.tourist =
                minValue(root.right);

        root.right =
                deleteRec(
                        root.right,
                        root.tourist.getTravelId()
                );
    }

    return root;
}

private Tourist minValue(
        TouristBSTNode node) {

    Tourist min =
            node.tourist;

    while (node.left != null) {

        min = node.left.tourist;
        node = node.left;
    }

    return min;
}
}

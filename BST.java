class BSTNode {
    TouristPlace place;
    BSTNode left;
    BSTNode right;

    public BSTNode(TouristPlace place) {
        this.place = place;
        left = null;
        right = null;
    }
}

public class BST {
    private BSTNode root;

    public BST() {
        root = null;
    }

    public void insert(TouristPlace place) {
        root = insertRec(root, place);
    }

    private BSTNode insertRec(BSTNode root, TouristPlace place) {
        if (root == null) {
            return new BSTNode(place);
        }

        if (place.getId() < root.place.getId()) {
            root.left = insertRec(root.left, place);
        } else if (place.getId() > root.place.getId()) {
            root.right = insertRec(root.right, place);
        }

        return root;
    }
}
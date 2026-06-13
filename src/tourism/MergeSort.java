package tourism;

public class MergeSort {
public void sortByRating(Hotel[] hotels, int left, int right) {

    if (left < right) {

        int mid = (left + right) / 2;

        sortByRating(hotels, left, mid);
        sortByRating(hotels, mid + 1, right);

        merge(hotels, left, mid, right);
    }
}

private void merge(Hotel[] hotels, int left, int mid, int right) {

    int n1 = mid - left + 1;
    int n2 = right - mid;

    Hotel[] L = new Hotel[n1];
    Hotel[] R = new Hotel[n2];

    for (int i = 0; i < n1; i++) {
        L[i] = hotels[left + i];
    }

    for (int j = 0; j < n2; j++) {
        R[j] = hotels[mid + 1 + j];
    }

    int i = 0;
    int j = 0;
    int k = left;

    while (i < n1 && j < n2) {

        if (L[i].getRating() >= R[j].getRating()) {

            hotels[k] = L[i];
            i++;

        } else {

            hotels[k] = R[j];
            j++;
        }

        k++;
    }

    while (i < n1) {

        hotels[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {

        hotels[k] = R[j];
        j++;
        k++;
    }
}
}

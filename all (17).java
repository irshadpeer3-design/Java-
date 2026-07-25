import java.util.*;
class Search {

    public static int linerSearch(int[] a, int key) {
        int l = 0, h = a.length - 1, mid;

        while (l <= h) {
            mid = (l + h) / 2;

            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int key = 40;

        System.out.println(linerSearch(a, key));
    }
} 

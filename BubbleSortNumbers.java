public class BubbleSortNumbers {
    public static void main(String[] args) {
        int[] array = {4, 6, 22, -5, 68, 87};
        sort(array);
    }

    public static void sort(int[] array) {
        int temp;
        int bad = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - 1 - i; k++) {
                if (array[k] > array[k + 1]) {
                    temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    bad = 1;
                }
            }
            if (bad == 0) {
                break;
            }
        }
        for (int g : array) {
            System.out.println(g);
        }
    }
}

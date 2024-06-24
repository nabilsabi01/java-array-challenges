public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 3, 9, 1, 5};

        sortArr(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArr(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }


}
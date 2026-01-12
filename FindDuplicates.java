public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                    break;
                }
            }
        }
        if (!foundDuplicate) {
            System.out.print("No duplicates found");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6};
        findDuplicates(arr);
    }
}

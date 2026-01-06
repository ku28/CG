public class PatternRotation {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[(i+j)%n]);
            }
            System.out.println();
        }
    }
}

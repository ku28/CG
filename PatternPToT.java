public class PatternPToT {
    public static void main(String[] args) {
        int rows = 5;
        char patternChar = 'P';
        for(int i=0;i<rows;i++) {
            for(int j=i;j<rows;j++) {
                System.out.print(patternChar);
            }
            System.out.println();
            patternChar++;
        }
    }
}

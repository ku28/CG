import java.util.Scanner;

public class StudentVoteChecker {
    
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        
        return age >= 18;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StudentVoteChecker checker = new StudentVoteChecker();
            int[] ages = new int[10];
            
            for (int i = 0; i < 10; i++) {
                ages[i] = sc.nextInt();
            }
            
            for (int i = 0; i < 10; i++) {
                boolean canVote = checker.canStudentVote(ages[i]);
                if (canVote) {
                    System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote");
                } else {
                    System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote");
                }
            }
        }
    }
}

import java.util.Scanner;

 public class StudentGradeCalculator {
  public static void main(String[]args){
    // Asking the student for the numbers of subject.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of subjects: ");
    int numSubjects = input.nextInt();

    // An array to store marks of each subject.
    int[] marks = new int[numSubjects];

    // Asking the student for marks for each subject
    for(int i = 0; i < numSubjects; i++){
      System.out.print("Enter obtained marks in subject " + (i+1) + " out of 100: ");
      int mark = input.nextInt();
      marks[i] = mark;
    }

    // Calculating average of obtained marks
      int totalMarks = 0;
      for(int i : marks){
        totalMarks += i;
      }
        float average = (float)totalMarks / numSubjects;

    // for the grades of students according to their respective marks.
         if(average > 75 && average<=100){
            System.out.println("Average mark: " + average);
            System.out.println("You got A Grade.");
         }else if(average > 50 && average < 75){
            System.out.println("Average mark: " + average);
            System.out.println("You got B Grade.");
         }else if(average > 25 && average < 50){
            System.out.println("Average mark: " + average);
            System.out.println("You got C Grade.");
         }else if(average>0 && average<25){
            System.out.println("Average mark: " + average);
            System.out.println("You got D Grade.");
         }else{
            System.out.println("Please enter the number obtained out of 100.And don,t try to cheat");
    }
        System.out.println("end");
  }
}
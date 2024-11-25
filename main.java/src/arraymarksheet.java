public class arraymarksheet {
        public static void main(String[] args) {
            // Student and subjects data
            String studentName = "Abubakar";
            String[] subjects = {"Math", "English", "Science", "History", "Computer"};
            int[] marks = {85, 90, 78, 88, 92}; // Marks obtained
            int totalMarks = 500; // Maximum possible marks
            
            // Calculate total obtained marks
            int obtainedMarks = 0;
            for (int mark : marks) {
                obtainedMarks += mark;
            }
            
            // Calculate percentage
            double percentage = (double) obtainedMarks / totalMarks * 100;
            
            // Determine grade
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else {
                grade = "F";
            }
            
            // Display marksheet
            System.out.println("Marksheet");
            System.out.println("----------");
            System.out.println("Student Name: " + studentName);
            System.out.println("Subjects and Marks:");
            for (int i = 0; i < subjects.length; i++) {
                System.out.println(subjects[i] + ": " + marks[i]);
            }
            
            System.out.printf("\nTotal Obtained Marks: %d/%d\n" ,obtainedMarks  , totalMarks);
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.printf("Grade: %s" ,grade);
        }
    }
    

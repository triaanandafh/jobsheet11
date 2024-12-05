import java.util.Scanner;
public class weeklyGrades21 {
    public static void inputGrade(String name[], int weekNum[][], int student, int week){
        Scanner input21 = new Scanner(System.in);

        for(int i=0; i<student; i++){
            System.out.print("Enter students name: ");
            name[i] = input21.nextLine();
            for(int j=0; j<week; j++){
                System.out.print("Enter grade of week-" + (j+1)+ ": ");
                weekNum[i][j]= input21.nextInt();
            }
            input21.nextLine();
            System.out.println();
        }
    }

    public static void displayStudentGrade(String name[], int weekNum[][], int student, int week){
        System.out.println("All the students grade:");
        for(int i=0; i<student; i++){
            System.out.print(name[i] + ": ");
            for(int j=0; j<week;j++){
                System.out.print(weekNum[i][j] + " ");
            }
            
            System.out.println();
            
        }
        System.out.println();
    }

    public static void weekHighestGrade(int weekNum[][], int student, int week){
        int highGrade = 0;
        int highestGrade=0, weeknum = -1;
        for(int j=0; j<week;j++){
            for(int i=0; i<student;i++){
                highGrade+= weekNum[i][j];
                if(highGrade> highestGrade){
                    highestGrade=highGrade;
                    weeknum=j+1;
                }
            }
        }
    }

    public static void bestGrade(String name[], int weekNum[][], int student, int week){
        
            int highestgrade = 0;
            String bestStudents = "";
            for(int i=0; i< student;i++){
                for(int j=0;j<week;j++)
                if(weekNum[i][j] > highestgrade){
                    highestgrade =weekNum[i][j];
                    bestStudents=name[i];
                }
            }
            System.out.println("Student with the highest grade: " + bestStudents);
        for(int j=0; j<week;j++){
            int highestGrade=0;
            for(int i=0;i<student;i++){
                if(weekNum[i][j] > highestGrade)
                highestGrade = weekNum[i][j];

            }
            System.out.println("The highest grade for week-"+ (j+1)+ ": "+highestGrade);
        }
        }
       
        
    
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int student, week;
        System.out.print("Input the number of student: ");
        student = input21.nextInt();
        System.out.print("Input the number of week: ");
        week = input21.nextInt();

        input21.nextLine();
        String [] name = new String[student];
        int [][] weekNum = new int [student][week];
        inputGrade(name, weekNum, student, week);
        displayStudentGrade(name, weekNum, student, week);
        weekHighestGrade(weekNum, student, week);
        bestGrade(name, weekNum, student, week);
    }
}

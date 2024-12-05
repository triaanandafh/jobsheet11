import java.util.Scanner;
public class weeklyGrades21 {
    public static void inputGrade(String name[], int weekNum[][]){
        Scanner input21 = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.print("Enter students name: ");
            name[i] = input21.nextLine();
            for(int j=0; j<7; j++){
                System.out.print("Enter grade of week-" + (j+1)+ ": ");
                weekNum[i][j]= input21.nextInt();
            }
            input21.nextLine();
            System.out.println();
        }
    }

    public static void displayStudentGrade(String name[], int weekNum[][]){
        System.out.println("All the students grade:");
        for(int i=0; i<5; i++){
            System.out.print(name[i] + ": ");
            for(int j=0; j<7;j++){
                System.out.print(weekNum[i][j] + " ");
            }
            
            System.out.println();
            
        }
        System.out.println();
    }

    public static void weekHighestGrade(int weekNum[][]){
        int highGrade = 0;
        int highestGrade=0, week = -1;
        for(int j=0; j<7;j++){
            for(int i=0; i<5;i++){
                highGrade+= weekNum[i][j];
                if(highGrade> highestGrade){
                    highestGrade=highGrade;
                    week=j+1;
                }
            }
        }
    }

    public static void bestGrade(String name[], int weekNum[][]){
        
            int highestgrade = 0;
            String bestStudents = "";
            for(int i=0; i< 5;i++){
                for(int j=0;j<7;j++)
                if(weekNum[i][j] > highestgrade){
                    highestgrade =weekNum[i][j];
                    bestStudents=name[i];
                }
            }
            System.out.println("Student with the highest grade: " + bestStudents);
        for(int j=0; j<7;j++){
            int highestGrade=0;
            for(int i=0;i<5;i++){
                if(weekNum[i][j] > highestGrade)
                highestGrade = weekNum[i][j];

            }
            System.out.println("The highest grade for week-"+ (j+1)+ ": "+highestGrade);
        }
        }
       
        
    
    public static void main(String[] args) {
        String [] name = new String[5];
        int [][] weekNum = new int [5][7];
        inputGrade(name, weekNum);
        displayStudentGrade(name, weekNum);
        weekHighestGrade(weekNum);
        bestGrade(name, weekNum);
    }
}

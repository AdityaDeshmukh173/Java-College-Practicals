import java.util.Scanner;

public class Second {
    public static void main(String[] args){

        Scanner scanit = new Scanner(System.in);
        int[] rollno = new int[10];
        String[] name = new String[10];
        int[][] marks =  new int[10][5];
        double[] grade = new double[10];

        for(int i=0;i<=9;i++){
            System.out.println("Rollno["+i+"]");
            rollno[i] = scanit.nextInt();
            System.out.println("Name["+i+"]");
            name[i] = scanit.next();
            for(int j=0;j<=4;j++){
                System.out.println("Marks["+i+"]["+j+"]");
                 marks[i][j] = scanit.nextInt();
            }
            System.out.println(".........");
        }
        for(int i=0;i<=9;i++)
            grade[i]=(marks[i][0]+marks[i][1]+marks[i][2]+marks[i][3]+marks[i][4])/50;
        
        System.out.println("Top band Stundents...");    
        for(int i=0;i<=9;i++){
            if(grade[i]>=8){
                System.out.println("Roll no. >> "+rollno[i]);
                System.out.println("Name >> "+name[i]);
                for(int j=0;j<=4;j++)
                    System.out.println("Marks Sub["+(j+1)+"] >> "+marks[i][j]);
                
                System.out.println("Grade >> "+grade[i]);
            }
        }
        scanit.close();       

    }
}

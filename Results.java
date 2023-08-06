import java.util.Scanner;

 public class Results
{
    public static void main(String[] args) 
    {   
        Scanner scanit = new Scanner(System.in);

        int[] rn = new int [10];
        String[] name = new String[10];
        float [] marks = new float [10];
        float[] grades = new float[10];
        
        System.out.println("Enter Students Roll number, Name, Marks. ");
        
        for(int i=0 ; i<10 ;i++ )
        {
            System.out.println(i+"roll no.");
            rn[i] = scanit.nextInt();
            System.out.println("Name ");
            name[i] = scanit.next();
            System.out.println("Marks out of 500 ");
            marks[i] = scanit.nextFloat();
            
            grades[i] = (marks[i]/500)*10 ;
            System.out.println("Grade is "+grades[i]);
        }
        scanit.close();

        System.out.println("Students with A grade ");

        for(int k=0 ; k<9 ; k++)
        {
            if (grades[k] >= 8)
            {
                System.out.println(rn[k]+"");
                System.out.println(name[k]+"");
                System.out.println(marks[k]+"");
                System.out.println(grades[k]+"");
            }
        }


    }

}
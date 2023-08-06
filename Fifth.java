import java.util.Scanner;

public class Fifth {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        System.out.println(word.charAt(0)+" "+word.charAt(word.length()-1)+" "+word.substring(1, word.length()-1));

        String name = sc.nextLine();
        System.out.print(name.charAt(0));

        for(int i=1 ; i < name.length() ; i++)
        if(name.charAt(i)==' ')
        {
            System.out.print(" "+name.charAt(i+1));
        }
    }
}

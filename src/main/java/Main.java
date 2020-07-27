import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Average of the list\n2. Get the string starts with 'a' and length 3\n3. Palindrome Strings.\nEnter your choice : ");
        int n=sc.nextInt();

        if(n>0 && n<=3){
            System.out.println("Enter list length:");
            int m=sc.nextInt();
            if(n==1){
                System.out.println("Enter list of integers:");
                List<Integer> b = new ArrayList<>();
                for(int i=0;i<m;++i){
                    b.add(sc.nextInt());
                }
                Averagelist a=new Averagelist();
                System.out.println("Average: "+a.calculate(b));
            }
            else if(n==2){
                System.out.println("Enter strings line by line:");
                List<String> b=new ArrayList<>();
                for(int i=0;i<=m;++i){
                    b.add(sc.nextLine());
                }
                Stringss a=new Stringss();
                b=a.calculate(b);
                System.out.println("List that matches");
                for(String i: b){
                    System.out.println(i);
                }
            }
            else if(n==3){
                System.out.println("Enter strings ny line:");
                List<String> b=new ArrayList<>();
                for(int i=0;i<=m;++i){
                    b.add(sc.nextLine());
                }
                Stringslist a=new Stringslist();
                b=a.calculate(b);
                System.out.println("List of Palindrome strings");
                for(String i: b){
                    System.out.println(i);
                }
            }
        }
    }
}

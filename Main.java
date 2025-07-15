import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("main start");
        System.out.println("enter a string to reverse");
        String name=sc.nextLine();
        String reversed="";
        for(int i=name.length()-1;i>=0;i--){
            reversed+=name.charAt(i);
        }
        if(name.equals(reversed)){
            System.out.println("String is Plaindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
        
        sc.close();
    }
}

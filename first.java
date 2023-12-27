import java.util.Scanner;

public class first{
     public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n;
        System.out.println("enter the value of n");
        n=x.nextInt();
      char ch='a';
      int d=(int)ch;
      for(int i=0;i<n;i++){
        if(i%3==0){
          System.out.println(i);
        }
      }
      System.out.println(d);
        System.out.println("hloo");
    }
}
import java.util.Scanner;
class second{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int z;
     System.out.print("enter the value of z");
     z=sc.nextInt();
     int sum=0;
     for(int i=0;i<=z;i++){
        sum=sum+i;
     }
     System.out.println("sum of "+ z+" numbers is :"+ sum );
    }
}
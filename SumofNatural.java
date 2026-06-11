import java.util.Scanner;
class SumofNatural{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter the number upto add:");
        int n=ip.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of"+n+" numbers is:"+sum);
    }
}



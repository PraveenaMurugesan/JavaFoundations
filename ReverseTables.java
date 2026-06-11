import java.util.Scanner;
class ReverseTables{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter multiplicand:");
        int n=ip.nextInt();
        System.out.print("Enter the multiplier:");
        int m=ip.nextInt();
        for(int i=m;i>=1;i--){
            int result=n*i;
            System.out.println(i+"*"+n+"="+result);
        }
    }
}

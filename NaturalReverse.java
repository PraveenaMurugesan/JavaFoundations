import java.util.Scanner;
class NaturalReverse{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=ip.nextInt();
        for(int i=n;i>=1;i--)
            System.out.print(i+" ");
    }
}

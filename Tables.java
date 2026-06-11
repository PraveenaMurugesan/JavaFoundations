import java.util.Scanner;
class Tables{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter the multiplicand:");
        int n=ip.nextInt();
        System.out.print("Enter the multiplier:");
        int m=ip.nextInt();
        for(int i=1;i<=m;i++){
            int result=n*i;
            System.out.println(n+"*"+i+"="+result);
        }
    }
}

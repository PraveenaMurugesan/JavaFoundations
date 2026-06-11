import java.util.*;
public class SumofOdd {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter the number up to add:");
        int n=ip.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                sum=sum+i;
        }
        System.out.println("The sum upto "+n+" is: "+sum);
    }
}

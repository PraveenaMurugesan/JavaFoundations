import java.util.*;
class OddNumbers{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }
    }
}
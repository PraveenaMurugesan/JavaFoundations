import java.util.*;
class LongestPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] freq=new int[128];
        for(char ch:s.toCharArray())
             freq[ch]++;
        int length=0;
        boolean oddFound=false;
        for(int count:freq){
            if(count%2==0)
                length=length+count;
            else{
                length=count-1;
                oddFound=true;
            }
        }
        if(oddFound)
            length++;
        System.out.println(length);
    }
}

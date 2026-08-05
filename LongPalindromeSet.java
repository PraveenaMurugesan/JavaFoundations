import java.util.*;
class LongPalindromeSet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashSet<Character> set=new HashSet<>();
        int length=0;
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
                length+=2;
            }
            else
                set.add(ch);
        }
        if(!set.isEmpty())
            length++;
    System.out.println(length);
    }
}

import java.util.*;
class Solution {
    public static void romanToInt(String s) {

        HashMap<Character,Integer> hm=new HashMap<>();

        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
int count=0;
        for(int i=s.length();i>0;i++)
        {
            if(hm.get(s.charAt(i)) != null)
            count+=hm.get(s.charAt(i));


        }
        System.out.println(count);

        
    }
    public static void main(String[] args)
    {
        String s="III";

        romanToInt(s);

    }
}
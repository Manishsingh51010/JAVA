import java.util.*;
public class stringfreq{
static void prints(String s)
{
int n=s.length();
int freq[]=new int[n];
int i;
for(i=0;i<n;i++){
freq[s.charAt(i)-'a']++;
}
for(i=0;i<n;i++){
if(freq[s.charAt(i)-'a']!=0){
System.out.print(s.charAt(i));
				
System.out.print(freq[s.charAt(i) - 'a'] + " "); 
				
freq[s.charAt(i) - 'a'] = 0;
}
}



}

public static void main(String args[])
{
String s="aabbccc";
prints(s);

}


}

import java.util.*;
class cla{  
public static void main(String args[]){  
int s=0;
int i;
for(i=0;i<args.length;i++){

s=s+Integer.parseInt(args[i]);
}
System.out.println("sum of argument is: "+s);  
}  
}

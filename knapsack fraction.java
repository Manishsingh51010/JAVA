import java.util.*;
public class knapsack fraction{
  public static void main(String args[]){
  int a1[]={280,100,120,120};
  int a2[]={40,10,20,24};
  int r[]=new int[5];
  int n,maxweight=60,checkweight=0,price=0,rem;
  Scanner sc = new Scanner(System.in);
  n=sc.nextInt();
   for(int i=0;i<n;i++){
   r[i]=a1[i]/a2[i];
    }
  for(int i=0;i<n;i++){
   for(int j=i;j<n-i-1;j++){
        if(r[j]<=r[j+1]){
         int temp=r[j];
	 r[j]=r[j+1];
	 r[j+1]=temp;
 	 temp=a1[i];
	 a1[j]=a1[j+1];
	 a1[j+1]=temp;
 	 temp=a2[j];
	 a2[j]=a2[j+1];
	 a2[j+1]=temp;
          }
        }
      }
  checkweight=a2[0];
  for(int i=0;i<n;i++){
   if(checkweight<=maxweight)
      price = price + a1[i];
   else{
       rem=checkweight-maxweight;
       price=price+(rem*r[i]);
       break;
     }
	checkweight=checkweight+a2[i+1];
   }
System.out.println("price:"+price);
  }
 }

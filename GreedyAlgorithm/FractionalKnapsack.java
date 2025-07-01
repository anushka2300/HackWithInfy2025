import java.util.*;
class Item{
    int weight;
    int val;
public Item(int wei,int val){
    weight=wei;
    this.val=val;
}
}
public class FractionalKnapsack{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int W=sc.nextInt();

int arr[][]=new int[n][2];
for(int i=0;i<n;i++){
    arr[i][0]=sc.nextInt();
    arr[i][1]=sc.nextInt();
}
Arrays.sort(arr,(a,b)->(b[0]/b[1])-(a[0]/a[1]));

int sum=0;
int ans=0;
for(int i=0;i<n;i++){
    if(sum+arr[i][1]<=W){
        sum+=arr[i][1];
        ans+=arr[i][0];
    }
    else{
        ans=ans+(arr[i][0]/arr[i][1])*(W-sum);
        break;
    }
}
System.err.println(ans);



sc.close();
}
}

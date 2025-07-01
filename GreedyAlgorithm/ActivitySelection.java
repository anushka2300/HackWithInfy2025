import java.util.*;
public class ActivitySelection{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[][]=new int[n][n];
for(int i=0;i<n;i++){
    arr[i][0]=sc.nextInt();
    arr[i][1]=sc.nextInt();
}
Arrays.sort(arr,(a,b)->a[1]-b[1]);
int cnt=1;
int l=arr[0][1];
for(int i=0;i<n;i++){
    if(arr[i][0]>=l) {
        cnt++;
        l=arr[i][1];
    }
}
System.out.println(cnt);
sc.close();
}
}
import java.util.*;
public class MinimumCoins{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int amnt=sc.nextInt();
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
Arrays.sort(arr);
int cnt=0;
for(int i=n-1;i>=0;i--){

    while(amnt>=arr[i]){
        System.out.println(arr[i]);
        amnt-=arr[i];
        cnt++;
    }
}
System.out.println(cnt);

}
}
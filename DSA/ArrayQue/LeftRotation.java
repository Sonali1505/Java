public class LeftRotation{
    public static void main(String args[]){
        int arr[] = {1,5,8,3};
        int n=1;
        for(int i=0;i<n;i++){
            int first=arr[0];
            int j;
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
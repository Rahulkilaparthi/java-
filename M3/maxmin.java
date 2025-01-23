


public class maxmin{
    public static void  main(String[] args){
        int[] arr={10,25,34,21,34,342,3};
        int max_value =arr[0];
        int min_value = arr[0];
        for (int i=1; i<arr.length;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
            if(arr[i]<min_value){
                min_value=arr[i];
            }
        }
        System.out.println("Maximum value: " + max_value);
        System.out.println("Minimum value: " + min_value);
    }

}
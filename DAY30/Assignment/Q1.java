package DataStructuresAlgorithm.DAY30.Assignment;

public class Q1 {
    /*
    Q1 - Given an array of strings arr[]. Sort given strings using Bubble Sort and display the sorted
    array.
    Input1:  n = 3
             arr[] = [coding, is, fun]
    Output2: Coding fun is
    Input2: n = 5
            arr[] = [string, two, is, this]
    Output2:
            is string this two
     */
    public static void bubble(String[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[i].compareTo(arr[j]) < 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        String arr[] = {"coding", "is", "fun"};

        bubble(arr);
        for(int i= 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

}

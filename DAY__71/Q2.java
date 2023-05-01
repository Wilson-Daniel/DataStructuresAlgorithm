package DataStructuresAlgorithm.DAY__71;

public class Q2 {
    public static void main(String[] args) {
        int[] map = new int[5*104];
        map[0] = -1;
        int ans = map[0];
        int[] nums = {2,2,1,1,1,2,2,};
        System.out.println(retMajor(nums,map,0,nums.length-1,ans));
        for(int i: map){
            System.out.print(i+" ");
        }
    }
    public static int retMajor(int[] arr,int[] map,int si,int ei,int ans){
        if(si<=ei){
            return 0;
        }
        int mid = si + (ei-si)/2;
        retMajor(arr,map,si,mid,ans);
        retMajor(arr,map,mid+1,ei,ans);
        Major(arr,map,si,mid,ei,ans);
        return ans;
    }
    public static void Major(int[] arr,int[] map,int si,int mid,int ei,int ans){
        int i= si;
        int j=mid+1;
        int k=0;

        while(i<=mid){
            map[i]++;
            if(map[arr[i]]>map[ans]){
                ans = map[arr[i]];
            }
        }
        while(j<=ei){
            map[arr[j]]++;
            if(map[arr[j]]>map[ans]){
                ans = map[arr[j]];
            }
        }

    }

}

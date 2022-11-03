package com.package1;

public class TwoSum{
    int[] arr={1,2,3,4,5,6};
    int n=8;
    void func(){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println(+i+","+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        TwoSum obj=new TwoSum();
        obj.func();
    }
}

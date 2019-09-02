package com.example.demo;

/**
 * @author liuqian
 * @date 2019/9/2 20:31
 */
public class sourt {

    public static void main(String[] args) {
        System.out.println("测试-----------------------");

        // 冒泡排序
        int arr[] = {8,7,4,5,2,6,3,1};
        int length = arr.length;
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length - i -1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i <length ; i++) {
            System.out.println(arr[i]);
        }

        // 选择排序
        for (int i = 0; i < length - 1; i++) {
            for (int j = i+1; j < length -1 ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i <length ; i++) {
            System.out.println(arr[i]);
        }
    }
}

package day05;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 8, 2, 3, 7, 9, 10, 20, 17, 14, 13, 16, 18};
        //记录最后一次交换的位置
        int lastChangIndex = 0;
        //数组的边界，每次比较只需要比到这里为止
        int len = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            //标记是否有序，每一轮的初始是true
            boolean isSort = true;
            for (int j = 0; j < len; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //有元素交换，所以不是有序，标记变为false
                    isSort = false;
                    //把无序数组的边界更新为最后一次交换元素的位置
                    lastChangIndex = j;
                }
            }
            len = lastChangIndex;
            System.out.println(len);
            if (isSort) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

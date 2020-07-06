package 数组;
/*
1299. 将每个元素替换为右侧最大元素
输入：arr = [17,18,5,4,6,1]
输出：[18,6,6,6,1,-1]
*/
public class ReplaceElements {
    public static void main(String[] args) {
        int [] test={17,18,5,4,6,1};
        int[] a=replaceElements( test );
        printArray(a);

    }

    private static void printArray(int[] a) {
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public  static int[] replaceElements(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            int max=getMax(arr,i+1,arr.length-1);
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return  arr;
    }

    private static int getMax(int[] arr, int l, int r) {
        int max=arr[l];
        for(int i=l;i<=r;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

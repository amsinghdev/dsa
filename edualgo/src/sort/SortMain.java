package sort;

public class SortMain {
    private static int[] arr = new int[]{10,5,4,16,2,1};
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        print("before sort");
        ss.sort(arr);
        print("after sort");
    }

    public static void print(String str){
        System.out.println(str);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
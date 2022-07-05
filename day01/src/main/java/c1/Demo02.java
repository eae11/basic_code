package c1;

public class Demo02 {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,5,7,8};
        printArray(array);
    }
    public  static  void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

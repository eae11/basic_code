package c1;

public class Demo01 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        /*int min=0;
        int max=a.length-1;
        *//*while(min<max){
            int temp=a[min];
            a[min]=a[max];
            a[max]=temp;
            min++;
            max--;
        }*/
        for(int min=0,max=a.length-1;min<max;min++,max--){
            int temp=a[min];
            a[min]=a[max];
            a[max]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

package cn.c2;

public class D7 {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 20);
        Person three = new Person("马尔扎哈", 100);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]); //地址值
        System.out.println(array[1]); //地址值
        System.out.println(array[2]); //地址值
        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
    }
}

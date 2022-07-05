package c3;


public class DemoArrayObject {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 20);
        Person three = new Person("马尔扎哈", 100);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0].getName());
    }
}

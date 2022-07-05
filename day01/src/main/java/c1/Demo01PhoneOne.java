package c1;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388;
        one.color = "玫瑰金";
        return one;
    }
}

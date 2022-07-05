package c1;

public class Person1 {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫:"+name+","+"年龄:"+age);
    }
    public void setName(int num){
        if(num<0){
            System.out.println("数据不合理");
        }
        else{
            age=num;
        }
    }
    public int getName(){
        return age;
    }
}

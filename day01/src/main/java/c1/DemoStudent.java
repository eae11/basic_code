package c1;

public class DemoStudent {
    public static void main(String[] args) {
        Student student=new Student();
        Student stu2=new Student("迪丽热巴",23);
        System.out.println("姓名:"+stu2.getName()+",年龄:"+stu2.getAge());
    }
}

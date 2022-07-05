package cn.c27;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String s = "我的名字是:" + name + "年龄为:" + age;
        return s;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj == this) {
//            return true;
//        }
//        if (obj instanceof Person) {
//            Person p = (Person) obj;
//            return (p.name.equals(this.name) && p.age == this.age);
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        //getClass() != o.getClass()  使用反射技术，判断o是否是Person类型  等效于obj instanceof Persson
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

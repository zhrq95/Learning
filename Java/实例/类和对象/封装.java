package 实例.类和对象;

class Student{

    private String name; // 加了 private 修饰符只能在本类中访问
    private char gender;
    private int age;

    public void Study(){
        System.out.println(name + "在学习");
    }
    public void introduce(){
        System.out.println("名字："+ name + "  性别："+ gender + "年龄：" + age);
    }

    public void setName(String a){  // 使得外部类可以通过这个 public 的方法间接访问内部 private 的数据
        name = a;
    }
    public void setGender(char b){
        gender = b;
    }
    public void setAge(int c){
        age = c;
    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}

public class 封装 {
    public static void main(String[] args) {
       Student student = new Student();
       student.introduce();
       student.setName("张三");
       student.setGender('男');
       student.setAge(18);
       student.introduce();
       System.out.println(student.getName());
       System.out.println(student.getGender());
       System.out.println(student.getAge());
    }

}
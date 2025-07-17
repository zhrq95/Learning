package 实例.类和对象;

class Teacher{
    String name;
    int age;
    String lesson;
    static int teacherCount;

    // 对象方法，每一个 Teacher 的实例可以使用
    public void teach(){
        System.out.println(this.name + "教课");
    }

    // 类方法主要用于写工具类，可以方便的 类名.类方法名 调用工具类中的方法
    // 类方法，类方法中不能使用对象的属性（如：name、age、lesson)！只能使用类属性（如：teacherCount）。
    public static void sleep(){
        System.out.println(teacherCount + "睡觉"); // Teacher.teacherCount 为引用类属性，同一个类中，类名 Teacher可以省略。
    }
}

public class static关键字修饰在方法上 {
    public static void main(String[] args){
        Teacher.sleep(); // 调用类方法：类名.类方法。使用对象名.类方法 也可以调用，但不推荐。
        Teacher t = new Teacher();
        t.name = "李老师";
        t.teach();
    }
}
package 实例.类和对象;

class User{
    String username;
    String password;
    static int userCount; // 加上 static 关键字后，属性即为类属性

    public void introduce(){
        System.out.println("用户名：" + username + "  密码：" + password);
    }
}

/*
    类属性的生命周期：
        User.class 加载到 jvm 时类属性就产生了； jvm 消失时，类属性跟着消失。
    对象属性的生命周期：
        当对象被创建时产生； 当对象所在方法执行完毕后就会被垃圾回收器回收。
 */

public class static关键字修饰在属性上 {
    public static void main(String[] args) {
        User user1 = new User();
        User.userCount ++; // 调用类属性： 类名.类属性。使用对象名.类属性也可以调用，但不推荐
        User user2 = new User();
        User.userCount ++;
        System.out.println("人数：" + User.userCount);
    }
}
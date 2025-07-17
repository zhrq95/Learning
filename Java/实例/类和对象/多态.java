package 实例.类和对象;

public class 多态 {

    // 实例化保存四边形对象的数组对象
    private 多态[] qtest = new 多态[6];
    private int nextIndex = 0;

    // 定义 draw() 方法，参数为四边形对象
    public void draw(多态 q){
        if (nextIndex < qtest.length){
            qtest[nextIndex] = q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args){
        多态 q = new 多态();
        q.draw(new Square());  // 以正方形对象为参数调用 draw() 方法
        q.draw(new Parallelogramgle());  // 以平行四边形对象为参数调用 draw() 方法
    }
}

// 定义一个正方形类
class Square extends 多态{
    public Square(){
        System.out.println("正方形");
    }
}

// 定义一个平行四边形类
class Parallelogramgle extends 多态{
    public Parallelogramgle() {
        System.out.println("平行四边形");
    }
}
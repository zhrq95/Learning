package 实例.类和对象;

public class 成员变量 {

    private String name;
    public String getName(){
        int id =0;
        setName("Java");
        return id + this.name;
    }
    private void setName(String name){
            this.name = name;
    }
    public 成员变量 getBook(){
            return this;
    }

    public static void main(String[] args) {
        成员变量 a1 = new 成员变量();
        a1.setName("hello");
        System.out.println(a1.name);
        System.out.println(a1.getName());
        System.out.println(a1.getBook());
    }

}

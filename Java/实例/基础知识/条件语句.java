package 实例.基础知识;

public class 条件语句 {
    public static void main(String[] args) {

        // if 语句
        {
            int x = 45;
            int y = 12;
            if (x > y) {
                System.out.println("x > y ");
            }
            if (x < y) {
                System.out.println("x < y ");
            }
        }

        // if else 语句
        {
            int Math = 95;
            int English = 56;
            if (Math > 60) {
                System.out.println("数学及格");
            } else {
                System.out.println("数学未及格");
            }
            if (English > 60) {
                System.out.println("英语及格");
            } else {
                System.out.println("英语未及格");
            }
        }

        // if else if 多分支语句
        {
            int x = 66;
            if (x > 90){
                System.out.println("A");
            }
            else if (x > 75){
                System.out.println("B");
            }
            else if (x > 60){
                System.out.println("C");
            }
            else{
                System.out.println("D");
            }

            // switch 多分支语句
            {
                int week = 2;
                switch (week){
                    case 1:
                        System.out.println("Mon");
                        break;
                    case 2:
                        System.out.println("Tue");
                        break;
                    case 3:
                        System.out.println("Wed");
                        break;
                    default:
                        System.out.println("?");
                }
            }

        }
    }
}
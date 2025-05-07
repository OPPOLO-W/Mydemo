package Error;

public class Main {
    public static void main(String[] args) {
        Sanjiao sanjiao = new Sanjiao();
        try {
            sanjiao.setSanjiao(3,4,5);
            sanjiao.setSanjiao(2,2,3);
            sanjiao.setSanjiao(1,2,3);
            sanjiao.setSanjiao(4,2,6);
        } catch (TestException e) {
            System.out.println(e.warnMessage());
        }
        System.out.println("学号: 3240608079, 姓名: 吴飞扬");
    }
}

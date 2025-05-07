package Error;

public class Sanjiao {
    double S;
   public void setSanjiao(int a, int b, int c) throws TestException {
       if (a + b <= c || a + c <= b || b + c <= a) {
           throw new TestException(a,b,c);
       }
       double C = (a+b+c)/2.0;
       S = Math.sqrt(C*(C-a)*(C-b)*(C-c));
       System.out.println("三角形面积："+S);
   }
}

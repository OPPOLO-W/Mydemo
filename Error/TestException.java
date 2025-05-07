package Error;

public class TestException extends Exception{
   String message;
   public TestException(int a, int b, int c ){
       message = a+","+b+","+c+"无法组成三角形";
   }
   public String warnMessage(){
       return message;
   }
}

package test;

public class inheritance1 {
        public void methodA() {
           methodC();
        }
       
        public void methodB()
        {
            System.out.println("AB");
        }
       
        public void methodC() {
           methodB();
        }
   
    public static class B extends inheritance1 {
       public void methodA() {
           methodC();
        }
        public void methodB() {
          System.out.println("BB");
        }
    }
    public static void main(String []args){
        inheritance1 a = new B();
        a.methodA();
    }
}

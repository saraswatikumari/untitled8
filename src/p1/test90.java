//by implements runnabble interface
package p1;
class Mythread90 implements Runnable{

    @Override//run method
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("mythread");
        }
    }
}

public class test90 {
    public static void main(String[] args) {
        //Mythread90 obj1=new Mythread90();//
        //Thread obj=new Thread(new Mythread90() );//access runnable interface  jiske pass sirf run meth,use parameterize constructer,anonmass obj
       // Thread obj =new Thread(new Runnable()) {
         //   @Override
           // public void run() {

          //  }
        Thread obj =new Thread()
        }

        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");

        }
    }

}

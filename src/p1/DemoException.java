//multithread
package p1;
class Mythread67 extends Thread{
    public void run()
    {
        System.out.println(10/0);
        for(int i=0;i<10;i++){
            System.out.println("mythread"+i);
        }
    }
}
public class DemoException {
    public static void main(String[] args) {
        Mythread67 obj= new Mythread67();
       //Thread obj1=new Thread.currentThread();
        //  obj1.setPriority(Thread.MAX_PRIORITY);
          //System.out.println(obj1.getPriority());
          //obj1.setName("saraswati");
         // System.out.println(obj1.isAlive());//return
          //System.out.println(obj1.isDaemon());//Garbage collecter
          //System.out.println(50/0);
          obj.start();
        for(int i=0;i<10;i++){
            System.out.println("main Thread"+i);
        }
    }
}

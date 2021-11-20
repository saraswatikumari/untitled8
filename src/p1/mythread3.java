//synchronized method
package p1;
class  Account{
    int balanceamount;
    public  Account(){
        balanceamount=10000;


    }

    public  synchronized void withdraw(int amt) {
        try {
            Thread.sleep(3000);//delay the information(sleep)
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
            balanceamount = balanceamount-amt;
            System.out.println(balanceamount);
        }
    }

class  Mythread extends Thread{
    Account obj=null;//null//local variable
    public Mythread(Account t1){//statice variable
        obj=t1;
    }
    public void run()
    {
        obj.withdraw(500);
    }

}
public class mythread3 {
    public static void main(String[] args) {
        Account a1 =new Account();
        Mythread obj1=new Mythread(a1);
        Mythread obj2=new Mythread(a1);
        obj1.start();
        obj2.start();
    }


}

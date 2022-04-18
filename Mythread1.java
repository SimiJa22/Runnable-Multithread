class Mythread1 implements Runnable{
@Override
 public void run(){
 System.out.println("Hello India");
 }

public static void main(String[] args){
    Mythread1 r =new Mythread1();
    Thread t1=new Thread(new Mythread1());
     t1.start();
    Thread t2=new Thread(new Mythread1());
     t2.start();
    Thread t3=new Thread(new Mythread1());
     t3.start();
    Thread t4=new Thread(new Mythread1());
     t4.start();
     Thread t5=new Thread(new Mythread1());
     t5.start();

    }
}
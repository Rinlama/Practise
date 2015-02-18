
package lecture2;


public class Counter {
    int myCount=0;
    static int ourCount=0;
    
    
    void increment(){
        this.myCount++;
        Counter.ourCount++;
    }
    
    public static void main(String[] args) {
        Counter counter1= new Counter();
        Counter counter2= new Counter();
        
        counter1.increment();
        counter1.increment();
        counter2.increment();
        
        
        System.out.println("Counter : " + counter1.myCount + " Our Count: " + Counter.ourCount);
        
        System.out.println("Counter : " + counter2.myCount + " Our Count: " + Counter.ourCount);
    }
    
    
}

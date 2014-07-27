
/**
 *
 * @author giuseppedesantis
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int StartingValue, boolean check){
        this.value = StartingValue;
        this.check = check;
    }
    
    public Counter(int StartingValue){
        this(StartingValue, false);
    }
    
    public Counter(boolean check){
        this(0, true);
    }
    
    public Counter(){
        this(0, false);
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value++;
    }
    
    public void decrease(){
        if(this.check == true){
            if(this.value >= 1){
                this.value--;
            }
        } else if(this.check == false){
            this.value--;
        }

    }
    
    public void increase(int by){
        if(by >= 0){
            this.value += by;
        }
    }
    
    public void decrease(int by){
        if(by > 0){
            if(this.check == true && by <= this.value){
                this.value -= by;
            }else if(this.check == true && by > this.value){
                this.value = 0;
            }else if(this.check == false){
                this.value -= by;
            }
        }
    }
}

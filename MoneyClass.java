
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        int centsAdded = this.cents + added.cents;
        int eurosAdded = this.euros + added.euros;
        if(centsAdded > 99){
            centsAdded -= 100;
            eurosAdded++;
        }
        Money result = new Money(eurosAdded, centsAdded);
        return result;
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }else{
            return false;
        }
    }
    
    public Money minus(Money decremented){
        int centsDifference = this.cents - decremented.cents;
        int eurosDifference = this.euros - decremented.euros;
        if(centsDifference < 0){
            centsDifference = 100 - Math.abs(centsDifference);
            eurosDifference--;
        }
        
        if(eurosDifference < 0){
            centsDifference = 0;
            eurosDifference = 0;
        }
        
        Money result = new Money(eurosDifference, centsDifference);
        return result;
    }

}

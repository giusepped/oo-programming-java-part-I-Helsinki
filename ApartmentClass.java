
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }else{
            return false;
        }
    }
    
    private int totalPrice(){
        return pricePerSquareMeter * squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.totalPrice()-otherApartment.totalPrice());
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.totalPrice()>otherApartment.totalPrice();
    }
    
    
}

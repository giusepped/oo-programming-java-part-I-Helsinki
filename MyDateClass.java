
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if(this.day < 30){
            this.day++;
        }else if(day == 30 && this.month < 12){
            this.day = 1;
            this.month++;
        }else if(this.day == 30 && this.month == 12){
            this.day = 1;
            this.month = 1;
            this.year++;
        }
    }
    
    public void advance(int numberOfDays){
        int i = 0;
        while(i < numberOfDays){
           this.advance();
           i++;
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate afterDate = new MyDate(this.day, this.month, this.year);
        afterDate.advance(days);
        return afterDate;
    }

}

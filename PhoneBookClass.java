//this class uses a class Person

import java.util.ArrayList;
/**
 *
 * @author giuseppedesantis
 */
public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    
    public void add(String name, String number){
        Person p = new Person(name, number);
        this.list.add(p);
    }
    
    public void printAll(){
        for(Person p : this.list){
            System.out.println(p);
        }
    }
    
    public String searchNumber(String Name){
        for(Person p : this.list){
            if(p.getName().equals(Name)){
                return p.getNumber();
            }
        }
        return "number not known";
    }
    
}

//Create a model/class Car and add data by creating Object.( Notes: list out 5 Car details)
class Car{
    String carname;
    int caryear;
    String carcolor;
    String carcountry_of_origin;

public Car(String carname,int caryear,String carcolor,String carcountry_of_origin){
    this.carname=carname;
    this.caryear=caryear;
    this.carcolor=carcolor;
    this.carcountry_of_origin=carcountry_of_origin;

}
public String toString(){
    return "Car Name:"+carname+",Year:"+caryear+",Colour:"+carcolor+",Country of Origin:"+carcountry_of_origin;
}
public class Details {
    public static void main(String[] args){
        Car c1=new Car("Innova",2010,"Blue","Japan");
        Car c2=new Car("Alto",2011,"White","India");
        Car c3=new Car("Ferrari",2008,"Red","Germany");
        Car c4=new Car("Ambasaddor",1998,"White","India");
        Car c5=new Car("Rangerover",2015,"Black","France");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
    
}}

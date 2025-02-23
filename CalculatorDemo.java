/*Write class Calculator with constructor ,method add(),sub(),div()and multi().Write class
CalculatorDemo from their create instance of Calculator class and try to access its
methods.*/
class Calculator{
    int number1;
    int number2;

public Calculator(int number1,int number2){
    this.number1=number1;
    this.number2=number2;
}
public int add(){
    return number1+number2;
}
public int sub(){
    return number1-number2;
}
public int div(){
    return number1/number2;
}
public int multi(){
    return number1*number2;
}}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator(20,5);
        System.out.println("Addition:"+calculator.add());
        System.out.println("subtraction:"+calculator.sub());
        System.out.println("division:"+calculator.div());
        System.out.println("multiplication:"+calculator.multi());
    }
    
}

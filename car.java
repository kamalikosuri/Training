class  Benz
{
String modelbenz;
int price;
int numberOfDoors;
int numberOfLights;
float weight;
}
class Audi
{
String name;
int price;
int noOfWheels;
int noOfDoors;
float weight;
}
class Car
{
public static void main(String args[])
{
Benz benz =new Benz(); 
benz.modelbenz="mclass";
benz.price=4000000;
benz.numberOfDoors=4;
benz.numberOfLights=8;
benz.weight=1500;
System.out.println("Benz model is ="+benz.modelbenz);
System.out.println("Benz price is="+benz.price);
System.out.println("number of wheels="+benz.numberOfDoors);
System.out.println("number of doors are="+benz.numberOflights);
System.out.println("Benz weight is"+benz.weight);

Audi Audi=new Audi();
Audi.name="A4";
Audi.price=105000;
Audi.numberOfWheels=4;
Audi.numberOoDoors=4;
Audi.weight=2000;
System.out.println("car model is="+Audi.name);
System.out.println("pcar price is is="+Audi.price);
System.out.println("number of wheels="+Audi.numberOfWheels);
System.out.println("number of doors="+Audi.numberOfDoors);
System.out.println("Weight is="+Audi.weight);

}
}
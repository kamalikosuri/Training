class Dell
{
String modelName;
int ram;
int cpu;
int cost;
float osType;
}
class Hp
{
String modelName;
int price;
int battery;
String color;
String osType;
}
class Computer
{
public static void main(String args[])
{
Dell dell=new Dell();
dell.modelname="inspiron";
dell.ram=12;
dell.cpu=256;
dell.cost=20000;
dell.osType="Windows;
System.out.println("system name is="+dell.modelName);
System.out.println("System config is is="+dell.ram);
System.out.println("System CPU  is="+dell.cpu);
System.out.println("System cost is ="+dell.cost);
System.out.println("System os is="+dell.osType);
Hp hp=new Hp();
hp.modelName="Pavilion";
hp.price=45000;
hp.batterymah=6000;
hp.color="Pink";
hp.osType="Linix";
System.out.println("model name is="+hp.modelName);
System.out.println("Laptop price is="+hp.price);
System.out.println("battery of laptop mah is="+hp.batterymah);
System.out.println("color of laptop is ="+hp.color);
System.out.println("laptoptype is="+hp.osType);
}
}
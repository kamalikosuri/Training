class Fruit
{
String name,color;
public Fruit()
{
name="mango";
color="yellow";
}
public Fruit(String n,String c)
{
name=n;
color=c;
}
public void display()
{
System.out.println("Name:"+name);
System.out.println("Color:"+color);
}
public static void main(String args[])
{
Fruit f=new Fruit();
f.display();
Fruit f2=new Fruit("grape","green");
f2.display();
}
}

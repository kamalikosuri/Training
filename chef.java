import java.util.Scanner;
class Details
{
String name;
float height;
float income;
long mobilenumber;
long pin_code;
String city;
String nationality;
}
public class Cheff
{
public static void main(String args[])
{

Details sam=new Details();
/* Creating an object for scanner Class */
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name");
sam.name=sc.next();
System.out.println("Enter height");
sam.height=sc.nextFloat();
System.out.println("Enter income");
sam.income=sc.nextFloat();
System.out.println("Enter Mobile Number");
sam.mobilenumber=sc.nextLong();
System.out.println("Enter Pin Code");
sam.pin_code=sc.nextLong();
System.out.println("Enter city");
sam.city=sc.next();
System.out.println("Enter Nationality");
sam.nationality=sc.next();
System.out.println("Cheff details are");
System.out.println("Name : " + sam.name);
System.out.println("Height : " + sam.height);
System.out.println("Income : " + sam.income);
System.out.println("Mobile Number : " + sam.mobilenumber);
System.out.println("Pin Code : " + sam.pin_code);
System.out.println("City : " + sam.city);
System.out.println("Nationality : " + sam.nationality);
}
}
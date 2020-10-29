public class School
{
    String name;
    String contact;
 
    School(String n, String c)
    {
        name = n;
        contact = c;
    }
 
    void printData()
    {
        System.out.println(“Name:”+name+”\tContact:”+contact);
    }
 
    public static void main(String args[])
    {
       School s1 = new School(“roots School”,”9848589770”);
 
       School s2 = new School(“akshara public School”,”9676989739”);
 
       School s3 = new School(“chirec international School”,”8529637410”);
 
       s1.printData();
 
       s2.printData();
 
       s3.printData();
    }
}
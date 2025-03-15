class Student
{
    void profile()
    {
    System.out.println("this is an student profile");
    }
}
class Age extends Student 
{
    void profile()
    {
    System.out.println("the age of student");
    }
}
public class subin22
{
    public static void main(String[] args) 
    {
        Age myAge=new Age();
        myAge.profile();
    }
}
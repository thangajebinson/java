public class subin6 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = Scanner.nextLine();
        System.out.print("Enter student class: ");
        String studentClass = Scanner.nextLine();
        System.out.print("Enter student marks: ");
        int marks = Scanner.nextInt();
       char grade;
        if (marks >= 90) 
        {
            grade = 'A';
        } 
        else if (marks >= 75) 
        {
            grade = 'B';
        } 
        else if (marks >= 50) 
        {
            grade = 'C';
        } 
        else 
        {
            grade = 'D';
        }
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        Scanner.close(); 
    }
}

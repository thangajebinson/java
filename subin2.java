public class subin2
{
    public static void main(String[] args) 
    {
        scanner scanner = new scanner(System.in);
        System.out.println("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String string2 = scanner.nextLine();
        if (string1.equals(string2)) 
        {
            System.out.println("The strings are equal.");
        } 
        else 
        {
            System.out.println("The strings are not equal.");
        }

        scanner.close();
    }
}

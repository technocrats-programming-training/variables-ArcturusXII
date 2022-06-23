public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
System.out.println(firstName.equals("Gabriel"));
      System.out.println(lastName.equals("Cobin"));
      System.out.println(age);
        // Print out whether age is even
Boolean ageEven = true;
      System.out.println(ageEven = true);
        // Print out whether firstName equals lastName
Boolean firstEqualsLast = false;
      System.out.println(firstEqualsLast = false);
        // Print out whether age is greater than 0
Boolean greaterThanZero = true;
      System.out.println(greaterThanZero = true);
    }
}

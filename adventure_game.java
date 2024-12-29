
import java.util.Scanner;
public class adventure_game {
    public static void printClasses(String class1, String class2, String class3){
        System.out.println("Today you have the following classes:");
 
    }
    public static void main(String[] args) {
        //variable and other assorted declarations
        Scanner scanner = new Scanner(System.in);

        // introduction and base customization
        System.out.println("Welcome to my adventure game!");
        System.out.println("Today, we will experience the day of a college student."); 
        System.out.println("Between classes, meals, and clubs, can you balance it all to survive the day?"); 
        System.out.println("First though, what is your name?"); 
        String name = scanner.nextLine();
        System.out.println("Hi "+name+", welcome to UC Davis, what is your major? Here are your options:");
        System.out.println("(1) Biology");
        System.out.println("(2) Computer Science");
        System.out.println("(3) Civil Engineering");
        System.out.println("(4) English");
        System.out.print("Please enter only the number of the major you've selected: ");
        int maj = scanner.nextInt();
        String major;
        switch (maj) {
            case 1:
                major = "Biology";
                break;
            case 2:
                major = "Computer Science";
                break;
            case 3:
                major = "Civil Engineering";
                break;
            default:
                major = "English";
        }

        System.out.print("Well "+name+" as a "+major+" major, you'll certainly have your work cut out for you.");

//adding something new




 
 
    }
}

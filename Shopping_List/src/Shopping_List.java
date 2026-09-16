import java.util.Scanner;
import java.util.ArrayList;
public class Shopping_List {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
            String input = "";
        
        while (!input.equalsIgnoreCase("x")) {
            System.out.println("Add Item (Type X to Stop)");
                input = in.nextLine();
            
            if (input.equalsIgnoreCase("x")) {
                break;
            } else {
                list.add(input);
            }
        }
        System.out.println(list);
    }
}

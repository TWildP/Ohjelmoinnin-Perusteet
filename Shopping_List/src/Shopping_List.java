import java.util.Scanner;
import java.util.ArrayList;
public class Shopping_List {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
            String input = "";
            
        System.out.println("Add Item");
        input = in.nextLine();
            list.add(input);

        System.out.println(list);
    }
}

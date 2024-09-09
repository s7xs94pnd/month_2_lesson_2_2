import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namesA =new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("LIST NAMES A");
        for (int i = 1; i < 6; i++) {
            System.out.println("write name № "+i);
            String name = scanner.nextLine();
            namesA.add(name);

        }
        System.out.println("All names in list"+namesA);
        System.out.println("________________________");


        ArrayList<String> namesB = new ArrayList<>();
        System.out.println("LIST NAMES B");
        for (int i = 1; i < 6; i++) {
            System.out.println("write name № "+i);
            String name = scanner.nextLine();
            namesB.add(name);
            System.out.println("in list  namesB added new name: "+name);
        }
        System.out.println("All names in list"+namesB);
        System.out.println("________________________");


        ArrayList<String> namesC =new ArrayList<>();
        Collections.reverse(namesB);
        for (int i = 0; i < namesA.size(); i++) {
            namesC.add(namesA.get(i));
            namesC.add(namesB.get(i));
        }
        System.out.println("Объеденный список: "+namesC);

    }

}
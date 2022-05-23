import java.util.Scanner;

public class ArraysExercises {
//    public String newName(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a name: ");
//        String name = input.nextLine();
//        return name;
//    }
    public static String addPerson(String[] array){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = input.nextLine();
        array[array.length] = name;
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return name;
    }
    public static void main (String[] args) {
        String [] names = {"John", "Paul", "George", "Ringo"};
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        addPerson(names);
    }
}

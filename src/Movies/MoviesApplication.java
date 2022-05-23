package Movies;

import util.Input;

public class MoviesApplication {
    static Movie[] movies = MoviesArray.findAll();
    public static int userSelection(){
        int userSelection = Input.getInt("Enter your selection: ");
        System.out.println("Welcome to the Movie Database!");
        System.out.println("Please select an option:");
        System.out.println("1. View all movies");
        System.out.println("2. View all animated movies");
        System.out.println("3. View all drama movies");
        System.out.println("4. View all horror movies");
        System.out.println("5. View all scifi movies");
        System.out.println("0. Exit");
        return userSelection;
    }
    public static void main(String[] args) {
        Input userInput = new Input();

//        if(userInput.getInt() == 1) {
//            MoviesArray.printAll(movies);
//        }
//         else if(userInput.getInt() == 2) {
//            MoviesArray.printAllAnimated(movies, "animated");
//        }
//         else if(userInput.getInt() == 3) {
//            MoviesArray.printAllDrama(movies, "drama");
//        }
//         else if(userInput.getInt() == 4) {
//            MoviesArray.printAllHorror(movies, "horror");
//        }
//         else if(userInput.getInt() == 5) {
//            MoviesArray.printAllScifi(movies, "scifi");
//        }
//         else if (userInput.getInt() == 0) {
//            System.out.println("Goodbye!");
//            System.exit(0);
//        }
        switch (userInput.getInt()) {
            case 1:
                MoviesArray.printAll(movies);
                userSelection();
                break;
            case 2:
                MoviesArray.printAllAnimated(movies, "animated");
                userSelection();
                break;
            case 3:
                MoviesArray.printAllDrama(movies, "drama");
                userSelection();
                break;
            case 4:
                MoviesArray.printAllHorror(movies, "horror");
                userSelection();
                break;
            case 5:
                MoviesArray.printAllScifi(movies, "scifi");
                userSelection();
                break;
            case 0:
                System.out.println("Goodbye!");
                System.exit(0);
                break;

        }
    }
}

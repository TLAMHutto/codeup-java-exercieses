package Movies;

import util.Input;

public class MoviesApplication {
    static Movie[] movies = MoviesArray.findAll();
    public static String getUserInput() {
        Input exitInput = new Input();
        if(exitInput.getInt() == 'x') {
            System.out.println("Goodbye!");
            System.exit(0);
        }
        return getUserInput();
    }
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Welcome to the Movie Database!");
        System.out.println("Please select an option:");
        System.out.println("1. View all movies");
        System.out.println("2. View all animated movies");
        System.out.println("3. View all drama movies");
        System.out.println("4. View all horror movies");
        System.out.println("5. View all scifi movies");
        if(userInput.getInt() == 1) {
            MoviesArray.printAll(movies);
        }
        if(userInput.getInt() == 2) {
            MoviesArray.printAllSelected(movies, "animated");
        }

        if(userInput.getInt() == 3) {
            MoviesArray.printAllSelected(movies, "drama");
        }
        if(userInput.getInt() == 4) {
            MoviesArray.printAllSelected(movies, "horror");
        }
        if(userInput.getInt() == 5) {
            MoviesArray.printAllSelected(movies, "scifi");
        }
        getUserInput();
    }
}

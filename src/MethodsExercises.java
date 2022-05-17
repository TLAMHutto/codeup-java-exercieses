//public class MethodsExercises {
//    public static int Plus(int a, int b) {
//        return a + b;
//    }
//
//    public static int Minus(int a, int b) {
//        return a - b;
//    }
//
//    public static int Multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static int Divide(int a, int b) {
//        return a / b;
//    }
//    public static int Modulos(int a, int b) {
//        return a % b;
//    }
//    public static void main(String[] args) {
//        System.out.println(Plus(1, 2));
//        System.out.println(Minus(1, 2));
//        System.out.println(Multiply(1, 2));
//        System.out.println(Divide(1, 0));
//        System.out.println(Modulos(6, 2));
//    }
//    public static int getInteger(int min, int max) {
//        System.out.println("Enter a number between " + min + " and " + max + ": ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if(number < min || number > max) {
//            System.out.println("Invalid number. Try again.");
//            return number;
//        }
//        if (number >= min && number <= max) {
//            System.out.println("Valid number.");
//            return number;
//            }
//        return number;
//        }
//    public static void main(String[] args) {
//        System.out.println(getInteger(1, 10));
//    }
//       public static int getInterger(int min, int max) {
//           System.out.println("Enter a number between " + min + " and " + max + ": ");
//           Scanner scanner = new Scanner(System.in);
//           int number = scanner.nextInt();
//           System.out.println("You entered: " + number);
//           if (number >= min || number <= max) {
//               int factorial = 1;
//               for (int i = 1; i <= number; i++) {
//                   factorial *= i;
//               }
//               System.out.println("Factorial of " + number + " is " + factorial);
//           }
//           if (number < min && number > max) {
//               System.out.println("Try again.");
//           }
//           return number;
//       }
//    public static void main(String[] args) {
//        getInterger(1, 10);
//    }
//    public static int DiceRoll(int userInput) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number of sides for the dice: ");
//        int numberofSides = scanner.nextInt();
//        System.out.println("You entered: " + numberofSides + " sides.");
//        System.out.println("YDo you want to roll? (y/n)");
//        String roll = scanner.next();
//        if (roll.equals("y")) {
//            int diceRoll = (int) (Math.random() * numberofSides) + 1;
//            System.out.println("You rolled a " + diceRoll);
//            return diceRoll;
//        }
//        if (roll.equals("n")) {
//            System.out.println("Boring...");
//        }
//        return userInput;
//    }
//    public static void main(String[] args) {
//        DiceRoll(5);
//    }
//
//}


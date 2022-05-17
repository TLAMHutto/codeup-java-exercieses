public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        //while loop that runs as long as i is less than 15
//        while (i < 15) {
//            System.out.println(i);
//            i++;
        //count by 2 from 0 to 100
//        int i = 2;
//        do { i+=2;
//            System.out.println(i);
//        }
//        while (i < 100);
//        }
        //count backwards from 100 to 0 by 5's
//        int i = 100;
//        do {
//            i -= 5;
//            System.out.println(i);
//        }
//        while (i > 0);
        //for loop to count by 2 from 100 to 0
//        for (int i = 0; i <100; i += 2) {
//            System.out.println(i);
//        }
        //for (int i = 100; i > 0; i -= 5) {
//            System.out.println(i);
//        }
        //prints 1-100
        //multiples of 3 print fizz
        //multiples of 5 print buzz
        //multiples of 3 and 5 print fizzbuzz
//        for (int i = 1; i < 101; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        //promt user for a number
//        System.out.println("Enter a number to get table of powers between that number and 1");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        System.out.println("Do you want to continue? (y/n)");
//        if (scanner.next().equals("y")) {
//            for (int i = 1; i <= userInput; i++) {
//                System.out.println(i + " squared is " + (i * i) + " and cubed is " + (i * i * i));
//
//            }
//            if (scanner.next().equals("n")) {
//                System.out.println("Bye");
//            }
//        }
        //prompt user for a number between 1 and 100
      System.out.println("Enter a number between 1 and 100");
      if(scanner.nextInt() >= 90 && scanner.nextInt() <= 100) {
              System.out.println("A");
          }
          else if (scanner.nextInt() >= 80 && scanner.nextInt() <= 89) {
              System.out.println("B");
          }
          else if (scanner.nextInt() >= 70 && scanner.nextInt() <= 79) {
              System.out.println("C");
          }
          else if (scanner.nextInt() >= 60 && scanner.nextInt() <= 69) {
              System.out.println("D");
          }
          else if (scanner.nextInt() >= 0 && scanner.nextInt() <= 59) {
              System.out.println("F");
      }
    }
    }


import java.util.*;
import java.util.stream.Collectors;

public class Lotek implements Game {

    Scanner scanner = new Scanner(System.in);
    private List<Integer> givenNumberByUser = new ArrayList<>();
    private final List<Integer> lotteryNumbers = new ArrayList<>();

    @Override
    public void play() {
        instruction();
        userInputAndCheckCorrectness();
        randomNumberBySystem();
        gameMessage(lotteryNumbers, givenNumberByUser);
        checkIfUserWin();

    }

    public void userInputAndCheckCorrectness() {
        while (givenNumberByUser.size() != 6) {
            try {
                String[] givenNumberInString = scanner.nextLine()
                        .trim()
                        .replace(" ", "")
                        .split(",");
                givenNumberByUser = Arrays.stream(givenNumberInString).map(Integer::parseInt).collect(Collectors.toList());
            } catch (Exception e) {
                throw new IllegalArgumentException("an object other than a number was found");
            } finally {
                System.out.println("You wrote something other than number. That's why our program stop working");
            }

            if (givenNumberByUser.size() < 6) {
                System.out.println("You wrote less than 6 number. Try again");
            }
            if (givenNumberByUser.size() > 6) {
                System.out.println("You wrote more than 6 number. Try again");
            }

            for (Integer givenNumber : givenNumberByUser) {
                if (givenNumber > 99 || givenNumber < 1) {
                    System.out.println("You have one or more number beyond the range of 1-99");
                    givenNumberByUser.remove(givenNumber);
                    System.out.println();
                    break;
                }
            }
        }
    }

    public void randomNumberBySystem() {
        Random rand = new Random();
        for (int i = 1; i <= 6; i++) {
            lotteryNumbers.add(rand.nextInt(98) + 1);
            lotteryNumbers.add(i);
        }
    }

    public void checkIfUserWin() {
        Collections.sort(lotteryNumbers);
        Collections.sort(givenNumberByUser);
        if (lotteryNumbers.equals(givenNumberByUser)) {
            System.out.println("You win! Congratulation :)");
        } else {
            System.out.println("You lost. Sorry :(");
        }
    }

    public void gameMessage(List<Integer> loterryNumbers, List<Integer> givenNumberByUser) {
        System.out.println();
        System.out.println("This are the numbers drawn by lot: ");
        System.out.println(loterryNumbers.stream().
                map((Object::toString)).
                collect(Collectors.joining(", ")));
        System.out.println();
        System.out.println("This is your number: ");
        List<String> collectNumbersInString = givenNumberByUser.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(String.join(", ", collectNumbersInString));
        System.out.println();
    }

    public void instruction() {
        System.out.println("Write 6 numbers in display od 1 to 99 and we will grand you a price if you win");
        System.out.println("Given numbers should looks like this: 1,44,23,82,18,92");
        System.out.println("If you write more or less than 6 numbers we will give you another chance");
        System.out.println();
    }
}
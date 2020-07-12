import java.util.*;
// import javax.swing.JOptionPane;
class CarBrands {
    Scanner s = new Scanner(System.in);

    int BestK, SecondBestK, LeastBestK;
    String Best, SecondBest, LeastBest;
    boolean answer;
    int correct = 0;
    int incorrect = 0;

    public void getBestCars() {
        final var CarModels = new HashMap<Integer, String>();
        CarModels.put(1, "Honda");
        CarModels.put(2, "Hyundai");
        CarModels.put(3, "Benz");
        CarModels.put(4, "Toyota");
        try {
            System.out.println("Select models by Indication of a number :" + CarModels + " eg: Best :3");
            System.out.print("Best :");
            BestK = s.nextInt();
            Best = CarModels.get(BestK);

            System.out.print("Secord Best :");
            SecondBestK = s.nextInt();
            SecondBest = CarModels.get(SecondBestK);

            System.out.print("Least Best :");
            LeastBestK = s.nextInt();
            LeastBest = CarModels.get(LeastBestK);
        } catch (final Exception e) {
            System.out.println("Invalid argument provuded");
        }
        System.out.println("");

    }

    private void getAnswer(final String key, final Boolean value) {
        try {
            System.out.print(key + " : ");
            answer = s.nextBoolean();
            if (answer == value) {
                System.out.println("=====================================================");
                System.out.println("Your Answer is correct");
                System.out.println("=====================================================\n");
                // JOptionPane.showMessageDialog(null, "Your Answer is correct");
                correct += 1;
            } else {
                System.out.println("=====================================================");
                System.out.println("Your Answer is incorrect. The corrent answer is " +
                value);
                System.out.println("=====================================================\n");
                // JOptionPane.showMessageDialog(null, "Your Answer is incorrect. The corrent answer is " + value);
                incorrect += 1;
            }
        } catch (final Exception e) {
            System.out.println("Enter true or false");
        }
    }

    public void CarQuestions() {
        final var Honda = new HashMap<String, Boolean>();
        Honda.put("Your Honda car should be serviced every 12 months or 12500 miles, whichever is sooner.", true);
        Honda.put(" Honda OHV stands for Overhead value.", true);
        Honda.put(" Honda OHC stands for Overhead Company", false);
        Honda.put("Your Honda warranty is based on when your Honda engine was originally sold.", true);

        final var Hyundai = new HashMap<String, Boolean>();
        Hyundai.put("Hyundai was founded in 1967 by Chung Ju-yung.", true);
        Hyundai.put("The first Hyundai Accet was introduced in 1995.", false);
        Hyundai.put("The pony was South Korea’s first mass-produced and exported Hyundai.", true);
        Hyundai.put(
                "The first car that Hyundai sold in the US was the 1986 Hyundai Excel, a subcompact four door hatchback or sedan.",
                true);

        final var Benz = new HashMap<String, Boolean>();
        Benz.put("Benz allows to book a test drive.", true);
        Benz.put("Benz has a smart key feature.", true);
        Benz.put("Benz originates from South Africa", false);
        Benz.put("Benz's co-founder is Ms Maart", false);

        final var Toyota = new HashMap<String, Boolean>();
        Toyota.put("Toyota Motor company was established in?", true);
        Toyota.put("The first generation of Hilux started production in 1968. ", true);
        Toyota.put("Toyota has a smart key feature.", true);
        Toyota.put("The Toyota logo is known worldwide as a combination of three ovals.", true);

        final String Ranks[] = { Best, SecondBest, LeastBest };
        System.out.println("=====================================================");
        System.out.println("==   ANSWER THE FOLLOWING WITH EITHER true/false   ==");
        System.out.println("=====================================================\n");
        for (final String currentRank : Ranks) {
            switch (currentRank) {
                case "Honda":
                    for (final Map.Entry<String, Boolean> mapElement : Honda.entrySet()) {
                        final String Question = (String) mapElement.getKey();
                        final boolean Ans = ((boolean) mapElement.getValue());
                        getAnswer(Question, Ans);
                    }
                    break;
                case "Hyundai":
                    for (final Map.Entry<String, Boolean> mapElement : Hyundai.entrySet()) {
                        final String Question = (String) mapElement.getKey();
                        final boolean Ans = ((boolean) mapElement.getValue());
                        getAnswer(Question, Ans);
                    }
                    break;
                case "Benz":
                    for (final Map.Entry<String, Boolean> mapElement : Benz.entrySet()) {
                        final String Question = (String) mapElement.getKey();
                        final boolean Ans = ((boolean) mapElement.getValue());
                        getAnswer(Question, Ans);
                    }
                    break;
                case "Toyota":
                    for (final Map.Entry<String, Boolean> mapElement : Toyota.entrySet()) {
                        final String Question = (String) mapElement.getKey();
                        final boolean Ans = ((boolean) mapElement.getValue());
                        getAnswer(Question, Ans);
                    }
                    break;
            }
        }
        s.close();
    }

    public void getTotal() {
        System.out.println("\n=====================================================");
        System.out.println("Below are the marks obtained");
        System.out.println("=====================================================");
        System.out.format("%8s%18s%18s", "Correct", "Incorrect", "Total\n");
        final int total = correct + incorrect;
        System.out.format("%3d%18d%18d", correct, incorrect, total);
        System.out.println();
    }
}

public class Cars {
    public static void main(final String[] args) {
        final var car = new CarBrands();
        car.getBestCars();
        car.CarQuestions();
        car.getTotal();
    }
}
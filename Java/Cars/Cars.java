import java.util.*;

class CarBrands {
    Scanner s = new Scanner(System.in);

    public int BestK, SecondBestK, LeastBestK;
    public String Best, SecondBest, LeastBest;
    boolean answer;
    int correct = 0;
    int incorrect = 0;

    public void getBestCars() {
        HashMap<Integer, String> CarModels = new HashMap<Integer, String>();
        CarModels.put(1, "BMW");
        CarModels.put(2, "VW");
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
        } catch (Exception e) {
            System.out.println("Invalid argument provuded");
        }
        System.out.println("");

    }

    public void ac(String key, Boolean value) {
        try {
            System.out.print(key + " : ");
            answer = s.nextBoolean();
            if (answer == value) {
                System.out.println("=================================================");
                System.out.println("Your Answer is correct");
                System.out.println("=================================================\n");
                correct += 1;
            } else {
                System.out.println("=====================================================");
                System.out.println("Your Answer is incorrect. The corrent answer is " + value);
                System.out.println("=====================================================\n");
                incorrect += 1;
            }
        } catch (Exception e) {
            System.out.println("Enter true or false");
        }
    }

    public void CarQuestions() {
        HashMap<String, Boolean> BMW = new HashMap<String, Boolean>();
        BMW.put("Engine Capacity", true);
        BMW.put("Built year", false);
        BMW.put("Rob", true);

        HashMap<String, Boolean> VW = new HashMap<String, Boolean>();
        VW.put("Engine Capacity", true);
        VW.put("Built year", false);
        VW.put("Rob", true);

        HashMap<String, Boolean> Benz = new HashMap<String, Boolean>();
        Benz.put("Engine Capacity", true);
        Benz.put("Built year", false);
        Benz.put("Rob", true);

        HashMap<String, Boolean> Toyota = new HashMap<String, Boolean>();
        Toyota.put("Toyota Motor company was established in?", true);
        Toyota.put("The first generation of hilux started in?", false);
        Toyota.put("Does toyota have a smart key feature?", true);
        Toyota.put("Is the toyota logo known for it's three ovals?", true);

        String Ranks[] = { Best, SecondBest, LeastBest };
        for (int c = 0; c < Ranks.length; c++) {
            String currentRank = Ranks[c];
            switch (currentRank) {
                case "BMW":
                    for (Map.Entry<String, Boolean> mapElement : BMW.entrySet()) {
                        String Question = (String) mapElement.getKey();
                        boolean Ans = ((boolean) mapElement.getValue());
                        ac(Question, Ans);
                    }
                    break;
                case "VW":
                    for (Map.Entry<String, Boolean> mapElement : VW.entrySet()) {
                        String Question = (String) mapElement.getKey();
                        boolean Ans = ((boolean) mapElement.getValue());
                        ac(Question, Ans);
                    }
                    break;
                case "Benz":
                    for (Map.Entry<String, Boolean> mapElement : Benz.entrySet()) {
                        String Question = (String) mapElement.getKey();
                        boolean Ans = ((boolean) mapElement.getValue());
                        ac(Question, Ans);
                    }
                    break;
                case "Toyota":
                    for (Map.Entry<String, Boolean> mapElement : Toyota.entrySet()) {
                        String Question = (String) mapElement.getKey();
                        boolean Ans = ((boolean) mapElement.getValue());
                        ac(Question, Ans);
                    }
                    break;
            }
        }
        s.close();
    }

    public void getTotal() {
        System.out.println("\n=================================================");
        System.out.println("Below are the marks obtained");
        System.out.println("=================================================");
        System.out.format("%8s%18s%18s", "Correct", "Incorrect","Total\n");
        int total = correct+incorrect;
        System.out.format("%3d%18d%18d", correct, incorrect,total);
        System.out.println();
    }
}

public class Cars {
    public static void main(String[] args) {
        CarBrands car = new CarBrands();
        car.getBestCars();
        car.CarQuestions();
        car.getTotal();
    }
}
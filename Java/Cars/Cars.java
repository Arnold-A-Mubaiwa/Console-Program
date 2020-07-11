import java.util.*;

class CarBrands {
    Scanner s = new Scanner(System.in);
    public int BestK, SecondBestK, LeastBestK;
    public String Best, SecondBest, LeastBest;
    int answer;
    public void getBestCars() {
        HashMap<Integer, String> CarModels = new HashMap<Integer, String>();
        CarModels.put(1, "BMW");
        CarModels.put(2, "VW");
        CarModels.put(3, "Benz");
        CarModels.put(4, "Toyota");

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
    }

    public void ac(String key, int value,String car) {
        System.out.print("What is the " + key + " of "+ car + " : ");
        answer = s.nextInt();
        if (answer == value) {
            System.out.println("Your Answer is correct");
        } else {
            System.out.println("Your Answer is incorrect. The corrent answer is " + value);
        }
    }

    public void CarQuestions() {
        HashMap<String, Integer> BMW = new HashMap<String, Integer>();
        BMW.put("Engine Capacity", 154);
        BMW.put("Built year", 42);
        BMW.put("Rob", 733);

        HashMap<String, Integer> VW = new HashMap<String, Integer>();
        VW.put("Engine Capacity", 154);
        VW.put("Built year", 42);
        VW.put("Rob", 733);

        HashMap<String, Integer> Benz = new HashMap<String, Integer>();
        Benz.put("Engine Capacity", 154);
        Benz.put("Built year", 42);
        Benz.put("Rob", 733);

        HashMap<String, Integer> Toyota = new HashMap<String, Integer>();
        Toyota.put("Engine Capacity", 154);
        Toyota.put("Built year", 42);
        Toyota.put("Rob", 733);
       
        String Ranks[] = { Best, SecondBest, LeastBest };
        for (int c = 0; c < Ranks.length; c++) {
            String currentRank = Ranks[c];
            switch (currentRank) {
                case "BMW":
                    for (Map.Entry<String,Integer> mapElement : BMW.entrySet()) {
                        String key = (String) mapElement.getKey();
                        int value = ((int) mapElement.getValue());
                        ac(key,value,currentRank);
                    }
                    break;
                case "VW":
                    for (Map.Entry<String,Integer> mapElement : VW.entrySet()) {
                        String key = (String) mapElement.getKey();
                        int value = ((int) mapElement.getValue());
                        ac(key,value,currentRank);
                    }
                    break;
                case "Benz":
                    for (Map.Entry<String,Integer> mapElement : Benz.entrySet()) {
                        String key = (String) mapElement.getKey();
                        int value = ((int) mapElement.getValue());
                        ac(key,value,currentRank);
                    }
                    break;
                case "Toyota":
                    for (Map.Entry<String,Integer> mapElement : Toyota.entrySet()) {
                        String key = (String) mapElement.getKey();
                        int value = ((int) mapElement.getValue());
                        ac(key,value,currentRank);
                    }
                    break;
            }
        }
        s.close();
    }
}

public class Cars {
    public static void main(String[] args) {
        CarBrands car = new CarBrands();
        car.getBestCars();
        car.CarQuestions();
    }
}
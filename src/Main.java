import java.text.MessageFormat;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();

        searchСityMaxPopulation(cities);
    }


    private static void searchСityMaxPopulation(List<City> cities) {
        City[] arr = cities.toArray(new City[0]);
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPopulation() > max) {
                max = arr[i].getPopulation();
                index = i;
            }
        }
        System.out.println(MessageFormat.format("[{0}] = {1}", index, max));

    }
}
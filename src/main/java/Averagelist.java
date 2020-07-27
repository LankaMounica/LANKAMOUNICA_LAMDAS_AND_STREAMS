import java.util.List;
import java.util.OptionalDouble;
public class Averagelist {
    public static double calculate(List<Integer> a){
        OptionalDouble avg_val = a.stream().mapToInt(Integer::intValue).average();
        return avg_val.getAsDouble();
    }
}

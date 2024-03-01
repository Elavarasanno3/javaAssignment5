package javaAssignment5;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public class WeightOFPersons {
    private Map<Integer,List<Integer>> personWeightsMap;

    public WeightOFPersons(){
        personWeightsMap = new HashMap<>();
    }
    public void addWeight(int personId, int weight) {
        personWeightsMap.putIfAbsent(personId, new ArrayList<>());
        personWeightsMap.get(personId).add(weight);
    }
    public int getMinimunWeight(int personId){
        List<Integer> weights = personWeightsMap.get(personId);
        if(weights == null || weights.isEmpty()){
            throw new IllegalArgumentException("person id not found or no weights found");
        }
        return Collections.min(weights);
    }

    public static void main(String[] args) {
    WeightOFPersons person = new WeightOFPersons();
        person.addWeight(1,70);
        person.addWeight(2,59);
        System.out.println(person.getMinimunWeight(1));

    }
}

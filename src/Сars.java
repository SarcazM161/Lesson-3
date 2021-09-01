
import java.util.HashMap;
import java.util.Map;

public class Сars implements CountMap<Model> {

    private final Map<Model,Integer> modelMap;

    public Сars(){
        modelMap = new HashMap<>();
    }

    @Override
    public void add(Model model) {
        Integer n = modelMap.get(model);
        n = (n == null) ? 1 : ++n;
        modelMap.put(model,n);
    }

    @Override
    public int getCount(Model model) {
        return modelMap.get(model) == null ? 0 : modelMap.get(model);
    }

    @Override
    public int remove(Model model) {
        Integer n = modelMap.get(model);
        if(n == null){
            System.out.println("Модели" + model+"нет.");
            return 0;
        } else {
            modelMap.remove(model);
            return n;
        }

    }

    @Override
    public int size() {
        return modelMap.size();
    }

    @Override
    public void addAll(CountMap<Model> source) {
        Map<Model,Integer> newModel =source.toMap();
        for(Map.Entry<Model, Integer> entry : newModel.entrySet()){
            Integer n = modelMap.get(entry.getKey());
            if(n == null){
                modelMap.put(entry.getKey(),entry.getValue());
            } else {
                n += entry.getValue();
                modelMap.put(entry.getKey(),n);
            }
        }
    }

    @Override
    public Map<Model, Integer> toMap() {
        return modelMap;
    }

    @Override
    public void toMap(Map<Model, Integer> destination) {
        for(Map.Entry<Model,Integer> entry : modelMap.entrySet()){
            destination.put(entry.getKey(),entry.getValue());
        }
    }
}

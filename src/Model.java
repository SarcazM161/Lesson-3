
import  java.util.Objects;

public class Model {
    private final String modelName;

    public Model(String modelName){
        this.modelName = modelName;
    }

    @Override
    public String toString(){
        return modelName;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return  false;
        Model type = (Model) o;
    return Objects.equals(modelName, type.modelName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(modelName);
    }
}

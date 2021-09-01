import java.util.*;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static List newArrayList() {
        return null;
    }

    public static<T> int indexOf(List<T> source, T o) {

        return source.indexOf(o);
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        List<T> list = new ArrayList<>();
        if(size <= 0 || source == null)
            return null;
        int lenght = Math.min(size,source.size());
        for(int i =0;i<lenght;i++){
            list.add(source.get(i));
        }
        return list;
    }

    public static void add(List source, Object o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<?> c1, List<?> c2) {
        return !Collections.disjoint(c1,c2);
    }

    public static<T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> result = new ArrayList<>();
        if(max.compareTo(min)<0 || list==null)
            return result;
        for(T e:list){
            if(e.compareTo(max)<0 || e.compareTo(min)>0)
                result.add(e);
        }
        Collections.sort(result);
        return result;
    }

    public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> result = new ArrayList<>();
        if(comparator.compare(max,min)<0 || list==null)
            return result;
        for(T e: list){
            if(comparator.compare(e,max)<= 0 || comparator.compare(e,min)>= 0)
                result.add(e);
        }
        Collections.sort(result,comparator);
        return result;
    }
}

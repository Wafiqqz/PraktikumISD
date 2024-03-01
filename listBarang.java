import java.util.ArrayList;
import java.util.Collections;

public class listBarang <E extends Comparable<? super E>>{
private ArrayList<E> barangA;

public listBarang() {
    this.barangA = new ArrayList<>();
}
    public void add(E data){
        barangA.add(data);
    }

    public void delate(int index){
        barangA.remove(barangA.get (index));
    }

    public void edit(E data , int index){
        barangA.set(index, data);
    }
    public int size(){
        return barangA.size();
        
    }
    public E getIndex(int index){
        return barangA.get(index);
    }
    public void sorting(){
        Collections.sort(barangA);
    }
}

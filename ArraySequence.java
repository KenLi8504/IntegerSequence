import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  public ArraySequence( int [] other){
    data = new int [other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
  }

  public boolean hasNext(){
    return true;
  }
  public int next(){
    return 1;
  }
  public int length(){
    return 1;
  }

  public void reset(){
    currentIndex = 0;
  }
}

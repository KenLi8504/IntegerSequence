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

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    if (currentIndex >= 0 && currentIndex <= data.length){
      return true;
    }
    return false;
  }

  public int next(){
    return currentIndex++;
  }

  public void reset(){
    currentIndex = 0;
  }
}

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
    if (currentIndex >= 0 && currentIndex < data.length){
      return true;
    }
    return false;
  }

  public int next(){
    if (hasNext()){
      currentIndex++;
      return data[currentIndex - 1];
    }
    else{
      throw new NoSuchElementException ("You are at the max value");
    }
  }

  public void reset(){
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int [otherseq.length()];
    otherseq.reset();
    int i = 0;
    while (otherseq.hasNext()){
      data[i] = otherseq.next();
      i = i + 1;
    }
    otherseq.reset();
  }
}

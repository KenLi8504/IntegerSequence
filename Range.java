import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    if (start <= end){
      this.start = start;
      this.end = end;
    }
    else{
      throw new  IllegalArgumentException ("Your start is greater than your end");
    }
  }

  public void reset(){
    current = start;
  }

  public int length(){
    return end - start + 1;
  }

  public boolean hasNext(){
    if (current == end){
      return false;
    }
    return true;
  }

  public int next() throws NoSuchElementException{
    return current + 1;
  }
}

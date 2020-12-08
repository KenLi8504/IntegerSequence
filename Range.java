import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    if (start <= end){
      this.start = start;
      this.end = end;
      current = start;
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
    if (current >= start && current <= end){
      return true;
    }
    return false;
  }

  public int next(){
    if (hasNext()){
      current = current + 1;
      return current - 1;
    }
    else{
      throw new NoSuchElementException ("You are at the max value");
    }
  }
}

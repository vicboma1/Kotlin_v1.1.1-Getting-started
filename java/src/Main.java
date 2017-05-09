import java.util.stream.IntStream;

/**
 * Created by vicboma on 09/05/17.
 */
public class Main {

    public static void main(String args[]){
        Long init = System.currentTimeMillis();
        invoke();
        System.out.println();
        System.out.print("Time "+(System.currentTimeMillis() - init)+" ms");
    }

    public static void invoke() {
        IntStream.rangeClosed(1,99)
                  .forEach( it -> {
                      final String Empty = "";
                      String str = Empty;
                      if(it % 3 == 0 ) str += "Fizz";
                      if(it % 5 == 0 ) str += "Buzz";
                      if(str.equals(Empty)) str+= it;
                      System.out.print(str.concat(" "));
        });

    }

}

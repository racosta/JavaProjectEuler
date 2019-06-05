package project.euler.utility;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * Created by SG0210832 on 3/10/2017.
 */
public class Memoizer<T, U> {

   private final Map<T, U> cache = new ConcurrentHashMap<>();

   private Memoizer() {}

   private Function<T, U> doMemoize(final Function<T, U> function) {
      return input -> cache.computeIfAbsent(input, function::apply);
   }

   public static <T, U> Function<T, U> memoize(final Function<T, U> function) {
      return new Memoizer<T, U>().doMemoize(function);
   }
}

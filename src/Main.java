import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Task 1

        Predicate<Integer> intPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0;
            }
        };

        System.out.println(intPredicate.test(-89));

        Predicate<Integer> intLambdaPredicate = i -> i >= 0;

        System.out.println(intLambdaPredicate.test(-18));


        //Task 2

        Consumer<String> helloConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " + s + " !");
            }
        };

        helloConsumer.accept("Sasha");

        Consumer<String> helloLambdaConsumer = str -> System.out.println("Hello with lambda, " + str + " !");

        helloLambdaConsumer.accept("Sasha");


        //Task 3

        Function<Double, Long> numFunction = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                Long aLong = aDouble.longValue();
                if ((aDouble - aLong) >= 0.5) {
                    return aLong + 1;
                } else {
                    return aDouble.longValue();
                }
            }
        };

        System.out.println(numFunction.apply(3.5));

        //второй вариант (в первом варианте сделала так громоздко, потому что не знала про метод Math.round :)

        Function<Double, Long> numFunction2 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        System.out.println(numFunction2.apply(3.2));

        Function<Double, Long> numLambdaFunction = d -> Math.round(d);

        System.out.println(numLambdaFunction.apply(18.6));


        //Task 4

        Supplier<Integer> intSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int)(Math.random() * 100);
            }
        };

        System.out.println(intSupplier.get());

        Supplier<Integer> intLambdaSupplier = () -> (int)(Math.random() * 100);

        System.out.println(intLambdaSupplier.get());


    }
}
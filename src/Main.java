import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Task 1

        /*Напишите реализации функционального интерфейса
        Predicate, которые проверяют, является ли число положительным. Если число положительное,
        то предикат должен возвращать true, в противном случае — false.
        Реализуйте Predicate в двух вариантах:

        1. через анонимный класс
        2. через лямбду        */


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

        /*Создайте функциональный интерфейс Consumer,
        который принимает на вход имя человека и выводит в консоль приветствие в его адрес.

        Реализуйте его в двух вариантах: через анонимный класс и через лямбду.*/

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

        /*Реализуйте функциональный интерфейс Function, который принимает на вход вещественное число типа
         Double, а возвращает его округленный вариант типа Long.

        Реализуйте его в двух вариантах: через анонимный класс и через лямбду.*/

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

        /*Напишите Supplier, который возвращает случайное число из диапазона от 0 до 100.

        Реализуйте его в двух вариантах: через анонимный класс и через лямбду.*/

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
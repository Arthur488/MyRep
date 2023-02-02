import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Test4 {
    public static void main(String[] args) {
        int[] ints = {1, 4, 9, 1, 5, 6, 9, 15, 12, 8, 15};
        System.out.println("Начальный массив:");
        System.out.println(Arrays.toString(ints));
        System.out.println("\n//************************ Задание 1 ************************//");
        System.out.println("Сортируем по возрастанию");
        System.out.println(Arrays.toString(Arrays.stream(ints).sorted().toArray()));
        System.out.println("Сортируем по убыванию");
        System.out.println(Arrays.toString(Arrays.stream(ints).boxed().sorted(Collections.reverseOrder()).toArray()));
        System.out.println("\n//************************ Задание 2 ************************//");
        System.out.println("Убрать повторы в массиве");
        System.out.println(Arrays.toString(Arrays.stream(ints).distinct().toArray()));
        System.out.println("\n//************************ Задание 3 ************************//");
        System.out.println("Слева наши-справа чужие без сортировки");
        int[] intsPair = Arrays.stream(ints).filter(value -> value % 2 == 0).toArray();
        int[] intsUnpair = Arrays.stream(ints).filter(value -> value % 2 != 0).toArray();
        int[] merged = IntStream.concat(IntStream.of(intsPair), IntStream.of(intsUnpair)).toArray();
        System.out.println(Arrays.toString(merged));
        System.out.println("\n//************************ Задание 4 ************************//");
        System.out.println("Слева наши-справа чужие с сортировкой");
        intsPair = Arrays.stream(intsPair).sorted().toArray();
        intsUnpair = Arrays.stream(intsUnpair).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        merged = IntStream.concat(IntStream.of(intsPair), IntStream.of(intsUnpair)).toArray();
        System.out.println(Arrays.toString(merged));
        System.out.println("\n//************************ Задание 5 ************************//");
        System.out.println("Работа со строкой");
        String string = "Утверждая, что ты чего-то не можешь, ты лишаешь себя всемогущества.";
        System.out.println(string);
        String StringReplace = string.replaceFirst("всемогущества", "THIS WORD FINDED");
        System.out.println(StringReplace);
    }
}

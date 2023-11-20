// Определить:
// а) сумму всех элементов массива;
// б) произведение всех элементов массива;
// в) сумму квадратов всех элементов массива;
// г) сумму шести первых элементов массива;
// д)  сумму элементов массива с k1-го по k2-й (значения k1 и k2
// вводятся с  клавиатуры; k2 > k1);
// е) среднее арифметическое всех элементов массива;
// ж) среднее арифметическое элементов массива с s1-го по s2-й
// (значения s1 и  s2 вводятся с клавиатуры; s2 > s1)


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Ввод размера массива
    print("Введите размер массива: ")
    val size = scanner.nextInt()

    // Ввод элементов массива
    val array = IntArray(size)
    println("Введите элементы массива:")
    for (i in 0 until size) {
        print("Элемент $i: ")
        array[i] = scanner.nextInt()
    }

    // а) Сумма всех элементов массива
    val sumAll = array.sum()
    println("а) Сумма всех элементов массива: $sumAll")

    // б) Произведение всех элементов массива
    val productAll = array.reduce { acc, element -> acc * element }
    println("б) Произведение всех элементов массива: $productAll")

    // в) Сумма квадратов всех элементов массива
    val sumSquares = array.map { it * it }.sum()
    println("в) Сумма квадратов всех элементов массива: $sumSquares")

    // г) Сумма шести первых элементов массива
    val sumFirstSix = array.take(6).sum()
    println("г) Сумма шести первых элементов массива: $sumFirstSix")

    // д) Сумма элементов массива с k1-го по k2-й
    print("д) Введите значение k1: ")
    val k1 = scanner.nextInt()
    print("   Введите значение k2 (k2 > k1): ")
    val k2 = scanner.nextInt()
    val sumRange = array.sliceArray(k1 until k2 + 1).sum()
    println("   Сумма элементов массива с $k1-го по $k2-й: $sumRange")

    // е) Среднее арифметическое всех элементов массива
    val averageAll = array.average()
    println("е) Среднее арифметическое всех элементов массива: $averageAll")

    // ж) Среднее арифметическое элементов массива с s1-го по s2-й
    print("ж) Введите значение s1: ")
    val s1 = scanner.nextInt()
    print("   Введите значение s2 (s2 > s1): ")
    val s2 = scanner.nextInt()
    val averageRange = array.sliceArray(s1 until s2 + 1).average()
    println("   Среднее арифметическое элементов массива с $s1-го по $s2-й: $averageRange")
}

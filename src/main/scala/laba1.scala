import scala.util.Random

object laba1 {

  def generate_random_numbers(n: Int): List[Int] = {
    val random = new Random()
    List.fill(n)(random.nextInt(100))
  }


  def count_odd_numbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 != 0).length
  }

  def print_odd_numbers(numbers: List[Int]) = {
    print("Вот и сами нечетные числа: ")
    for (n <- numbers){
        if (n % 2 != 0){
            print(n + " ")
        }
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    val numbers = generate_random_numbers(20)
    println(s"Список самих чисел: $numbers")

    print_odd_numbers(numbers)

    val oddCount = count_odd_numbers(numbers)
    println(s"Вот их количество нечётных чисел: $oddCount")
    
  }
}
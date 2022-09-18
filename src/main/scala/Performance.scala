import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.util.Random.nextInt
import scala.util.Try

object Performance:

  // default experiment sizes
  val REPS = 100000
  val SIZE = 5000

  // TODO modify this program so that it runs for SIZE = 10, 100, 1000, 10000
  // and for both ArrayBuffer and ListBuffer

  // TODO answer this question: which of the two lists implementations performs better
  // as the size increases?

  def main(args: Array[String]): Unit =

    val arg0 = Try(args(0).toInt).toOption
    val reps = arg0.getOrElse(REPS)

    val arg1 = Try(args(1).toInt).toOption
    val size = arg1.getOrElse(SIZE)

    val fixture = new ArrayBuffer[Int]

    timeThis(s"${fixture.getClass.getSimpleName} fixture creation (size = $size)") {
      for i <- 0 until size do fixture += i
    }

    timeThis(s"${fixture.getClass.getSimpleName} reps = $reps fixture size = ${fixture.length} random access") {
      var x = 0L
      for r <- 0 until reps do
        val randomPosition = nextInt(fixture.length)
        x = fixture(randomPosition % size)
    }

    timeThis(s"${fixture.getClass.getSimpleName} reps = $reps fixture size = ${fixture.length} random add/remove") {
      for r <- 0 until reps do
        val randomPosition = nextInt(fixture.length)
        fixture.insert(randomPosition, 77)
        fixture.remove(randomPosition)
    }

  def timeThis[A](s: String)(block: => A): A =
    val time0 = System.currentTimeMillis
    val b = block
    val time1 = System.currentTimeMillis - time0
    println(s"$s = $time1 ms")
    b
  
end Performance

import scala.collection.mutable.HashMap
import scala.util.Random.nextInt
import scala.util.Try

object MapPerformance {

  // default experiment sizes
  val REPS = 100000
  val SIZE = 5000

  // TODO modify this program so that it runs for SIZE = 10, 100, 1000, 10000
  // and for both ArrayBuffer and ListBuffer

  // TODO answer this question: which of the two lists implementations performs better
  // as the size increases?


  def main(args: Array[String]): Unit = {
 
    val arg0 = Try(args(0).toInt).toOption
    val reps = arg0.getOrElse(REPS)

    val arg1 = Try(args(1).toInt).toOption
    val size = arg1.getOrElse(SIZE)

    val fixture = new HashMap[Int, Int]

    timeThis(s"${fixture.getClass.getSimpleName} fixture creation (size = $size)") { 
      for (i <- 0 until size) fixture.put(i, i)
    }

    timeThis(s"${fixture.getClass.getSimpleName} reps = $reps fixture size = ${fixture.size} random access") {
      var x = 0
      for (r <- 0 until reps) {
        val randomPosition = nextInt(fixture.size)
        x = fixture(randomPosition % size)
      }
    }

    timeThis(s"${fixture.getClass.getSimpleName} reps = $reps fixture size = ${fixture.size} random add/remove") {
      for (r <- 0 until reps) {
        val randomPosition = nextInt(fixture.size)
        fixture.put(randomPosition, randomPosition)
        fixture.remove(randomPosition)
      }
    }
  }

  def timeThis[A](s: String)(block: => A): A = {
    val time0 = System.currentTimeMillis
    val b = block
    val time1 = System.currentTimeMillis - time0
    println(s"$s = $time1 ms")
    b
  }
}

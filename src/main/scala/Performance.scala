import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.util.Random.nextInt

object Performance {

  val REPS = 100000

  // TODO modify this program so that it runs for SIZE = 10, 100, 1000, 10000
  // and for both ArrayBuffer and ListBuffer

  // TODO answer this question: which of the two lists implementations performs better
  // as the size increases?


  def main(args: Array[String]): Unit = {

    val fixture = new ArrayBuffer[Int]
    val size = 10000

    timeThis(s"${fixture.getClass.getSimpleName} fixture creation") { 
      for (i <- 0 until size) fixture += i
    }

    timeThis(s"${fixture.getClass.getSimpleName} fixture size = ${fixture.length} random access") {
      var x = 0L
      for (r <- 0 until REPS) {
        val randomPosition = nextInt(fixture.length)
        x = fixture(randomPosition % size)
      }
    }

    timeThis(s"${fixture.getClass.getSimpleName} fixture size = ${fixture.length} random add/remove") {
      for (r <- 0 until REPS) {
        val randomPosition = nextInt(fixture.length)
        fixture.insert(randomPosition, 77)
        fixture.remove(randomPosition)
      }
    }
  }

  def timeThis[A](s: String)(block: => A): A = {
    val time0 = System.currentTimeMillis
    val b = block
    val time1 = System.currentTimeMillis - time0
    println("Timing " + s + " = " + time1)
    b
  }
}

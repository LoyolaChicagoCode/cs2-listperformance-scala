import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Performance {

  val REPS = 100000

  // TODO modify this program so that it runs for SIZE = 10, 100, 1000, 10000
  // and for both ArrayBuffer and ListBuffer

  // TODO answer this question: which of the two lists implementations performs better
  // as the size increases?


  def main(args: Array[String]): Unit = {

    val fixture = new ArrayBuffer[Int]
    val size = 10000

    for (i <- 0 to size) fixture += i

    timeThis(fixture.getClass.getSimpleName + s" fixture size = ${fixture.length} random access") {
      var x = 0L
      for (r <- 0 to REPS)
        x = fixture(r % size)
    }

    timeThis(fixture.getClass.getSimpleName + " fixture size = ${fixture.length} add/remove") {
      for (r <- 0 to REPS)
        fixture.insert(0, 77)
        fixture.remove(0)
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

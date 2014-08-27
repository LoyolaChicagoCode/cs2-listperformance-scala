import org.scalatest.{BeforeAndAfterEach, FunSuite}

class TestPerformance extends FunSuite with BeforeAndAfterEach{

  // TODO run test and record running times for SIZE = 10, 100, 1000, 10000
  // which of the two lists performs better as the size increases?

  val SIZE: Int = 10
  val REPS: Int = 1000000
  var arrayList: java.util.ArrayList[Int] = _
  var linkedList: java.util.LinkedList[Int] = _

  override def beforeEach(){
    arrayList = new java.util.ArrayList[Int](SIZE)
    linkedList = new java.util.LinkedList[Int]()
    for (i <- 0 to SIZE) {
      arrayList.add(i)
      linkedList.add(i)
    }
  }

  override def afterEach(){
    arrayList = null
    linkedList = null
  }

  test("testLinkedListAddRemove") {
    for (r <- 0 to REPS) {
      linkedList.add(0, 77)
      linkedList.remove(0)
    }
  }

  test("testArrayListAddRemove") {
    for (r <- 0 to REPS) {
      arrayList.add(0, 77)
      arrayList.remove(0)
    }
  }

  test("testLinkedListAccess") {
    var sum: Long = 0
    for (r <- 0 to REPS) {
      sum += linkedList.get(r % SIZE)
    }
  }

  test("testArrayListAccess") {
    var sum: Long = 0
    for (r <- 0 to REPS) {
      sum += arrayList.get(r % SIZE);
    }
  }

}
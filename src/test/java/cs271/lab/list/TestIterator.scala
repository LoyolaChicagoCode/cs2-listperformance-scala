package cs271.lab.list

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class TestIterator extends FunSuite with BeforeAndAfterEach{
  var list: java.util.ArrayList[Int] = _

  override def beforeEach(){
    list = new java.util.ArrayList[Int]()
    // TODO also try with a LinkedList - does it make any difference?
  }

  override def afterEach(){
    list = null
  }

  test("testEmptyList"){
    val i = list.iterator()
    assert(i.hasNext() == false)
  }

  test("testNonEmptyList"){
    list.add(33)
    list.add(77)
    list.add(44)
    list.add(77)
    list.add(55)
    list.add(77)
    list.add(66)

    val i = list.iterator()

    assert(i.hasNext() == true)
    assert(i.next() == 33)
    // TODO fix the expected values in the assertions below
    assert(i.hasNext() == true)
    assert(i.next() == 0)
    assert(i.hasNext() == true)
    assert(i.next() == 0)
    assert(i.hasNext() == true)
    assert(i.next() == 0)
    assert(i.hasNext() == true)
    assert(i.next() == 0)
    assert(i.hasNext() == true)
    assert(i.next() == 0)
    assert(i.hasNext() == true)
    assert(i.next() == 0)
    assert(i.hasNext() == false)
  }

  test("testRemove") {
    list.add(33)
    list.add(77)
    list.add(44)
    list.add(77)
    list.add(55)
    list.add(77)
    list.add(66)

    val i = list.iterator()

    while (i.hasNext()) {
      if (i.next() == 77) {
         i.remove() // TODO what happens if you use list.remove(77)?
      }
    }
    // TODO using assertEquals and Arrays.asList (see above)
    // express which values are left in the list
    fail("Not yet implemented"); // remove this line when done
  }

  test("testAverageValue") {
    list.add(33)
    list.add(77)
    list.add(44)
    list.add(77)
    list.add(55)
    list.add(77)
    list.add(66)

    val sum: Double = 0
    val n: Int = 0
    // TODO use an iterator and a while loop to compute the average (mean) of the values
    // (defined as the sum of the items divided by the number of items)
    assert(n == 7)
    assert("%.2f".format(sum / n).toDouble == 61.29)
  }

}
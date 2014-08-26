package cs271.lab.list

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class TestIterator extends FunSuite with BeforeAndAfterEach{
  var list: List[Int] = _

  override def beforeEach(){
    list = List()
  }

  override def afterEach(){
    list = Nil
  }

  test("Test empty list"){
    val iterator: Iterator[Int] = list.iterator
    assert(iterator.hasNext == false)
  }

  test("Test non-empty list"){
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66
    val i: Iterator[Int] = list.iterator

    assert(i.hasNext == true)
    assert(i.next == 33)
    // TODO fix the expected values in the assertions below
    assert(i.hasNext == true)
    assert(i.next == 0)
    assert(i.hasNext == true)
    assert(i.next == 0)
    assert(i.hasNext == true)
    assert(i.next == 0)
    assert(i.hasNext == true)
    assert(i.next == 0)
    assert(i.hasNext == true)
    assert(i.next == 0)
    assert(i.hasNext == true)
    assert(i.next == 0)
    assert(i.hasNext == false)
  }

  test("Test remove") {
    //def removeOne(num: Int, listCopy: List[Int]) = list diff List(num)

    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66
    val i = list.iterator

    while (i.hasNext) {
      val value = i.next()
      if (value == 77) {
         list = list diff List(value) // TODO what happens if you use list.remove(77)?
      }
    }
    // TODO using assertEquals and Arrays.asList (see above)
    // express which values are left in the list
    fail("Not yet implemented"); // remove this line when done
  }

  
}
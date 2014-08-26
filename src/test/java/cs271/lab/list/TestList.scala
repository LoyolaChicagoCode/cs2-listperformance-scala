import org.scalatest.{BeforeAndAfterEach, FunSuite}

class TestList extends FunSuite with BeforeAndAfterEach{
  var list: List[Int] = _

  override def beforeEach(){
    list = List()
  }

  override def afterEach(){
    list = Nil
  }

  test("testSizeEmpty"){
    assert(list.isEmpty == true)
    assert(list.size == 0)
    try {
      list(0)
      fail("there should not be any items in the list");
    } catch {
      case e: Exception => println(e)
    }
  }

  test("testSizeNonEmpty"){
    // TODO fix the expected values in the assertions below
    list = list :+ 77
    assert(list.isEmpty == true)
    assert(list.size == 0)
    assert(list(0).intValue() == 0)
  }

  test("testContains") {
    // TODO write assertions using
    // list.contains(77)
    // that hold before and after adding 77 to the list
    fail("Not yet implemented") // remove this line when done
  }

  test("testAddMultiple") {
    list = list :+ 77
    list = list :+ 77
    list = list :+ 77
    // TODO fix the expected values in the assertions below
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list(1).intValue() == 0)
    assert(list.lastIndexOf(77) == 0)
  }

  test("testAddMultiple2") {
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66
    // TODO fix the expected values in the assertions below
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list.lastIndexOf(77) == 0)
    assert(list(2).intValue() == 0)
    assert(list(3).intValue() == 0)
    assert(List(33, 77, 44) == list)
  }

  test("testRemoveObject") {
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66 // what does this method do?

    def remove(value: Int) = list diff List(value)

    // TODO fix the expected values in the assertions below
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list.lastIndexOf(77) == 0)
    assert(list(2).intValue() == 0)
    assert(list(3).intValue() == 0)
    list = remove(5) // what does this one do?
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list.lastIndexOf(77) == 0)
    assert(list(2).intValue() == 0)
    assert(list(3).intValue() == 0)
  }

  test("testContainsAll") {
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66
    // TODO using containsAll and Arrays.asList (see above),
    // 1) assert that list contains all five different numbers added
    // 2) assert that list does not contain all of 11, 22, and 33
    fail("Not yet implemented"); // remove this line when done
  }

  test("testAddAll") {
    // TODO in a single statement using addAll and Arrays.asList,
    // add items to the list to make the following assertions pass
    // (without touching the assertions themselves)
    assert(list.size == 7)
    assert(list(0).intValue() == 33)
    assert(list(1).intValue() == 77)
    assert(list(2).intValue() == 44)
    assert(list(3).intValue() == 77)
    assert(list(4).intValue() == 55)
    assert(list(5).intValue() == 77)
    assert(list(6).intValue() == 66)
  }

  test("testRemoveAll") {
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66
    // TODO in a single statement using removeAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assert(list.size == 3)
    assert(List(77, 77, 77) == list)
  }

  test("testRetainAll") {
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66
    // TODO in a single statement using retainAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assert(list.size == 3)
    assert(List(77, 77, 77) == list)
  }

  test("testSet") {
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66
    // TODO use the set method to change specific elements in the list
    // such that the following assertions pass
    // (without touching the assertions themselves)
    assert(list.size == 7)
    assert(list(0).intValue() == 33)
    assert(list(1).intValue() == 99)
    assert(list(2).intValue() == 44)
    assert(list(3).intValue() == 99)
    assert(list(4).intValue() == 55)
    assert(list(5).intValue() == 99)
    assert(list(6).intValue() == 66)
  }

  test("testSubList") {
    list = list :+ 33
    list = list :+ 77
    list = list :+ 44
    list = list :+ 77
    list = list :+ 55
    list = list :+ 77
    list = list :+ 66

    def subList(start: Int, end: Int): List[Int] = list.drop(start).take(end - start)

    // TODO fix the arguments in the subList method so that the assertion
    // passes
    assert(List(44, 77, 55) == subList(0, 0))
  }

}
import org.scalatest.{BeforeAndAfterEach, FunSuite}

class TestList extends FunSuite with BeforeAndAfterEach{
  var list: List[Int] = _

  override def beforeEach(){
    list = List()
  }

  override def afterEach(){
    list = Nil
  }

  test("Test size empty"){
    assert(list.isEmpty == true)
    assert(list.size == 0)
    try {
      list(0)
      fail("there should not be any items in the list");
    } catch {
      case e: Exception => println(e)
    }
  }

  test("Test size non-empty"){
    // TODO fix the expected values in the assertions below
    list = list :+ 77
    assert(list.isEmpty == true)
    assert(list.size == 0)
    assert(list(0).intValue() == 0)
  }

  test("Test contains") {
    // TODO write assertions using
    // list.contains(77)
    // that hold before and after adding 77 to the list
    fail("Not yet implemented") // remove this line when done
  }

  test("Test add multiple") {
    list = list :+ 77
    list = list :+ 77
    list = list :+ 77
    // TODO fix the expected values in the assertions below
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list(1).intValue() == 0)
    assert(list.lastIndexOf(77) == 0)
  }

}
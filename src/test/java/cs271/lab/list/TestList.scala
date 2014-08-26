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

}
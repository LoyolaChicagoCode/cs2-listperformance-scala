package cs271.lab.list

import org.scalatest.funsuite.AnyFunSuite

class TestList extends AnyFunSuite {

  test("testSizeEmpty") {
    val list = Fixture.fixture()
    assert(list.isEmpty)
    assert(list.size == 0)
    intercept[IndexOutOfBoundsException] {
      list(0)
    }
  }

  test("testSizeNonEmpty") {
    // TODO fix the expected values in the assertions below
    val list = Fixture.fixture()
    assert(list.isEmpty)
    list += 77
    assert(list.isEmpty)
    assert(list.size == 0)
    assert(list(0) == 0)
  }

  test("testContains") {
    val list = Fixture.fixture()
    // TODO write assertions using list.contains(77)
    // that hold before and after adding 77 to the list
    fail("Not yet implemented") // remove this line when done
  }

  test("testAddMultiple") {
    val list = Fixture.fixture()
    list += 77
    list += 77
    list += 77
    // TODO fix the expected values in the assertions below
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list(1) == 0)
    assert(list.lastIndexOf(77) == 0)
  }

  test("testAddMultiple2") {
    val list = Fixture.fixture()
    Fixture.populate(list)
    // TODO fix the expected values in the assertions below
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list.lastIndexOf(77) == 0)
    assert(list(2) == 0)
    assert(list(3) == 0)
    assert(list == List(33, 77, 44))
  }

  test("testRemoveObject") {
    val list = Fixture.fixture()
    Fixture.populate(list)
    // TODO fix the expected values in the assertions below
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list.lastIndexOf(77) == 0)
    assert(list(2) == 0)
    assert(list(3) == 0)
    list -= 5 // what does this one do?
    assert(list.size == 0)
    assert(list.indexOf(77) == 0)
    assert(list.lastIndexOf(77) == 0)
    assert(list(2) == 0)
    assert(list(3) == 0)
  }

  test("testContainsAll") {
    val list = Fixture.fixture()
    Fixture.populate(list)
    // TODO 1) assert that list contains all five different numbers added
    // TODO 2) assert that list does not contain all of 11, 22, and 33 (together)
    fail("Not yet implemented") // remove this line when done
  }

  test("testAddAll") {
    val list = Fixture.fixture()
    // TODO in a single statement add items to the list to make the following assertions pass
    // (without touching the assertions themselves)
    assert(list.size == 7)
    assert(list(0) == 33)
    assert(list(1) == 77)
    assert(list(2) == 44)
    assert(list(3) == 77)
    assert(list(4) == 55)
    assert(list(5) == 77)
    assert(list(6) == 66)
  }

  test("testRemoveAll") {
    val list = Fixture.fixture()
    Fixture.populate(list)
    // TODO in a single statement, remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assert(list.size == 3)
    assert(List(77, 77, 77) == list)
  }

  test("testSet") {
    val list = Fixture.fixture()
    Fixture.populate(list)
    // TODO use the update method to change specific elements in the list
    // such that the following assertions pass
    // (without touching the assertions themselves)
    assert(list.size == 7)
    assert(list(0) == 33)
    assert(list(1) == 99)
    assert(list(2) == 44)
    assert(list(3) == 99)
    assert(list(4) == 55)
    assert(list(5) == 99)
    assert(list(6) == 66)
  }

  test("testSubList") {
    val list = Fixture.fixture()
    Fixture.populate(list)
    // TODO fix the arguments in the slice method so that the assertion
    // passes
    assert(List(44, 77, 55) == list.slice(0, 0))
  }
}

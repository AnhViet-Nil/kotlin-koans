package i_introduction._7_Data_Classes

import util.TODO

class Person1(val name: String, val age: Int)

// No 'new' keyword necessary
fun create() = Person1("Alice", 29)

fun useFromJava() {
    // property 'val name' = backing field + getter
    // => from Java you access it through 'getName()'
    JavaCode7().useKotlinClass(Person1("Bob", 31))

    // property 'var mutable' = backing field + getter + setter
}

// This is the same as the following (getters are generated by default):
class Person2(_name: String, _age: Int) { //_name, _age are constructor parameters
    val name: String = _name //property initialization is part of the constructor
      get(): String {
          return $name // You can access the backing field of property with '$' + property name
      }

    val age: Int = _age
      get(): Int {
          return $age
      }
}

// If you add a 'data' annotation to your class, some additional methods will be generated for you.
// These include 'equals', 'hashCode', and 'toString'.

data class Person3(val name: String, val age: Int)

// This class is as good as Person4 (written in Java), but is 42 lines shorter. =)

fun todoTask7() = TODO(
    """
        There is no task for you here.
        Just make sure you're not forgetting to carefully read all code examples and comments and
        ask questions if you have any. =) Then return 'true' from 'task7'.
        More information about classes in Kotlin can be found in the syntax/classesObjectsInterfaces.kt file.
    """,
    references = { JavaCode7.Person4("???", -1) }
)

fun task7(): Boolean = todoTask7()

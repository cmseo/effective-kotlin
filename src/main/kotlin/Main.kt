import item1.BankAccount
import item1.FullName
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.HashSet
import kotlin.concurrent.thread

suspend fun main(args: Array<String>) {

    /**
     * Sample code for mutable problem #1
     * */
//    val account = BankAccount()
//    println(account.balance) //0.0
//    account.deposit(100.0)
//    println(account.balance) // 100.0
//    account.withdraw(50.0)
//    println(account.balance) // 50.0

    /**
     * Sample code for mutable problem #2
     * */
//    var num = 0
//    for (i in 1..1000) {
//        thread {
//            Thread.sleep(10)
//            num += 1
//        }
//    }
//    Thread.sleep(5000)
//    println(num)
//    // #1 trial: 996
//    // #2 trial: 997
//    // #3 trial: 995

    /**
     * sample code for mutable problem (coroutine)
     * */
//    var num = 0
//    coroutineScope {
//        for(i in 1..1000) {
//            launch {
//                delay(10)
//                num += 1
//            }
//        }
//    }
//    print(num) // 847, 992, 986

    /**
     * Limiting mutability by implementing proper synchronization
     * */
//    val lock = Any()
//    var num = 0
//    for (i in 1..1000) {
//        thread {
//            Thread.sleep(10)
//            synchronized(lock) {
//                num += 1
//            }
//        }
//    }
//    Thread.sleep(1000)
//    println(num)


    /**
     * Limiting mutability #1: val
     */

//    // 1
//    val a = 10
//    a = 20 // error

//    // 2
//    val list = mutableListOf(1, 2, 3)
//    list.add(4)
//    print(list)

//    // 3
//    println(fullName)
//    lastName = "Kim"
//    println(fullName)


//    // 4
//    println(fizz)
//    println(fizz)
//    println(buzz)


    /**
     * */
//    val list = listOf(1,2,3)
//    if (list is MutableList) {
//        list.add(4)
//    }


    /***/
//    val names: MutableSet<Name> = mutableSetOf()
//    val person = Name("서창무")
//    names.add(person)
//    println(names)
//    println(person in names)
//    person.name = "박준범"
//
//    println(names)
//    println(person in names)

    /***/
    var list = listOf<Int>()
    for (i in 1..1000) {
        thread {
            list = list  + i
        }
    }
    Thread.sleep(1000)
    println(list.size)

    var list2 = mutableListOf<Int>()
    for (i in 1..1000) {
        thread {
            list2.add(i)
        }
    }
    Thread.sleep(1000)
    println(list2.size)



}


//var firstName: String = "Changmu"
//var lastName: String = "Seo"
//val fullName: String
//    get() = "$firstName $lastName"

//fun calculate(): Int {
//    print("Calculating.. ")
//    return 42
//}
//val fizz = calculate()
//val buzz
//    get() = calculate()

data class Name(var name: String)

var name = listOf<Name>()
    private set

 open class Animal{
    var age = 2
    var gender = "male"

}

class Dog : Animal(){
    fun bark(){

        println("Woof!!")
    }
}

class Cat: Animal(){
    fun meow(){
        println("meow !meow!!")
    }

}

fun main() {
    var a = Animal()
    var d = Dog()
    var c = Cat()


}
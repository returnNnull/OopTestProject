open class People(var name:String, var gender: Boolean) {

    var age: Int = 18
    set(value){
        if (value > 0) {
            field = value
        }
        else {
            println("age error")
        }
    }


    @JvmName("setAge1")
    fun setAge(value: Int) {
        if (value > 0){
            age = value
        } else {
            println("age error")
        }

    }


    override fun toString(): String {
        return "People(name='$name', age=$age, gender=$gender)"
    }
}
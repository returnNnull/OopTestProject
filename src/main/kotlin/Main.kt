fun main(args: Array<String>) {

    val note1 = Note("title1", "body1", "img.png", 10)
    val note2 = Note("title2", "body2","img2.png", 15)
    note1.test = "sdfsdf"

    var  list = arrayListOf<Note>()
    list.add(note1)
    list.add(note2)

    var people = People("Igor", true)
    people.age = 18

    var student = Student("name", true, "102")

    printPeople(student)
    printPeople(people)
}


fun printNote(note: Note){
    println(note)
}

fun printPeople(people: People){
    println(people)
}

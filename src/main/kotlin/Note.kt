class Note constructor(var title: String, var body: String, var img: String, var likes: Int) {

    var test: String = ""


    @JvmName("setTest1")
    fun setTest(value: String){
        test = value
    }

    override fun toString(): String {
        return "title='$title', body='$body', img='$img', likes=$likes"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Note

        if (title != other.title) return false
        if (body != other.body) return false
        if (img != other.img) return false
        if (likes != other.likes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + body.hashCode()
        result = 31 * result + img.hashCode()
        result = 31 * result + likes
        return result
    }


}
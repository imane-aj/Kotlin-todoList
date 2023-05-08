package prototype.todolist.data


class TaskEntry (
    var id: Int,
    var title: String,
    var priority: Int,
    var timestamp: Long?
){
    override fun equals(other: Any?): Boolean {
        return true
    }
}


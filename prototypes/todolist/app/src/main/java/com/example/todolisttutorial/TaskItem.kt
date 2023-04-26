package com.example.todolisttutorial

import java.util.UUID

class TaskItem (
    var name: String,
    var desc: String,
    var id:UUID = UUID.randomUUID()
){}
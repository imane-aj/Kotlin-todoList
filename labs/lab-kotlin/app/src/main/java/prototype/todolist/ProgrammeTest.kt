package prototype.todolist

import prototype.todolist.data.TaskDao
import prototype.todolist.data.TaskEntry
import prototype.todolist.data.TaskRepository

fun main (){

    //val taskRepository = TaskRepository()

    print("Programme de Test")
    val taskRepository = TaskRepository()
    // Ajouter une tâche
    val task = TaskEntry(1,"Task 1",1,null)
    //taskRepository.save(task);
    val task2 = TaskEntry(2,"Task 2",2,null)
    println(task == task2)
    println(task.equals(task2))

    // Suprimer une tâche

    // Modifier une tâche

    // Afficher les tâches


}
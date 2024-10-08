package com.romandev;

import com.romandev.datastructure.ArrayLesson;
import com.romandev.datastructure.Task;
import com.romandev.datastructure.TaskHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Array lesson");
        ArrayLesson arrayLesson = new ArrayLesson();
        arrayLesson.arrayShorter();

        int[] values = {99,13,45,32,50,88,109,129,947,303,234};
        ArrayLesson arrayLessonTwo = new ArrayLesson(values);
        arrayLessonTwo.arrayShorter();
        System.out.println("----Busqueda binaria----");
        int numberToFind = 32;
        int index = arrayLessonTwo.binaryFinder(numberToFind);
        System.out.println("indice del numero: "+numberToFind +" es " + index);

        TaskHandler taskHandler = new TaskHandler();
        taskHandler.addTask(new Task("Pasear al perro", 1));
        taskHandler.addTask(new Task("Estudiar", 1));
        taskHandler.addTask(new Task("Comprar pan", 3));
        taskHandler.addTask(new Task("Regar las plantas", 2));

        taskHandler.completeTask();

        taskHandler.seeAllTasks();
    }
}
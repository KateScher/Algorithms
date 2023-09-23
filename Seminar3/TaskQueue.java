package Seminar3;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {

  public static void main(String[] args) {
    Queue<String> taskQueue = new LinkedList<>();

    // Добавляем задания в очередь
    taskQueue.add("Задание 1");
    taskQueue.add("Задание 2");
    taskQueue.add("Задание 3");

    // Пока очередь не пуста, обрабатываем задания
    while (!taskQueue.isEmpty()) {
      String task = taskQueue.poll(); // Извлекаем задание из начала очереди
      System.out.println("Обрабатывается " + task);
      // Здесь можно добавить задержку или другую логику, имитирующую работу принтера
      System.out.println(task + " обработано!");
    }
  }
}
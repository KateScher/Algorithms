package Seminar3;

// 1.Реализуем метод добавления новых элементов в начало списка и удаление

// первого элемента связного списка.
// 2.Односвязный список всегда имеет ссылку на первый элемент
// последовательности, потому именно с реализации методов для первого
// элемента последовательности стоит начать

public static void main(String[]args){
// Определение класса для узла связного списка
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }}

  // Создание узлов и связывание их в список
  Node firstNode = new Node(1);
  Node secondNode = new Node(2);firstNode.next=secondNode;

  // Вывод значений узлов
  System.out.println(firstNode.data); // Выведет 1
  System.out.println(firstNode.next.data); // Выведет 2

public void add(Node n, int el){


}
}

}
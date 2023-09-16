package Seminar2;

// public static void bobbleSort(int[] array) {
// boolean finish;
// do {
// finish = true;
// for (int i = 1; i < array.length - 1; i++) {
// if (array[i] > array[i + 1]) {
// int temp = array[i];
// array[i] = array[i + 1];
// array[i + 1] = temp;
// finish = false;
// }
// }
// } while (!finish);
// Метод для сортировки пузырьком

// 2Й вариант

public class seminar2 {

  /**
   * @param args
   */
  public static void main(String[] args) {
  }

  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // Обмен элементов, если они стоят в неправильном порядке
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }

      // Если внутренний цикл не выполнил ни одной замены, то массив уже отсортирован
      if (!swapped) {
        break;
      }
    }
  }
}

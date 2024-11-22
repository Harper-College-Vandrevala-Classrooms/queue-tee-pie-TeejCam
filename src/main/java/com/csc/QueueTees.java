package com.csc;

public class QueueTees {

  int size = 5;
  Cutie items[] = new Cutie[size];
  int front, rear;

  QueueTees() {
    front = -1;
    rear = -1;
  }

  public Boolean isFull() {
    if(rear == size - 1){
      return true;
    } else {
      return false;
    }
  }

  public Boolean isEmpty() {
    if(front == -1){
      return true;
    } else {
      return false;
    }
  }

  public int getSize() {
    if(isEmpty()){
      return 0;
    }
    return rear - front + 1;
  }

  public void enQueue(Cutie element) {
    if(isFull()){
      System.out.println("Queue is full!");
    } else {
      if(front == -1){
        front = 0;
      }
      rear++;
      items[rear] = element;
      System.out.println("Inserted" + element);
    }
  }

  public Cutie deQueue() {
    Cutie element;
    if(isEmpty()){
      System.out.println("Queue is empty!");
      return null;
    } else {
      element = items[front];
      if(front >= rear) {
        front = -1;
        rear = -1;
      } else {
        front++;
      }
      System.out.println("Deleted -> " + element);
      return element;
    }
  }

  public void Display() {
    int i;
    if(isEmpty()){
      System.out.println("Empty queue!");
    } else {
      System.out.println("\nFront index -> " + front);
      System.out.println("Items ->" );
      for(i = front; i <= rear; i++){
        System.out.println(items[i] + " ");
      }
      System.out.println("\nRear index -> " + rear);
    }
  }

}

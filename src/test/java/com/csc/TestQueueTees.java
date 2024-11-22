package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueueTees {

  QueueTees queue;

  @BeforeEach
  void setUp() {
    queue = new QueueTees();
  }

  /*@Test
  void itWorks() {
    assertEquals(true, true);
  }*/

  @Test 
  void testSizeForZero()
  {
    assertEquals(0, queue.getSize());
  }

  @Test 
  void testSizeForOne() {
    Puppy puppy = new Puppy();
    queue.enQueue(puppy);
    assertEquals(1, queue.getSize());
  }

  @Test
  void TestSizeForTwo() {
    Puppy puppy = new Puppy();
    Puppy puppy1 = new Puppy();
    Kitten kitten = new Kitten();
    queue.enQueue(puppy);
    queue.enQueue(puppy1);
    queue.enQueue(kitten);
    queue.deQueue();

    assertEquals(2, queue.getSize());
  }
}

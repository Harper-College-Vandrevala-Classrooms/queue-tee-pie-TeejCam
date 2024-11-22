package com.csc;

public class QueueTeesDriver {
    public static void main(String[] args)
    {
        QueueTees queue = new QueueTees();

        Puppy puppy1 = new Puppy();
        Puppy puppy2 = new Puppy();
        Kitten kitten1 = new Kitten();
        Kitten kitten2 = new Kitten();
        Kitten kitten3 = new Kitten();
        Kitten kitten4 = new Kitten();

        queue.enQueue(puppy1);
        queue.enQueue(puppy2);
        queue.enQueue(kitten1);
        queue.enQueue(kitten2);
        queue.enQueue(kitten3);
        queue.enQueue(kitten4);

        queue.deQueue();
        queue.deQueue();

        queue.getSize();

    }
}
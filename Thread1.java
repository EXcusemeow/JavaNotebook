
// p 多线程
// b ---------------------------线程的结构
// Java线程是操作系统能够进行运算调度的最小单位，它被包含在进程之中，是进程中的实际运作单位。Java线程有一个优先级，这样有助于操作系统确定线程的调度顺序。

//g Java线程的主要组成部分通常被描述为“三大件”，它们是：
// 程序计数器(Program Counter，PC)：用于存储线程当前执行的指令地址。每个线程都有自己的PC，当线程被切换时，PC也会被保存和恢复。程序计数器在线程私有内存区域中，不会出现线程安全问题。

// Java虚拟机栈(Java Virtual Machine Stack)：Java虚拟机栈是一个后进先出的栈，用于存储线程执行方法时的局部变量、操作数栈和返回值等信息。每个方法执行时都会创建一个栈帧，当方法返回时，栈帧也会被销毁。Java虚拟机栈也是线程私有的内存区域，不会出现线程安全问题。

// 堆(Heap)：Java堆是JVM中存储对象实例的内存区域。所有线程都共享同一个Java堆。由于多个线程可能同时访问同一对象，因此Java堆可能会出现线程安全问题。为了保证多线程访问Java堆的安全性，需要采用线程安全的对象设计和多线程访问控制机制，如synchronized关键字、Lock接口等。

// 这“三大件”是Java线程的基本组成部分，对于理解Java线程的机制和编写高效的多线程程序非常重要。除此之外，Java线程还包括了其他一些重要的概念和组件，例如线程同步和通信机制、线程状态和优先级等。
// b ---------------------------线程的状态
// Java线程有四种状态：
//o 新建状态 (New)：当线程对象被创建时，线程处于新建状态。此时，操作系统尚未为线程分配资源，线程无法运行。
//o 可运行状态 (Runnable)：线程进入可运行状态后，等待操作系统分配资源运行。此时，线程已经分配了所有需要的资源，并可以运行。线程可能因为等待CPU时间片或者其他的原因，被挂起或者放弃执行，进入阻塞或者等待状态。
//o 阻塞状态 (Blocked)：线程因为某种原因暂时停止执行，等待外部的通知或者事件，进入阻塞状态。阻塞状态下的线程不会消耗CPU时间片。常见的阻塞状态包括等待获取锁、等待输入/输出操作完成等。
// 等待状态 (Waiting)：线程因为某种原因暂时停止执行，等待其他线程的通知，进入等待状态。与阻塞状态不同的是，等待状态下的线程需要被其他线程唤醒。例如，线程调用了Object.wait()方法后就会进入等待状态。
// 计时等待状态 (Timed Waiting)：线程因为某种原因暂时停止执行，等待其他线程的通知或者一定时间后再继续执行，进入计时等待状态。例如，线程调用了Thread.sleep()方法或者Object.wait(long timeout)方法后就会进入计时等待状态。
//o 终止/死亡状态dead (Terminated)：线程执行完毕或者因为异常等原因退出运行，进入终止状态。

//y Java中断线程是指在一个线程中向另一个线程发送一个信号，表示要求该线程退出运行。Java没有提供直接终止线程的方法，因为这样可能会导致资源泄露或数据不一致。
// y Java提供了一种协作式的中断机制，即通过调用Thread类的interrupt ()方法来设置线程的中断标志，然后在被中断的线程中检查该标志并做出相应的响应。
//o interrupt ()方法只是给目标线程发出一个中断请求，并不会强制终止目标线程。目标线程需要在合适的时机检查自己的中断状态，有以下几种方式：
//o 调用Thread类的静态方法interrupted ()，该方法会返回当前线程的中断状态，并清除该状态（即再次调用该方法会返回false）。
//o 调用Thread类的实例方法isInterrupted ()，该方法会返回当前线程的中断状态，但不会清除该状态（即再次调用该方法仍然会返回true）。
//g 在阻塞状态（如sleep ()、wait ()、join ()等）下被中断，会抛出InterruptedException异常，并清除中断状态。
//g 一些阻塞操作，如Thread.sleep()、Object.wait()等方法，会响应线程的中断，即在这些方法被中断时，会抛出InterruptedException异常。此时，线程可以在catch语句中进行相应的处理，也可以直接退出线程的执行。
// 目标线程在检查到自己被中断后，可以根据具体情况选择如何响应，比如：
// 立即结束run ()方法，退出线程。
// 抛出一个自定义的异常，通知上层调用者。
// 在某个合适的地方保存当前的状态，然后结束run ()方法，退出线程。
// 忽略中断请求，继续执行。
// 总之，Java中断线程是一种协作式的机制，需要被中断的线程主动参与和响应。这样可以避免一些潜在的问题，比如资源未释放或数据不一致等。

//b ----------------------Java提供了三种创建线程的方法：

//o 通过继承Thread类本身；
// Thread类是Runnable接口的实现类，只有Thread类和Thread类的子类的对象才是线程对象，且Thread类中存在着启动线程的方法start()。
// 通过实现Runnable接口，实现run ()方法，然后创建Runnable实现类的对象，并作为参数传递给Thread类的构造器，创建Thread对象，并调用start ()方法启动线程。

//o 通过实现Runnable接口；
// Runnable接口是线程的任务接口，其只有一个抽象方法：void run()，而run方法就是线程需要执行的任务代码。
// 通过继承Thread类，重写run ()方法，然后创建Thread子类的对象，并调用start ()方法启动线程。
//g 通过Callable和Future创建线程。
// Callable和Future是Java 5提供的一种新的创建线程的方式，它们可以返回一个结果，并且能够抛出异常。
// 通过实现Callable接口，实现call ()方法，然后创建Callable实现类的对象，并作为参数传递给FutureTask类的构造器，创建FutureTask对象，并作为参数传递创建的Thread对象Thread类的构造器，来调用start ()方法启动线程。
// FutureTask类可以用来包装一个Callable或Runnable对象，以便在将来的某个时刻执行，同时可以获取执行结果。它实现了Future接口，可以用来查询任务是否完成、等待任务完成并获取执行结果等。

// Callable和Future是Java中用于创建线程和获取异步结果的两个接口。Callable是一个有返回值的任务，它有一个call()方法，可以抛出异常。Future是一个用于存储异步结果的对象，它有一个get()方法，可以等待Callable完成并返回结果。Future还有一个cancel()方法，可以取消关联的Callable任务。
// 要创建线程，需要一个Runnable对象。要获取结果，需要一个Future对象。Java库提供了一个实现了Runnable和Future接口的类，叫做FutureTask，它可以用Callable对象作为构造参数，然后传递给Thread对象来创建线程。

//g 这三种方法的优缺点如下：
// 继承Thread类的方法最简单，但是由于Java只支持单继承，所以如果一个类已经继承了其他类，就不能再继承Thread类了。而且这种方法不能实现多个线程共享同一个资源的目的。
// 实现Runnable接口的方法更灵活，可以避免单继承的局限性，也可以实现多个线程共享同一个资源的目的。但是这种方法不能让线程有返回值，也不能让线程抛出异常。
// 实现Callable接口的方法最强大，可以让线程有返回值，也可以让线程抛出异常。但是这种方法相对复杂，需要借助FutureTask类来获取返回值。
// b --------------------------Thread线程控制
//o 线程中常用的方法有以下几种：
//g start ()：启动一个新线程，新线程会执行 run () 方法。调用 start () 方法后，该线程进入就绪状态，等待调度器分配 CPU 资源。
//g run ()：定义线程要执行的任务，可以直接调用，也可以在子类中重写。直接调用 run () 方法不会启动新线程，只是在当前线程中执行 run () 方法。

//g wait ()：让线程进入等待状态，释放对象锁，直到被其他线程notify/唤醒或中断。wait 方法通常和 synchronized 一起使用，以实现多线程之间的协调和通信。
//g notify ()：唤醒在该对象上等待的一个线程，如果有多个线程等待，随机选择一个唤醒。
//g notifyAll ()：唤醒在该对象上等待的所有线程。

//g sleep (long millis)：让线程睡眠指定的毫秒数，不释放对象锁，睡眠期间可以被中断。允许低级进程运行
//g join ()：让当前线程等待另一个线程结束，相当于在当前线程中调用另一个线程的 run () 方法。
//g yield ()：让当前线程让出 CPU 时间片，重新进入就绪状态，等待调度器重新分配 CPU 资源。该方法是静态的，可以直接用 Thread.yield () 调用。调用 yield () 方法并不会让线程进入阻塞状态，也不会释放对象锁，只是给其他同级线程一个执行的机会。放入就绪队列尾部
//g isAlive ()：判断当前线程是否存活，即是否处于新建或终止状态。该方法是非静态的，需要用 Thread 对象来调用。返回值是一个布尔值，如果线程还活着，返回 true，否则返回 false。

//g interrupt()：中断线程，设置线程的中断标志位。
//g isInterrupted()：判断线程是否被中断。

// o 线程优先级调度
// 线程优先级方法是 Thread 类中的一些方法，用于设置和获取线程的优先级。线程的优先级是一个整数，取值范围是 1-10，其中 1 是最低优先级，10 是最高优先级，5 是默认优先级。线程的优先级可以影响线程调度的顺序，但不是绝对的，具体还取决于操作系统的实现。
//g yield ()：让当前线程让出 CPU 时间片，重新进入就绪状态，等待调度器重新分配 CPU 资源。该方法是静态的，可以直接用 Thread.yield () 调用。调用 yield () 方法并不会让线程进入阻塞状态，也不会释放对象锁，只是给其他线程一个执行的机会。放入就绪队列尾部
//g setPriority (int newPriority)：设置线程的优先级，参数 newPriority 必须在 1-10 之间，否则会抛出 IllegalArgumentException 异常。
//g getPriority ()：获取线程的优先级，返回值是一个整数。
// setDefaultUncaughtExceptionHandler (Thread.UncaughtExceptionHandler eh)：设置线程的默认未捕获异常处理器，参数 eh 是一个 Thread.UncaughtExceptionHandler 对象，用于处理线程在运行过程中发生的未捕获异常。
// getDefaultUncaughtExceptionHandler ()：获取线程的默认未捕获异常处理器，返回值是一个 Thread.UncaughtExceptionHandler 对象。
//g 线程信息
// setName(String name)：设置线程的名称。如果不设置线程的名称，线程会自动生成一个默认的名称，例如"Thread-0"、"Thread-1"等。
// getName()：获取线程的名称。
// getState()：获取线程的状态，有新建、就绪、运行、阻塞、死亡等状态。
//no isDaemon()：判断线程是否是守护线程。
//no setDaemon(boolean on)：设置线程是否为守护线程。
// b --------------------------线程的互斥
// 在Java中，可以使用关键字synchronized和lock机制来实现线程的互斥
//o synchronized关键字：它可以用来修饰方法或代码块。当线程进入被synchronized修饰的代码块时，它会试图获得锁。如果锁没有被其他线程占用，则该线程获得锁，并且可以执行代码。如果锁已经被其他线程占用，则该线程会被阻塞，直到锁被释放。
/**
 * g 同步代码块使用synchronized关键字来锁定一个方法，可以使该代码块在任意时刻只能被一个线程执行
 * w public synchronized void doSomething(){// 该方法只能被一个线程执行...}
 * g 同步代码块使用synchronized关键字来锁定一个代码块，可以使该代码块在任意时刻只能被一个线程执行
 * w public void doSomething(){// ...
 * w synchronized(this){// 这个代码块在任意时刻只能被一个线程执行// ...}
 * w ...}
 * g 可以使用任何对象来作为锁对象，但是需要保证在访问共享资源时，所有的线程都使用同一个锁对象
 * w public void doSomething(){
 * w Object lock = new Object();
 * w synchronized(lock){// 这个代码块在任意时刻只能被一个线程执行// ... }
 * w ...}
 */

// lock机制：它可以更加灵活地控制锁的获取和释放。Lock接口定义了lock()和unlock()方法，分别用于获取和释放锁。使用lock机制可以避免synchronized关键字可能出现的一些问题，例如死锁、无法中断等。
/**Lock是一个Java接口，它定义了一些用于实现线程同步的方法，例如lock()，unlock()，tryLock()等。
 * Lock接口比synchronized关键字提供了更灵活和更强大的锁功能，例如可以支持公平性，可中断性，超时等。
 * Lock接口有多个实现类，例如ReentrantLock，ReentrantReadWriteLock，StampedLock等。使用Lock接口时，需要注意以下几点：
Lock接口不是自动释放锁的，需要在finally语句块中手动调用unlock()方法来释放锁，否则可能会导致死锁或内存泄漏。
Lock接口可以配合Condition接口来实现线程间的等待和通知机制，类似于Object类的wait()和notify()方法。
Lock接口可以通过设置fairness属性来控制锁的公平性，如果为true，则按照线程请求锁的顺序来分配锁；如果为false，则不保证任何顺序。
*/
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Thread1 {
    public static void main(String[] args) {
        // 定义一个共享的锁对象
        Object lock = new Object();

        // -------------------------创建一个MyThread类的线程
        MyThread thread = new MyThread(lock);
        // -------------------------创建一个MyRunnable类的线程
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);

        // ----------------------------创建一个MyCallable类的线程
        // 在main 方法中将 MyThread 线程的 ID 传递给 MyCallable类的构造方法，这样就可以根据这个 ID 来唤醒线程。
        MyCallable callable = new MyCallable(lock, thread.getId());// Thread.currentThread().getId()替代过时getId()
        FutureTask<String> task = new FutureTask<>(callable);
        Thread thread2 = new Thread(task);

        thread2.start();
        thread.start();
        thread1.start();

    }

}

// o -------------通过继承Thread类本身；
class MyThread extends Thread {
    // 接收一个锁对象
    private Object lock;

    public MyThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        // 线程执行逻辑
        synchronized (lock) {//
            for (int i = 0; 5 > i; i++) {
                System.out.println("thread t1  " + i);
                // 在synchronized代码块中调用wait方法

                if (i == 0) {
                    try {
                        System.out.println("thread t1  等待");
                        lock.wait(); // 释放锁，并等待
                    } catch (InterruptedException e) {// 需要捕获interrupted
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}

// o 通过实现Runnable接口；
class MyRunnable implements Runnable {
    public void run() {
        // 线程执行逻辑
        for (int i = 0; 5 > i; i++) {
            System.out.println("thread r2  " + i);
        }
    }
}

// g 通过Callable和Future创建线程。
class MyCallable implements Callable<String> {
    // 接收一个锁对象和一个要唤醒的线程ID
    private Object lock;
    // 应该传入的是 MyThread 线程对象的引用，而不是线程 ID。??
    private long threadId;// 因为wait和notify方法必须使用同一个锁对象，而且在调用wait和notify方法时，必须是同一个线程，否则会抛出IllegalMonitorStateException异常。

    public MyCallable(Object lock, long threadId) {
        this.lock = lock;
        this.threadId = threadId;// MyCallable需要知道要唤醒哪个线程的ID，才能在正确的锁对象上调用notify方法，唤醒指定的线程。
    }

    public String call() {
        // 线程执行逻辑
        synchronized (lock) {
            for (int i = 0; 5 > i; i++) {
                System.out.println("thread c3  " + i);
                try {
                    System.out.println("thread c3  睡眠 1");
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (i == 2) {
                    System.out.println("thread t1  唤醒");
                    lock.notify();// 虽然调用了notify方法唤醒了另一个线程，但是这个线程需要重新获得锁才能够继续执行
                    try {
                        Thread.sleep(1); // 休眠一段时间，等待另一个线程获取锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } //
        return "result";
    }
}

// g 设置线程优先级的示例 线程优先级的高低并不一定决定了线程的执行顺序，这还取决于操作系统和虚拟机的调度策略。
// 定义一个自定义线程类，继承Thread类
class MyT extends Thread {
    // 重写run方法

    public void run() {
        // 打印当前线程的名称和优先级
        System.out.println(this.getName() + " : " + this.getPriority());
    }
}

class ThreadTest {
    public static void main(String[] args) {
        // o 创建一个主线程对象 currentThread() 是 Thread 类的一个静态方法，用于获取当前执行线程的引用。//非必要
        // 程序启动时，会自动创建一个主线程（Main Thread），也就是启动程序的线程，该线程也可以通过 currentThread() 方法来获取。
        Thread mainThread = Thread.currentThread();
        // 设置主线程的优先级为6
        mainThread.setPriority(6);
        // 打印主线程的名称和优先级
        System.out.println(mainThread.getName() + " : " + mainThread.getPriority());

        // 创建两个自定义线程对象
        MyT t1 = new MyT();
        MyT t2 = new MyT();
        MyT t3 = new MyT();
        // 设置t1的优先级为最高（10）
        t1.setPriority(Thread.MAX_PRIORITY);// Thread的属性
        // 设置t2的优先级为最低（1）
        t2.setPriority(Thread.MIN_PRIORITY);
        // 启动两个自定义线程
        t1.start();
        t2.start();
        t3.start();
        new MyT().start();// new 类对象直接启动
    }
}
// g ------------------使用wait()和notify()方法的示例代码。
// 代码是一个简单的生产者消费者问题，其中有一个共享的缓冲区，生产者线程向缓冲区中放入数据，消费者线程从缓冲区中取出数据。为了避免缓冲区溢出或空闲，生产者线程和消费者线程需要进行同步，即当缓冲区满时，生产者线程需要等待消费者线程取出数据后再继续放入数据；当缓冲区空时，消费者线程需要等待生产者线程放入数据后再继续取出数据。这就需要使用wait()和notify()方法来实现。

// 定义一个共享的缓冲区类
class Buffer {
    private int data; // 存储数据的变量
    private boolean empty; // 标记缓冲区是否为空

    public Buffer() {
        this.empty = true; // 初始时缓冲区为空
    }

    // 同步的放入数据的方法
    public synchronized void put(int data) {
        // 如果缓冲区不为空，就等待消费者取出数据
        while (!empty) {
            try {
                wait();//直接调用
            } catch (InterruptedException e) {//InterruptedException会报中断
                e.printStackTrace();
            }
        }
        // 放入数据，并设置缓冲区为非空
        this.data = data;
        this.empty = false;
        System.out.println("放入了数据：" + data);
        // 唤醒消费者线程
        notify();//直接调用
    }

    // 同步的取出数据的方法
    public synchronized int get() {
        // 如果缓冲区为空，就等待生产者放入数据
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 取出数据，并设置缓冲区为空
        int result = this.data;
        this.empty = true;
        System.out.println("取出了数据：" + result);
        // 唤醒生产者线程
        notify();
        return result;
    }
}

// 定义一个生产者线程类，实现Runnable接口
class Producer implements Runnable {
    private Buffer buffer; // 共享的缓冲区对象

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    
    public void run() {
        // 生产10个数据放入缓冲区
        for (int i = 1; i <= 10; i++) {
            buffer.put(i);
            try {
                Thread.sleep(100); // 模拟生产时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 定义一个消费者线程类，实现Runnable接口
class Consumer implements Runnable {
    private Buffer buffer; // 共享的缓冲区对象

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    
    public void run() {
        // 消费10个数据从缓冲区
        for (int i = 1; i <= 10; i++) {
            buffer.get();
            try {
                Thread.sleep(100); // 模拟消费时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 创建并启动生产者和消费者线程
class TestWaitNotify {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(); // 创建一个共享的缓冲区对象

        Producer producer = new Producer(buffer); // 创建一个生产者线程对象，并传入缓冲区对象
        Consumer consumer = new Consumer(buffer); // 创建一个消费者线程对象，并传入缓冲区对象

        Thread producerThread = new Thread(producer); // 创建一个生产者线程，并传入生产者线程对象
        Thread consumerThread = new Thread(consumer); // 创建一个消费者线程，并传入消费者线程对象
        
        producerThread.start(); // 启动生产者线程
        consumerThread.start(); // 启动消费者线程
    }
}
1 public class Job implements Runnable {
2 private int jobNumber;
3
4 Job (int jobNumber) {
5 this.jobNumber = jobNumber;
6 }
7
8 public void run () {
9 // Undertake required work, here we will emulate it by sleeping for a period
10 System.out.println ("Job: " + jobNumber + " is being processed by thread : "
11 + Thread.currentThread ().getName());
12 try {
13 Thread.sleep((int)(1000));
14 } catch (InterruptedException e) {
15 // no catching as example should not experience interruptions
16 }
17 System.out.println("Job: " + jobNumber + " is ending in thread : "
18 + Thread.currentThread().getName());
19 }
20
21 }

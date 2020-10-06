import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolApp {
    public static void main(String[] args) {
        if (args.length < 2){
            ThreadPoolApp.error();
        }
        try{
            int numberOfJobs = Integer.parseInt(args[0]);
            int numberOfThreads = Integer.parseInt(args[1]);
            if ((numberOfJobs < 1) || numberOfThreads < 1){
                ThreadPoolApp.error();
            }
            ExecutorService pool = Executors.newFixedThreadPool(numberOfThreads);

            Job [] jobs = new Job[numberOfJobs];
            for (int i=0; i<numberOfJobs; i++){
                jobs[i] = new Job(i);
            }
            pool.shutdown();
            System.out.println("Last line: " + Thread.currentThread().getName());
        } catch (NumberFormatException e){
            ThreadPoolApp.error();
        }
    }
    private static void error(){
        System.out.println("ThreadPoolApp must be running with two positive values");
        System.exit(0);
    }
}

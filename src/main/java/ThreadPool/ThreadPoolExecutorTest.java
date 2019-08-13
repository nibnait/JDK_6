package ThreadPool;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/*

 */
public class ThreadPoolExecutorTest extends TestCase {

    @Test
    public void testCase() {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 10,
                100, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<Runnable>(1));

        for (int i = 0; i < 40; i++) {
            threadPoolExecutor.execute(new ThreadTask());
        }

        threadPoolExecutor.shutdown();
    }

    private class ThreadTask implements Runnable {
        private int count = 0;
        @Override
        public void run() {
            try {
                System.out.println("start===>:" + Thread.currentThread().getName() + " count = "+ count++);
                Thread.sleep(1000);
                System.out.println("end=========>:" + Thread.currentThread().getName() + " count = "+ count++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package cc.tinker.tasks;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Eagle on 2017/6/28.
 */
@Component
public class SyncTaskTest {



//    @Scheduled(initialDelay =1000, fixedDelay = 1000*5)
    @Async
    public void testSync1(){
        for (int i=0;i<10000;i++){
            System.out.println("task1111111111....."+i);
        }
    }



//    @Scheduled(initialDelay =1000, fixedDelay = 1000*5)
    @Async
    public void testSync2(){
        for (int i=0;i<10000;i++){
            System.out.println("task2222222222222....."+i);
        }
    }



//    @Scheduled(initialDelay =1000, fixedDelay = 1000*1)
//    @Async
//    public void testSync3(){
//        System.out.println("task3333333333333333.....");
//    }
}

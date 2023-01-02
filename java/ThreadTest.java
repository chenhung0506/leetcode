import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThreadTest implements Runnable {

    public static void main(String[] args) {
        Integer pageSize = 10;
        Integer threadLimit = 4;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Integer> list = new ArrayList<>();
        for ( int i = 0; i < 1000; i++ ) {
            list.add(i);
        }

        // List<Integer> list2 = list.stream().sorted((o1, o2)->o2.compareTo(o1)).collect(Collectors.toList());

        // System.out.println("list:{}"+ list.toString());
        // System.out.println("list:{}"+ list2.toString());

        try {
            Date beggin= formatter.parse("2022-11-20 23:10:10");
            Date end= formatter.parse("2022-11-30 23:10:10");
            System.out.println(beggin);
            System.out.println(end);
            int pageCount = list.size() / pageSize + 1;
            int pagePerThread = pageCount / threadLimit;
            int pageRemaining = pageCount % threadLimit;
            int threadCount =  pageCount < threadLimit ? pageCount : threadLimit;
            for (int i = 0; i < threadCount; i++) {
                final int pageStart = i * pagePerThread;
                final int pageEnd = (i+1) * pagePerThread + (i == threadCount -1 ? pageRemaining : 0) ;
                Thread thread = new Thread() {
                    public void run() {
                        handleData(pageStart, pageEnd, beggin, end);
                    }
                };                
                thread.start();
                if (thread.isAlive()) {
                    System.out.println("Thread has not finished");
                 } else {
                    System.out.println("Finished");
                 }
            };
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void handleData(Integer pageStart, Integer pageEnd, Date startTime, Date endTime) {
        System.out.println("pageStart:"+pageStart+", pageEnd:"+pageEnd);
        Integer pageSize = 100;
        for (int i = pageStart; i < pageEnd; i++) {
            System.out.println("pageSize:"+pageSize+", offset:"+pageSize*i);
        }
    }

    @Override
    public void run() {
        
    }
}
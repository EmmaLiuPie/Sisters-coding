package Test04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;


public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date firstTime = simpleDateFormat.parse("2020-12-20 13:42:30");
        timer.schedule(new TimerTaskTest(),firstTime,1000*10);

    }
}


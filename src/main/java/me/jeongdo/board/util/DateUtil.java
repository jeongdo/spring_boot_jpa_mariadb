package me.jeongdo.board.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * board
 * Class: me.jeongdo.board.util.DateUtil
 * Created on 2020-06-23.
 *
 * @author jeongdo
 */
public class DateUtil {

    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

}

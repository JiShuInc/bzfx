package com.cardinal.tech.bzfx.util;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Slf4j
public class DateUtil {
    /**
     * get now date object
     *
     * @param clock
     * @return
     */
    public static Date now(Clock clock) {
        return Date.from(Instant.now(clock));
    }

    /**
     * get now date object
     *
     * @return
     */
    public static Date now() {
        return Date.from(Instant.now());
    }

    /**
     * time after date
     *
     * @param date
     * @param time minute
     * @return
     */
    public static Date getAfter(Date date, int time) {
        return Date.from(date.toInstant().plus(time, ChronoUnit.MINUTES));
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static String format(Date date) {
        return simpleDateFormat.format(date);
    }

    public static String formatToDataSaveDir(Date date) {
        var ymd = new SimpleDateFormat("yyyyMMdd").format(date);
        return ymd;
    }

    public static Date parseToDate(String date) {
        try {
            return parseToDate(date, "yyyyMMddHHmmss");
        } catch (ParseException e) {
            log.error("日期{}解析为时间戳出错.", date, e);
        }
        return now();
    }

    public static Date parseToDate(String date, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(date);
    }


}

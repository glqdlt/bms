package com.glqdlt.bmscommon.persistence.book.entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By iw.jhun
 * On 2018-04-10 , 오전 10:47
 */
public class ScheduleTest {


    @Test
    public void isScheduleNone() {
        Schedule schedule = Schedule.none;
        assertEquals(false, schedule.isSchedule());
    }

    @Test
    public void isScheduleSet(){

        Schedule schedule = Schedule.set;
        assertEquals(true,schedule.isSchedule());
    }


}
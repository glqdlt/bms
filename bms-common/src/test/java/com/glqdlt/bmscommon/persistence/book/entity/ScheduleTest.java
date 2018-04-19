package com.glqdlt.bmscommon.persistence.book.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By iw.jhun
 * On 2018-04-10
 */
public class ScheduleTest {


    @Test
    public void isScheduleNone() {
        Schedule schedule = Schedule.NONE;
        assertEquals(false, schedule.isSchedule());
    }

    @Test
    public void isScheduleSet(){

        Schedule schedule = Schedule.SET;
        assertEquals(true,schedule.isSchedule());
    }


}
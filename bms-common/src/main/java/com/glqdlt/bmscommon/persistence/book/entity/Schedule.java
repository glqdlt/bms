package com.glqdlt.bmscommon.persistence.book.entity;

/**
 * Created By iw.jhun
 * On 2018-04-10
 */
public enum Schedule {

    NONE(false),SET(true);

    Schedule(boolean scheduled) {
        this.scheduled = scheduled;
    }

    private boolean scheduled;

    public boolean isSchedule() {
        return this.scheduled;
    }
}

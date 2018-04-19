package com.glqdlt.bmscommon.persistence.book.entity;

/**
 * Created By iw.jhun
 * On 2018-04-10
 */
public enum Schedule {

    SET{
        public boolean isSchedule(){
            return true;
        }
    },
    NONE;

    public boolean isSchedule(){
        return false;
    }
}

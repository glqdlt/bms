package com.glqdlt.bmscommon.persistence.book.entity;

/**
 * Created By iw.jhun
 * On 2018-04-10 , 오전 10:45
 */
public enum Schedule {

    set{
        public boolean isSchedule(){
            return true;
        }
    },
    none;

    public boolean isSchedule(){
        return false;
    }
}

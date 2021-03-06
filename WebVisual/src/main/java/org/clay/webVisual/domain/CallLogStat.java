package org.clay.webVisual.domain;

/**
 * 通话记录统计结果
 */
public class CallLogStat {
    private String yearMonth ;
    private int count ;

    public String getYearMonth() {
        return yearMonth;
    }

    public CallLogStat() {
    }

    public CallLogStat(String yearMonth, int count) {
        this.yearMonth = yearMonth;
        this.count = count;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

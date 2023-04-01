package com.amirnadiv.myforextester.dto;

import java.util.Objects;

public class Bar {

    String symbol;
    String date;
    String hour;
    double high;
    double low;
    double open;
    double close;
    int volume;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return Double.compare(bar.high, high) == 0 && Double.compare(bar.low, low) == 0 && Double.compare(bar.open, open) == 0 && Double.compare(bar.close, close) == 0 && volume == bar.volume && Objects.equals(symbol, bar.symbol) && Objects.equals(date, bar.date) && Objects.equals(hour, bar.hour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, date, hour, high, low, open, close, volume);
    }

    @Override
    public String toString() {
        return "Bar{" +
                "symbol='" + symbol + '\'' +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", high=" + high +
                ", low=" + low +
                ", open=" + open +
                ", close=" + close +
                ", volume=" + volume +
                '}';
    }
}

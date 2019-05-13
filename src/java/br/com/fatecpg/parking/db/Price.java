
package br.com.fatecpg.parking.db;

import java.util.Date;

public class Price {
    private long id;
    private Date timestamp;
    private double newPrice;

    public Price(long id, Date timestamp, double newPrice) {
        this.id = id;
        this.timestamp = timestamp;
        this.newPrice = newPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    
}

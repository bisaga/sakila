package com.bisaga.sakila.server;

import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestStatistics {

    static AtomicInteger requestCount = new AtomicInteger(0);

    private long requestStartTime;
    private long requestEndTime;

    @Inject
    public RequestStatistics(){
        requestCount.incrementAndGet();
    }

    public void setRequestStartTime(long requestStartTime) {
        this.requestStartTime = requestStartTime;
    }

    public void setRequestEndTime(long requestEndTime) {
        this.requestEndTime = requestEndTime;
    }

    public long getTotalRequestTime(){
        return requestEndTime - requestStartTime;
    }
}

package com.bisaga.sakila.server;

import javax.inject.Inject;
import java.util.UUID;

public class RequestSession {
    private final UUID sessionId;
    private final RequestStatistics requestStatistics;

    private static ThreadLocal<Transaction> threadLocalTransaction = new ThreadLocal<>();


    @Inject
    public RequestSession(
            RequestStatistics requestStatistics
    ){
        sessionId = UUID.randomUUID();
        this.requestStatistics = requestStatistics;
    }

    public RequestStatistics getRequestStatistics() {
        return requestStatistics;
    }

    public String getSessionId() {
        return sessionId.toString();
    }

    // only one connection is primary connection for the whole thread
    public static void setTransaction(Transaction transaction) {
        if(threadLocalTransaction.get() == null) {
            threadLocalTransaction.set(transaction);
        }
    }

    public static Transaction getTransaction() {
        return threadLocalTransaction.get();
    }

}

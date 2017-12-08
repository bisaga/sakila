package com.bisaga.sakila.server;

public class RecordsAffected extends ResponseMessage<Integer> {
    public RecordsAffected(Integer count) {
        super(count, "Records affected");
    }
}

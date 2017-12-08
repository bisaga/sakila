package com.bisaga.sakila.server;

import org.jooq.JSONFormat;
import org.jooq.Record;
import spark.ResponseTransformer;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RecordTransformer implements ResponseTransformer {

    @Inject
    RecordTransformer(){}

    @Override
    public String render(Object model) throws Exception {
        Record recordModel = (Record) model;
        return recordModel.formatJSON(new JSONFormat().header(false).recordFormat(JSONFormat.RecordFormat.OBJECT));
    }
}

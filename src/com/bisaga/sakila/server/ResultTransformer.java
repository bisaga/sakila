package com.bisaga.sakila.server;

import org.jooq.JSONFormat;
import org.jooq.Result;
import spark.ResponseTransformer;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ResultTransformer implements ResponseTransformer {

    @Inject
    ResultTransformer(){}

    @Override
    public String render(Object model) throws Exception {
        Result resultModel = (Result) model;
        return resultModel.formatJSON(new JSONFormat().header(false).recordFormat(JSONFormat.RecordFormat.OBJECT));
    }
}

package com.bisaga.sakila.spark;

import com.google.gson.Gson;
import org.jooq.Result;
import spark.ResponseTransformer;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class GsonTransformer implements ResponseTransformer {

    private final Gson gson;

    @Inject
    GsonTransformer(Gson gson){
        this.gson = gson;
    }

    @Override
    public String render(Object model) throws Exception {
        return gson.toJson(model);
    }
}

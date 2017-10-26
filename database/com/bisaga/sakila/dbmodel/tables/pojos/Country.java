/*
 * This file is generated by jOOQ.
*/
package com.bisaga.sakila.dbmodel.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Country implements Serializable {

    private static final long serialVersionUID = 1951506826;

    private Integer   countryId;
    private String    country;
    private Timestamp lastUpdate;

    public Country() {}

    public Country(Country value) {
        this.countryId = value.countryId;
        this.country = value.country;
        this.lastUpdate = value.lastUpdate;
    }

    public Country(
        Integer   countryId,
        String    country,
        Timestamp lastUpdate
    ) {
        this.countryId = countryId;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Country (");

        sb.append(countryId);
        sb.append(", ").append(country);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}

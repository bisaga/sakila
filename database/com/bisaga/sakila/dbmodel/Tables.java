/*
 * This file is generated by jOOQ.
*/
package com.bisaga.sakila.dbmodel;


import com.bisaga.sakila.dbmodel.tables.Actor;
import com.bisaga.sakila.dbmodel.tables.ActorInfo;
import com.bisaga.sakila.dbmodel.tables.Address;
import com.bisaga.sakila.dbmodel.tables.Category;
import com.bisaga.sakila.dbmodel.tables.City;
import com.bisaga.sakila.dbmodel.tables.Country;
import com.bisaga.sakila.dbmodel.tables.Customer;
import com.bisaga.sakila.dbmodel.tables.CustomerList;
import com.bisaga.sakila.dbmodel.tables.Film;
import com.bisaga.sakila.dbmodel.tables.FilmActor;
import com.bisaga.sakila.dbmodel.tables.FilmCategory;
import com.bisaga.sakila.dbmodel.tables.FilmInStock;
import com.bisaga.sakila.dbmodel.tables.FilmList;
import com.bisaga.sakila.dbmodel.tables.FilmNotInStock;
import com.bisaga.sakila.dbmodel.tables.Inventory;
import com.bisaga.sakila.dbmodel.tables.Language;
import com.bisaga.sakila.dbmodel.tables.NicerButSlowerFilmList;
import com.bisaga.sakila.dbmodel.tables.Payment;
import com.bisaga.sakila.dbmodel.tables.Rental;
import com.bisaga.sakila.dbmodel.tables.RewardsReport;
import com.bisaga.sakila.dbmodel.tables.SalesByFilmCategory;
import com.bisaga.sakila.dbmodel.tables.SalesByStore;
import com.bisaga.sakila.dbmodel.tables.SchemaVersion;
import com.bisaga.sakila.dbmodel.tables.Staff;
import com.bisaga.sakila.dbmodel.tables.StaffList;
import com.bisaga.sakila.dbmodel.tables.Store;
import com.bisaga.sakila.dbmodel.tables.records.FilmInStockRecord;
import com.bisaga.sakila.dbmodel.tables.records.FilmNotInStockRecord;
import com.bisaga.sakila.dbmodel.tables.records.RewardsReportRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.impl.DSL;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.actor</code>.
     */
    public static final Actor ACTOR = com.bisaga.sakila.dbmodel.tables.Actor.ACTOR;

    /**
     * The table <code>public.actor_info</code>.
     */
    public static final ActorInfo ACTOR_INFO = com.bisaga.sakila.dbmodel.tables.ActorInfo.ACTOR_INFO;

    /**
     * The table <code>public.address</code>.
     */
    public static final Address ADDRESS = com.bisaga.sakila.dbmodel.tables.Address.ADDRESS;

    /**
     * The table <code>public.category</code>.
     */
    public static final Category CATEGORY = com.bisaga.sakila.dbmodel.tables.Category.CATEGORY;

    /**
     * The table <code>public.city</code>.
     */
    public static final City CITY = com.bisaga.sakila.dbmodel.tables.City.CITY;

    /**
     * The table <code>public.country</code>.
     */
    public static final Country COUNTRY = com.bisaga.sakila.dbmodel.tables.Country.COUNTRY;

    /**
     * The table <code>public.customer</code>.
     */
    public static final Customer CUSTOMER = com.bisaga.sakila.dbmodel.tables.Customer.CUSTOMER;

    /**
     * The table <code>public.customer_list</code>.
     */
    public static final CustomerList CUSTOMER_LIST = com.bisaga.sakila.dbmodel.tables.CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>public.film</code>.
     */
    public static final Film FILM = com.bisaga.sakila.dbmodel.tables.Film.FILM;

    /**
     * The table <code>public.film_actor</code>.
     */
    public static final FilmActor FILM_ACTOR = com.bisaga.sakila.dbmodel.tables.FilmActor.FILM_ACTOR;

    /**
     * The table <code>public.film_category</code>.
     */
    public static final FilmCategory FILM_CATEGORY = com.bisaga.sakila.dbmodel.tables.FilmCategory.FILM_CATEGORY;

    /**
     * The table <code>public.film_in_stock</code>.
     */
    public static final FilmInStock FILM_IN_STOCK = com.bisaga.sakila.dbmodel.tables.FilmInStock.FILM_IN_STOCK;

    /**
     * Call <code>public.film_in_stock</code>.
     */
    public static Result<FilmInStockRecord> FILM_IN_STOCK(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        return DSL.using(configuration).selectFrom(com.bisaga.sakila.dbmodel.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId)).fetch();
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(Integer pFilmId, Integer pStoreId) {
        return com.bisaga.sakila.dbmodel.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(Field<Integer> pFilmId, Field<Integer> pStoreId) {
        return com.bisaga.sakila.dbmodel.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * The table <code>public.film_list</code>.
     */
    public static final FilmList FILM_LIST = com.bisaga.sakila.dbmodel.tables.FilmList.FILM_LIST;

    /**
     * The table <code>public.film_not_in_stock</code>.
     */
    public static final FilmNotInStock FILM_NOT_IN_STOCK = com.bisaga.sakila.dbmodel.tables.FilmNotInStock.FILM_NOT_IN_STOCK;

    /**
     * Call <code>public.film_not_in_stock</code>.
     */
    public static Result<FilmNotInStockRecord> FILM_NOT_IN_STOCK(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        return DSL.using(configuration).selectFrom(com.bisaga.sakila.dbmodel.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId)).fetch();
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(Integer pFilmId, Integer pStoreId) {
        return com.bisaga.sakila.dbmodel.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(Field<Integer> pFilmId, Field<Integer> pStoreId) {
        return com.bisaga.sakila.dbmodel.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * The table <code>public.inventory</code>.
     */
    public static final Inventory INVENTORY = com.bisaga.sakila.dbmodel.tables.Inventory.INVENTORY;

    /**
     * The table <code>public.language</code>.
     */
    public static final Language LANGUAGE = com.bisaga.sakila.dbmodel.tables.Language.LANGUAGE;

    /**
     * The table <code>public.nicer_but_slower_film_list</code>.
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = com.bisaga.sakila.dbmodel.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>public.payment</code>.
     */
    public static final Payment PAYMENT = com.bisaga.sakila.dbmodel.tables.Payment.PAYMENT;

    /**
     * The table <code>public.rental</code>.
     */
    public static final Rental RENTAL = com.bisaga.sakila.dbmodel.tables.Rental.RENTAL;

    /**
     * The table <code>public.rewards_report</code>.
     */
    public static final RewardsReport REWARDS_REPORT = com.bisaga.sakila.dbmodel.tables.RewardsReport.REWARDS_REPORT;

    /**
     * Call <code>public.rewards_report</code>.
     */
    public static Result<RewardsReportRecord> REWARDS_REPORT(Configuration configuration, Integer minMonthlyPurchases, BigDecimal minDollarAmountPurchased) {
        return DSL.using(configuration).selectFrom(com.bisaga.sakila.dbmodel.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased)).fetch();
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(Integer minMonthlyPurchases, BigDecimal minDollarAmountPurchased) {
        return com.bisaga.sakila.dbmodel.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased);
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(Field<Integer> minMonthlyPurchases, Field<BigDecimal> minDollarAmountPurchased) {
        return com.bisaga.sakila.dbmodel.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased);
    }

    /**
     * The table <code>public.sales_by_film_category</code>.
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = com.bisaga.sakila.dbmodel.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * The table <code>public.sales_by_store</code>.
     */
    public static final SalesByStore SALES_BY_STORE = com.bisaga.sakila.dbmodel.tables.SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>public.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = com.bisaga.sakila.dbmodel.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>public.staff</code>.
     */
    public static final Staff STAFF = com.bisaga.sakila.dbmodel.tables.Staff.STAFF;

    /**
     * The table <code>public.staff_list</code>.
     */
    public static final StaffList STAFF_LIST = com.bisaga.sakila.dbmodel.tables.StaffList.STAFF_LIST;

    /**
     * The table <code>public.store</code>.
     */
    public static final Store STORE = com.bisaga.sakila.dbmodel.tables.Store.STORE;
}

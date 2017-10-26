/*
 * This file is generated by jOOQ.
*/
package com.bisaga.sakila.dbmodel;


import com.bisaga.sakila.dbmodel.tables.Actor;
import com.bisaga.sakila.dbmodel.tables.Address;
import com.bisaga.sakila.dbmodel.tables.Category;
import com.bisaga.sakila.dbmodel.tables.City;
import com.bisaga.sakila.dbmodel.tables.Country;
import com.bisaga.sakila.dbmodel.tables.Customer;
import com.bisaga.sakila.dbmodel.tables.Film;
import com.bisaga.sakila.dbmodel.tables.FilmActor;
import com.bisaga.sakila.dbmodel.tables.FilmCategory;
import com.bisaga.sakila.dbmodel.tables.Inventory;
import com.bisaga.sakila.dbmodel.tables.Language;
import com.bisaga.sakila.dbmodel.tables.Payment;
import com.bisaga.sakila.dbmodel.tables.Rental;
import com.bisaga.sakila.dbmodel.tables.RewardsReport;
import com.bisaga.sakila.dbmodel.tables.Staff;
import com.bisaga.sakila.dbmodel.tables.Store;
import com.bisaga.sakila.dbmodel.tables.records.ActorRecord;
import com.bisaga.sakila.dbmodel.tables.records.AddressRecord;
import com.bisaga.sakila.dbmodel.tables.records.CategoryRecord;
import com.bisaga.sakila.dbmodel.tables.records.CityRecord;
import com.bisaga.sakila.dbmodel.tables.records.CountryRecord;
import com.bisaga.sakila.dbmodel.tables.records.CustomerRecord;
import com.bisaga.sakila.dbmodel.tables.records.FilmActorRecord;
import com.bisaga.sakila.dbmodel.tables.records.FilmCategoryRecord;
import com.bisaga.sakila.dbmodel.tables.records.FilmRecord;
import com.bisaga.sakila.dbmodel.tables.records.InventoryRecord;
import com.bisaga.sakila.dbmodel.tables.records.LanguageRecord;
import com.bisaga.sakila.dbmodel.tables.records.PaymentRecord;
import com.bisaga.sakila.dbmodel.tables.records.RentalRecord;
import com.bisaga.sakila.dbmodel.tables.records.RewardsReportRecord;
import com.bisaga.sakila.dbmodel.tables.records.StaffRecord;
import com.bisaga.sakila.dbmodel.tables.records.StoreRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ActorRecord, Integer> IDENTITY_ACTOR = Identities0.IDENTITY_ACTOR;
    public static final Identity<AddressRecord, Integer> IDENTITY_ADDRESS = Identities0.IDENTITY_ADDRESS;
    public static final Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
    public static final Identity<CityRecord, Integer> IDENTITY_CITY = Identities0.IDENTITY_CITY;
    public static final Identity<CountryRecord, Integer> IDENTITY_COUNTRY = Identities0.IDENTITY_COUNTRY;
    public static final Identity<CustomerRecord, Integer> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
    public static final Identity<FilmRecord, Integer> IDENTITY_FILM = Identities0.IDENTITY_FILM;
    public static final Identity<InventoryRecord, Integer> IDENTITY_INVENTORY = Identities0.IDENTITY_INVENTORY;
    public static final Identity<LanguageRecord, Integer> IDENTITY_LANGUAGE = Identities0.IDENTITY_LANGUAGE;
    public static final Identity<PaymentRecord, Integer> IDENTITY_PAYMENT = Identities0.IDENTITY_PAYMENT;
    public static final Identity<RentalRecord, Integer> IDENTITY_RENTAL = Identities0.IDENTITY_RENTAL;
    public static final Identity<RewardsReportRecord, Integer> IDENTITY_REWARDS_REPORT = Identities0.IDENTITY_REWARDS_REPORT;
    public static final Identity<StaffRecord, Integer> IDENTITY_STAFF = Identities0.IDENTITY_STAFF;
    public static final Identity<StoreRecord, Integer> IDENTITY_STORE = Identities0.IDENTITY_STORE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActorRecord> ACTOR_PKEY = UniqueKeys0.ACTOR_PKEY;
    public static final UniqueKey<AddressRecord> ADDRESS_PKEY = UniqueKeys0.ADDRESS_PKEY;
    public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = UniqueKeys0.CATEGORY_PKEY;
    public static final UniqueKey<CityRecord> CITY_PKEY = UniqueKeys0.CITY_PKEY;
    public static final UniqueKey<CountryRecord> COUNTRY_PKEY = UniqueKeys0.COUNTRY_PKEY;
    public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = UniqueKeys0.CUSTOMER_PKEY;
    public static final UniqueKey<FilmRecord> FILM_PKEY = UniqueKeys0.FILM_PKEY;
    public static final UniqueKey<FilmActorRecord> FILM_ACTOR_PKEY = UniqueKeys0.FILM_ACTOR_PKEY;
    public static final UniqueKey<FilmCategoryRecord> FILM_CATEGORY_PKEY = UniqueKeys0.FILM_CATEGORY_PKEY;
    public static final UniqueKey<InventoryRecord> INVENTORY_PKEY = UniqueKeys0.INVENTORY_PKEY;
    public static final UniqueKey<LanguageRecord> LANGUAGE_PKEY = UniqueKeys0.LANGUAGE_PKEY;
    public static final UniqueKey<PaymentRecord> PAYMENT_PKEY = UniqueKeys0.PAYMENT_PKEY;
    public static final UniqueKey<RentalRecord> RENTAL_PKEY = UniqueKeys0.RENTAL_PKEY;
    public static final UniqueKey<StaffRecord> STAFF_PKEY = UniqueKeys0.STAFF_PKEY;
    public static final UniqueKey<StoreRecord> STORE_PKEY = UniqueKeys0.STORE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AddressRecord, CityRecord> ADDRESS__FK_ADDRESS_CITY = ForeignKeys0.ADDRESS__FK_ADDRESS_CITY;
    public static final ForeignKey<CityRecord, CountryRecord> CITY__FK_CITY = ForeignKeys0.CITY__FK_CITY;
    public static final ForeignKey<CustomerRecord, AddressRecord> CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY = ForeignKeys0.CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY;
    public static final ForeignKey<FilmRecord, LanguageRecord> FILM__FILM_LANGUAGE_ID_FKEY = ForeignKeys0.FILM__FILM_LANGUAGE_ID_FKEY;
    public static final ForeignKey<FilmActorRecord, ActorRecord> FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY = ForeignKeys0.FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY;
    public static final ForeignKey<FilmActorRecord, FilmRecord> FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY = ForeignKeys0.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY;
    public static final ForeignKey<FilmCategoryRecord, FilmRecord> FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY = ForeignKeys0.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY;
    public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY = ForeignKeys0.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY;
    public static final ForeignKey<InventoryRecord, FilmRecord> INVENTORY__INVENTORY_FILM_ID_FKEY = ForeignKeys0.INVENTORY__INVENTORY_FILM_ID_FKEY;
    public static final ForeignKey<PaymentRecord, CustomerRecord> PAYMENT__PAYMENT_CUSTOMER_ID_FKEY = ForeignKeys0.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY;
    public static final ForeignKey<PaymentRecord, StaffRecord> PAYMENT__PAYMENT_STAFF_ID_FKEY = ForeignKeys0.PAYMENT__PAYMENT_STAFF_ID_FKEY;
    public static final ForeignKey<PaymentRecord, RentalRecord> PAYMENT__PAYMENT_RENTAL_ID_FKEY = ForeignKeys0.PAYMENT__PAYMENT_RENTAL_ID_FKEY;
    public static final ForeignKey<RentalRecord, InventoryRecord> RENTAL__RENTAL_INVENTORY_ID_FKEY = ForeignKeys0.RENTAL__RENTAL_INVENTORY_ID_FKEY;
    public static final ForeignKey<RentalRecord, CustomerRecord> RENTAL__RENTAL_CUSTOMER_ID_FKEY = ForeignKeys0.RENTAL__RENTAL_CUSTOMER_ID_FKEY;
    public static final ForeignKey<RentalRecord, StaffRecord> RENTAL__RENTAL_STAFF_ID_KEY = ForeignKeys0.RENTAL__RENTAL_STAFF_ID_KEY;
    public static final ForeignKey<StaffRecord, AddressRecord> STAFF__STAFF_ADDRESS_ID_FKEY = ForeignKeys0.STAFF__STAFF_ADDRESS_ID_FKEY;
    public static final ForeignKey<StoreRecord, StaffRecord> STORE__STORE_MANAGER_STAFF_ID_FKEY = ForeignKeys0.STORE__STORE_MANAGER_STAFF_ID_FKEY;
    public static final ForeignKey<StoreRecord, AddressRecord> STORE__STORE_ADDRESS_ID_FKEY = ForeignKeys0.STORE__STORE_ADDRESS_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ActorRecord, Integer> IDENTITY_ACTOR = createIdentity(Actor.ACTOR, Actor.ACTOR.ACTOR_ID);
        public static Identity<AddressRecord, Integer> IDENTITY_ADDRESS = createIdentity(Address.ADDRESS, Address.ADDRESS.ADDRESS_ID);
        public static Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = createIdentity(Category.CATEGORY, Category.CATEGORY.CATEGORY_ID);
        public static Identity<CityRecord, Integer> IDENTITY_CITY = createIdentity(City.CITY, City.CITY.CITY_ID);
        public static Identity<CountryRecord, Integer> IDENTITY_COUNTRY = createIdentity(Country.COUNTRY, Country.COUNTRY.COUNTRY_ID);
        public static Identity<CustomerRecord, Integer> IDENTITY_CUSTOMER = createIdentity(Customer.CUSTOMER, Customer.CUSTOMER.CUSTOMER_ID);
        public static Identity<FilmRecord, Integer> IDENTITY_FILM = createIdentity(Film.FILM, Film.FILM.FILM_ID);
        public static Identity<InventoryRecord, Integer> IDENTITY_INVENTORY = createIdentity(Inventory.INVENTORY, Inventory.INVENTORY.INVENTORY_ID);
        public static Identity<LanguageRecord, Integer> IDENTITY_LANGUAGE = createIdentity(Language.LANGUAGE, Language.LANGUAGE.LANGUAGE_ID);
        public static Identity<PaymentRecord, Integer> IDENTITY_PAYMENT = createIdentity(Payment.PAYMENT, Payment.PAYMENT.PAYMENT_ID);
        public static Identity<RentalRecord, Integer> IDENTITY_RENTAL = createIdentity(Rental.RENTAL, Rental.RENTAL.RENTAL_ID);
        public static Identity<RewardsReportRecord, Integer> IDENTITY_REWARDS_REPORT = createIdentity(RewardsReport.REWARDS_REPORT, RewardsReport.REWARDS_REPORT.CUSTOMER_ID);
        public static Identity<StaffRecord, Integer> IDENTITY_STAFF = createIdentity(Staff.STAFF, Staff.STAFF.STAFF_ID);
        public static Identity<StoreRecord, Integer> IDENTITY_STORE = createIdentity(Store.STORE, Store.STORE.STORE_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ActorRecord> ACTOR_PKEY = createUniqueKey(Actor.ACTOR, "actor_pkey", Actor.ACTOR.ACTOR_ID);
        public static final UniqueKey<AddressRecord> ADDRESS_PKEY = createUniqueKey(Address.ADDRESS, "address_pkey", Address.ADDRESS.ADDRESS_ID);
        public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = createUniqueKey(Category.CATEGORY, "category_pkey", Category.CATEGORY.CATEGORY_ID);
        public static final UniqueKey<CityRecord> CITY_PKEY = createUniqueKey(City.CITY, "city_pkey", City.CITY.CITY_ID);
        public static final UniqueKey<CountryRecord> COUNTRY_PKEY = createUniqueKey(Country.COUNTRY, "country_pkey", Country.COUNTRY.COUNTRY_ID);
        public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = createUniqueKey(Customer.CUSTOMER, "customer_pkey", Customer.CUSTOMER.CUSTOMER_ID);
        public static final UniqueKey<FilmRecord> FILM_PKEY = createUniqueKey(Film.FILM, "film_pkey", Film.FILM.FILM_ID);
        public static final UniqueKey<FilmActorRecord> FILM_ACTOR_PKEY = createUniqueKey(FilmActor.FILM_ACTOR, "film_actor_pkey", FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID);
        public static final UniqueKey<FilmCategoryRecord> FILM_CATEGORY_PKEY = createUniqueKey(FilmCategory.FILM_CATEGORY, "film_category_pkey", FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID);
        public static final UniqueKey<InventoryRecord> INVENTORY_PKEY = createUniqueKey(Inventory.INVENTORY, "inventory_pkey", Inventory.INVENTORY.INVENTORY_ID);
        public static final UniqueKey<LanguageRecord> LANGUAGE_PKEY = createUniqueKey(Language.LANGUAGE, "language_pkey", Language.LANGUAGE.LANGUAGE_ID);
        public static final UniqueKey<PaymentRecord> PAYMENT_PKEY = createUniqueKey(Payment.PAYMENT, "payment_pkey", Payment.PAYMENT.PAYMENT_ID);
        public static final UniqueKey<RentalRecord> RENTAL_PKEY = createUniqueKey(Rental.RENTAL, "rental_pkey", Rental.RENTAL.RENTAL_ID);
        public static final UniqueKey<StaffRecord> STAFF_PKEY = createUniqueKey(Staff.STAFF, "staff_pkey", Staff.STAFF.STAFF_ID);
        public static final UniqueKey<StoreRecord> STORE_PKEY = createUniqueKey(Store.STORE, "store_pkey", Store.STORE.STORE_ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AddressRecord, CityRecord> ADDRESS__FK_ADDRESS_CITY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.CITY_PKEY, Address.ADDRESS, "address__fk_address_city", Address.ADDRESS.CITY_ID);
        public static final ForeignKey<CityRecord, CountryRecord> CITY__FK_CITY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.COUNTRY_PKEY, City.CITY, "city__fk_city", City.CITY.COUNTRY_ID);
        public static final ForeignKey<CustomerRecord, AddressRecord> CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.ADDRESS_PKEY, Customer.CUSTOMER, "customer__customer_address_id_fkey", Customer.CUSTOMER.ADDRESS_ID);
        public static final ForeignKey<FilmRecord, LanguageRecord> FILM__FILM_LANGUAGE_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.LANGUAGE_PKEY, Film.FILM, "film__film_language_id_fkey", Film.FILM.LANGUAGE_ID);
        public static final ForeignKey<FilmActorRecord, ActorRecord> FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.ACTOR_PKEY, FilmActor.FILM_ACTOR, "film_actor__film_actor_actor_id_fkey", FilmActor.FILM_ACTOR.ACTOR_ID);
        public static final ForeignKey<FilmActorRecord, FilmRecord> FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.FILM_PKEY, FilmActor.FILM_ACTOR, "film_actor__film_actor_film_id_fkey", FilmActor.FILM_ACTOR.FILM_ID);
        public static final ForeignKey<FilmCategoryRecord, FilmRecord> FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.FILM_PKEY, FilmCategory.FILM_CATEGORY, "film_category__film_category_film_id_fkey", FilmCategory.FILM_CATEGORY.FILM_ID);
        public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.CATEGORY_PKEY, FilmCategory.FILM_CATEGORY, "film_category__film_category_category_id_fkey", FilmCategory.FILM_CATEGORY.CATEGORY_ID);
        public static final ForeignKey<InventoryRecord, FilmRecord> INVENTORY__INVENTORY_FILM_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.FILM_PKEY, Inventory.INVENTORY, "inventory__inventory_film_id_fkey", Inventory.INVENTORY.FILM_ID);
        public static final ForeignKey<PaymentRecord, CustomerRecord> PAYMENT__PAYMENT_CUSTOMER_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.CUSTOMER_PKEY, Payment.PAYMENT, "payment__payment_customer_id_fkey", Payment.PAYMENT.CUSTOMER_ID);
        public static final ForeignKey<PaymentRecord, StaffRecord> PAYMENT__PAYMENT_STAFF_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.STAFF_PKEY, Payment.PAYMENT, "payment__payment_staff_id_fkey", Payment.PAYMENT.STAFF_ID);
        public static final ForeignKey<PaymentRecord, RentalRecord> PAYMENT__PAYMENT_RENTAL_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.RENTAL_PKEY, Payment.PAYMENT, "payment__payment_rental_id_fkey", Payment.PAYMENT.RENTAL_ID);
        public static final ForeignKey<RentalRecord, InventoryRecord> RENTAL__RENTAL_INVENTORY_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.INVENTORY_PKEY, Rental.RENTAL, "rental__rental_inventory_id_fkey", Rental.RENTAL.INVENTORY_ID);
        public static final ForeignKey<RentalRecord, CustomerRecord> RENTAL__RENTAL_CUSTOMER_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.CUSTOMER_PKEY, Rental.RENTAL, "rental__rental_customer_id_fkey", Rental.RENTAL.CUSTOMER_ID);
        public static final ForeignKey<RentalRecord, StaffRecord> RENTAL__RENTAL_STAFF_ID_KEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.STAFF_PKEY, Rental.RENTAL, "rental__rental_staff_id_key", Rental.RENTAL.STAFF_ID);
        public static final ForeignKey<StaffRecord, AddressRecord> STAFF__STAFF_ADDRESS_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.ADDRESS_PKEY, Staff.STAFF, "staff__staff_address_id_fkey", Staff.STAFF.ADDRESS_ID);
        public static final ForeignKey<StoreRecord, StaffRecord> STORE__STORE_MANAGER_STAFF_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.STAFF_PKEY, Store.STORE, "store__store_manager_staff_id_fkey", Store.STORE.MANAGER_STAFF_ID);
        public static final ForeignKey<StoreRecord, AddressRecord> STORE__STORE_ADDRESS_ID_FKEY = createForeignKey(com.bisaga.sakila.dbmodel.Keys.ADDRESS_PKEY, Store.STORE, "store__store_address_id_fkey", Store.STORE.ADDRESS_ID);
    }
}

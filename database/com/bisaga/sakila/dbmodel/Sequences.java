/*
 * This file is generated by jOOQ.
*/
package com.bisaga.sakila.dbmodel;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.actor_actor_id_seq</code>
     */
    public static final Sequence<Long> ACTOR_ACTOR_ID_SEQ = new SequenceImpl<Long>("actor_actor_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.address_address_id_seq</code>
     */
    public static final Sequence<Long> ADDRESS_ADDRESS_ID_SEQ = new SequenceImpl<Long>("address_address_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.category_category_id_seq</code>
     */
    public static final Sequence<Long> CATEGORY_CATEGORY_ID_SEQ = new SequenceImpl<Long>("category_category_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.city_city_id_seq</code>
     */
    public static final Sequence<Long> CITY_CITY_ID_SEQ = new SequenceImpl<Long>("city_city_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.country_country_id_seq</code>
     */
    public static final Sequence<Long> COUNTRY_COUNTRY_ID_SEQ = new SequenceImpl<Long>("country_country_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.customer_customer_id_seq</code>
     */
    public static final Sequence<Long> CUSTOMER_CUSTOMER_ID_SEQ = new SequenceImpl<Long>("customer_customer_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.film_film_id_seq</code>
     */
    public static final Sequence<Long> FILM_FILM_ID_SEQ = new SequenceImpl<Long>("film_film_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.inventory_inventory_id_seq</code>
     */
    public static final Sequence<Long> INVENTORY_INVENTORY_ID_SEQ = new SequenceImpl<Long>("inventory_inventory_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.language_language_id_seq</code>
     */
    public static final Sequence<Long> LANGUAGE_LANGUAGE_ID_SEQ = new SequenceImpl<Long>("language_language_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.payment_payment_id_seq</code>
     */
    public static final Sequence<Long> PAYMENT_PAYMENT_ID_SEQ = new SequenceImpl<Long>("payment_payment_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.rental_rental_id_seq</code>
     */
    public static final Sequence<Long> RENTAL_RENTAL_ID_SEQ = new SequenceImpl<Long>("rental_rental_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.staff_staff_id_seq</code>
     */
    public static final Sequence<Long> STAFF_STAFF_ID_SEQ = new SequenceImpl<Long>("staff_staff_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.store_store_id_seq</code>
     */
    public static final Sequence<Long> STORE_STORE_ID_SEQ = new SequenceImpl<Long>("store_store_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
/*
 * This file is generated by jOOQ.
*/
package com.bisaga.sakila.dbmodel.tables.records;


import com.bisaga.sakila.dbmodel.enums.MpaaRating;
import com.bisaga.sakila.dbmodel.tables.Film;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> implements Record13<Integer, String, String, Integer, Short, Short, BigDecimal, Short, BigDecimal, MpaaRating, Timestamp, String[], Object> {

    private static final long serialVersionUID = -1385704027;

    /**
     * Setter for <code>public.film.film_id</code>.
     */
    public void setFilmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film.film_id</code>.
     */
    public Integer getFilmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.film.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.film.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.film.release_year</code>.
     */
    public void setReleaseYear(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.film.release_year</code>.
     */
    public Integer getReleaseYear() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.film.language_id</code>.
     */
    public void setLanguageId(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.film.language_id</code>.
     */
    public Short getLanguageId() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.film.rental_duration</code>.
     */
    public void setRentalDuration(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.film.rental_duration</code>.
     */
    public Short getRentalDuration() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>public.film.rental_rate</code>.
     */
    public void setRentalRate(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.film.rental_rate</code>.
     */
    public BigDecimal getRentalRate() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>public.film.length</code>.
     */
    public void setLength(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.film.length</code>.
     */
    public Short getLength() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>public.film.replacement_cost</code>.
     */
    public void setReplacementCost(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.film.replacement_cost</code>.
     */
    public BigDecimal getReplacementCost() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.film.rating</code>.
     */
    public void setRating(MpaaRating value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.film.rating</code>.
     */
    public MpaaRating getRating() {
        return (MpaaRating) get(9);
    }

    /**
     * Setter for <code>public.film.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.film.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>public.film.special_features</code>.
     */
    public void setSpecialFeatures(String... value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.film.special_features</code>.
     */
    public String[] getSpecialFeatures() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>public.film.fulltext</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setFulltext(Object value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.film.fulltext</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getFulltext() {
        return (Object) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, Short, Short, BigDecimal, Short, BigDecimal, MpaaRating, Timestamp, String[], Object> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, Short, Short, BigDecimal, Short, BigDecimal, MpaaRating, Timestamp, String[], Object> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Film.FILM.FILM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Film.FILM.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Film.FILM.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Film.FILM.RELEASE_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Film.FILM.LANGUAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Film.FILM.RENTAL_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Film.FILM.RENTAL_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return Film.FILM.LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return Film.FILM.REPLACEMENT_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MpaaRating> field10() {
        return Film.FILM.RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Film.FILM.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field12() {
        return Film.FILM.SPECIAL_FEATURES;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field13() {
        return Film.FILM.FULLTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFilmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getReleaseYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getRentalDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getRentalRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getReplacementCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpaaRating component10() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component12() {
        return getSpecialFeatures();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component13() {
        return getFulltext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFilmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getReleaseYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getRentalDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getRentalRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getReplacementCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpaaRating value10() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value12() {
        return getSpecialFeatures();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value13() {
        return getFulltext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value1(Integer value) {
        setFilmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value4(Integer value) {
        setReleaseYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value5(Short value) {
        setLanguageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value6(Short value) {
        setRentalDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value7(BigDecimal value) {
        setRentalRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value8(Short value) {
        setLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value9(BigDecimal value) {
        setReplacementCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value10(MpaaRating value) {
        setRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value11(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord value12(String... value) {
        setSpecialFeatures(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public FilmRecord value13(Object value) {
        setFulltext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmRecord values(Integer value1, String value2, String value3, Integer value4, Short value5, Short value6, BigDecimal value7, Short value8, BigDecimal value9, MpaaRating value10, Timestamp value11, String[] value12, Object value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmRecord
     */
    public FilmRecord() {
        super(Film.FILM);
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(Integer filmId, String title, String description, Integer releaseYear, Short languageId, Short rentalDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost, MpaaRating rating, Timestamp lastUpdate, String[] specialFeatures, Object fulltext) {
        super(Film.FILM);

        set(0, filmId);
        set(1, title);
        set(2, description);
        set(3, releaseYear);
        set(4, languageId);
        set(5, rentalDuration);
        set(6, rentalRate);
        set(7, length);
        set(8, replacementCost);
        set(9, rating);
        set(10, lastUpdate);
        set(11, specialFeatures);
        set(12, fulltext);
    }
}
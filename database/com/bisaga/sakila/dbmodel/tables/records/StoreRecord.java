/*
 * This file is generated by jOOQ.
*/
package com.bisaga.sakila.dbmodel.tables.records;


import com.bisaga.sakila.dbmodel.tables.Store;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class StoreRecord extends UpdatableRecordImpl<StoreRecord> implements Record4<Integer, Short, Short, Timestamp> {

    private static final long serialVersionUID = -1594722397;

    /**
     * Setter for <code>public.store.store_id</code>.
     */
    public void setStoreId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.store.store_id</code>.
     */
    public Integer getStoreId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.store.manager_staff_id</code>.
     */
    public void setManagerStaffId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.store.manager_staff_id</code>.
     */
    public Short getManagerStaffId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.store.address_id</code>.
     */
    public void setAddressId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.store.address_id</code>.
     */
    public Short getAddressId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.store.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.store.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Short, Short, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Short, Short, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Store.STORE.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Store.STORE.MANAGER_STAFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Store.STORE.ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Store.STORE.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getManagerStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getManagerStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value1(Integer value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value2(Short value) {
        setManagerStaffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value3(Short value) {
        setAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value4(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord values(Integer value1, Short value2, Short value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreRecord
     */
    public StoreRecord() {
        super(Store.STORE);
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    public StoreRecord(Integer storeId, Short managerStaffId, Short addressId, Timestamp lastUpdate) {
        super(Store.STORE);

        set(0, storeId);
        set(1, managerStaffId);
        set(2, addressId);
        set(3, lastUpdate);
    }
}

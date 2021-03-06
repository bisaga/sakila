/*
 * This file is generated by jOOQ.
*/
package com.bisaga.sakila.dbmodel.tables.records;


import com.bisaga.sakila.dbmodel.tables.Payment;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> implements Record6<Integer, Short, Short, Integer, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1174988282;

    /**
     * Setter for <code>public.payment.payment_id</code>.
     */
    public void setPaymentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.payment.payment_id</code>.
     */
    public Integer getPaymentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.payment.customer_id</code>.
     */
    public void setCustomerId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.payment.customer_id</code>.
     */
    public Short getCustomerId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.payment.staff_id</code>.
     */
    public void setStaffId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.payment.staff_id</code>.
     */
    public Short getStaffId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.payment.rental_id</code>.
     */
    public void setRentalId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.payment.rental_id</code>.
     */
    public Integer getRentalId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.payment.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.payment.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.payment.payment_date</code>.
     */
    public void setPaymentDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.payment.payment_date</code>.
     */
    public Timestamp getPaymentDate() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, Integer, BigDecimal, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, Integer, BigDecimal, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Payment.PAYMENT.PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Payment.PAYMENT.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Payment.PAYMENT.STAFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Payment.PAYMENT.RENTAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Payment.PAYMENT.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Payment.PAYMENT.PAYMENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value1(Integer value) {
        setPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value2(Short value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value3(Short value) {
        setStaffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value4(Integer value) {
        setRentalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value6(Timestamp value) {
        setPaymentDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord values(Integer value1, Short value2, Short value3, Integer value4, BigDecimal value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Integer paymentId, Short customerId, Short staffId, Integer rentalId, BigDecimal amount, Timestamp paymentDate) {
        super(Payment.PAYMENT);

        set(0, paymentId);
        set(1, customerId);
        set(2, staffId);
        set(3, rentalId);
        set(4, amount);
        set(5, paymentDate);
    }
}

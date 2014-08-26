// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Purchase.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class BillingInstrumentInfoProto extends Message {

  public static final String DEFAULT_BILLINGINSTRUMENTID = "";

  @ProtoField(tag = 5, type = STRING)
  public final String billingInstrumentId;

  @ProtoField(tag = 6)
  public final ExternalCreditCard creditCard;

  @ProtoField(tag = 9)
  public final ExternalCarrierBillingInstrumentProto carrierInstrument;

  @ProtoField(tag = 10)
  public final ExternalPaypalInstrumentProto paypalInstrument;

  public BillingInstrumentInfoProto(String billingInstrumentId, ExternalCreditCard creditCard, ExternalCarrierBillingInstrumentProto carrierInstrument, ExternalPaypalInstrumentProto paypalInstrument) {
    this.billingInstrumentId = billingInstrumentId;
    this.creditCard = creditCard;
    this.carrierInstrument = carrierInstrument;
    this.paypalInstrument = paypalInstrument;
  }

  private BillingInstrumentInfoProto(Builder builder) {
    this(builder.billingInstrumentId, builder.creditCard, builder.carrierInstrument, builder.paypalInstrument);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BillingInstrumentInfoProto)) return false;
    BillingInstrumentInfoProto o = (BillingInstrumentInfoProto) other;
    return equals(billingInstrumentId, o.billingInstrumentId)
        && equals(creditCard, o.creditCard)
        && equals(carrierInstrument, o.carrierInstrument)
        && equals(paypalInstrument, o.paypalInstrument);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = billingInstrumentId != null ? billingInstrumentId.hashCode() : 0;
      result = result * 37 + (creditCard != null ? creditCard.hashCode() : 0);
      result = result * 37 + (carrierInstrument != null ? carrierInstrument.hashCode() : 0);
      result = result * 37 + (paypalInstrument != null ? paypalInstrument.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<BillingInstrumentInfoProto> {

    public String billingInstrumentId;
    public ExternalCreditCard creditCard;
    public ExternalCarrierBillingInstrumentProto carrierInstrument;
    public ExternalPaypalInstrumentProto paypalInstrument;

    public Builder() {
    }

    public Builder(BillingInstrumentInfoProto message) {
      super(message);
      if (message == null) return;
      this.billingInstrumentId = message.billingInstrumentId;
      this.creditCard = message.creditCard;
      this.carrierInstrument = message.carrierInstrument;
      this.paypalInstrument = message.paypalInstrument;
    }

    public Builder billingInstrumentId(String billingInstrumentId) {
      this.billingInstrumentId = billingInstrumentId;
      return this;
    }

    public Builder creditCard(ExternalCreditCard creditCard) {
      this.creditCard = creditCard;
      return this;
    }

    public Builder carrierInstrument(ExternalCarrierBillingInstrumentProto carrierInstrument) {
      this.carrierInstrument = carrierInstrument;
      return this;
    }

    public Builder paypalInstrument(ExternalPaypalInstrumentProto paypalInstrument) {
      this.paypalInstrument = paypalInstrument;
      return this;
    }

    @Override
    public BillingInstrumentInfoProto build() {
      return new BillingInstrumentInfoProto(this);
    }
  }
}
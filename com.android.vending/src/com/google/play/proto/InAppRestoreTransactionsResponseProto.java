// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/InApp.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InAppRestoreTransactionsResponseProto extends Message {

  @ProtoField(tag = 1)
  public final SignedDataProto signedResponse;

  @ProtoField(tag = 2)
  public final PurchaseResultProto purchaseResult;

  public InAppRestoreTransactionsResponseProto(SignedDataProto signedResponse, PurchaseResultProto purchaseResult) {
    this.signedResponse = signedResponse;
    this.purchaseResult = purchaseResult;
  }

  private InAppRestoreTransactionsResponseProto(Builder builder) {
    this(builder.signedResponse, builder.purchaseResult);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InAppRestoreTransactionsResponseProto)) return false;
    InAppRestoreTransactionsResponseProto o = (InAppRestoreTransactionsResponseProto) other;
    return equals(signedResponse, o.signedResponse)
        && equals(purchaseResult, o.purchaseResult);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = signedResponse != null ? signedResponse.hashCode() : 0;
      result = result * 37 + (purchaseResult != null ? purchaseResult.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<InAppRestoreTransactionsResponseProto> {

    public SignedDataProto signedResponse;
    public PurchaseResultProto purchaseResult;

    public Builder() {
    }

    public Builder(InAppRestoreTransactionsResponseProto message) {
      super(message);
      if (message == null) return;
      this.signedResponse = message.signedResponse;
      this.purchaseResult = message.purchaseResult;
    }

    public Builder signedResponse(SignedDataProto signedResponse) {
      this.signedResponse = signedResponse;
      return this;
    }

    public Builder purchaseResult(PurchaseResultProto purchaseResult) {
      this.purchaseResult = purchaseResult;
      return this;
    }

    @Override
    public InAppRestoreTransactionsResponseProto build() {
      return new InAppRestoreTransactionsResponseProto(this);
    }
  }
}
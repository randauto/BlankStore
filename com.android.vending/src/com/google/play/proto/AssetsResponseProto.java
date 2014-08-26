/*
 * Copyright (c) 2014 μg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Asset.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.*;
import static com.squareup.wire.Message.Label.REPEATED;

public final class AssetsResponseProto extends Message {

  public static final List<ExternalAssetProto> DEFAULT_ASSET = Collections.emptyList();
  public static final Long DEFAULT_NUMTOTALENTRIES = 0L;
  public static final String DEFAULT_CORRECTEDQUERY = "";
  public static final List<ExternalAssetProto> DEFAULT_ALTASSET = Collections.emptyList();
  public static final Long DEFAULT_NUMCORRECTEDENTRIES = 0L;
  public static final String DEFAULT_HEADER = "";
  public static final Integer DEFAULT_LISTTYPE = 0;

  @ProtoField(tag = 1, label = REPEATED)
  public final List<ExternalAssetProto> asset;

  @ProtoField(tag = 2, type = INT64)
  public final Long numTotalEntries;

  @ProtoField(tag = 3, type = STRING)
  public final String correctedQuery;

  @ProtoField(tag = 4, label = REPEATED)
  public final List<ExternalAssetProto> altAsset;

  @ProtoField(tag = 5, type = INT64)
  public final Long numCorrectedEntries;

  @ProtoField(tag = 6, type = STRING)
  public final String header;

  @ProtoField(tag = 7, type = INT32)
  public final Integer listType;

  public AssetsResponseProto(List<ExternalAssetProto> asset, Long numTotalEntries, String correctedQuery, List<ExternalAssetProto> altAsset, Long numCorrectedEntries, String header, Integer listType) {
    this.asset = immutableCopyOf(asset);
    this.numTotalEntries = numTotalEntries;
    this.correctedQuery = correctedQuery;
    this.altAsset = immutableCopyOf(altAsset);
    this.numCorrectedEntries = numCorrectedEntries;
    this.header = header;
    this.listType = listType;
  }

  private AssetsResponseProto(Builder builder) {
    this(builder.asset, builder.numTotalEntries, builder.correctedQuery, builder.altAsset, builder.numCorrectedEntries, builder.header, builder.listType);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AssetsResponseProto)) return false;
    AssetsResponseProto o = (AssetsResponseProto) other;
    return equals(asset, o.asset)
        && equals(numTotalEntries, o.numTotalEntries)
        && equals(correctedQuery, o.correctedQuery)
        && equals(altAsset, o.altAsset)
        && equals(numCorrectedEntries, o.numCorrectedEntries)
        && equals(header, o.header)
        && equals(listType, o.listType);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = asset != null ? asset.hashCode() : 1;
      result = result * 37 + (numTotalEntries != null ? numTotalEntries.hashCode() : 0);
      result = result * 37 + (correctedQuery != null ? correctedQuery.hashCode() : 0);
      result = result * 37 + (altAsset != null ? altAsset.hashCode() : 1);
      result = result * 37 + (numCorrectedEntries != null ? numCorrectedEntries.hashCode() : 0);
      result = result * 37 + (header != null ? header.hashCode() : 0);
      result = result * 37 + (listType != null ? listType.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AssetsResponseProto> {

    public List<ExternalAssetProto> asset;
    public Long numTotalEntries;
    public String correctedQuery;
    public List<ExternalAssetProto> altAsset;
    public Long numCorrectedEntries;
    public String header;
    public Integer listType;

    public Builder() {
    }

    public Builder(AssetsResponseProto message) {
      super(message);
      if (message == null) return;
      this.asset = copyOf(message.asset);
      this.numTotalEntries = message.numTotalEntries;
      this.correctedQuery = message.correctedQuery;
      this.altAsset = copyOf(message.altAsset);
      this.numCorrectedEntries = message.numCorrectedEntries;
      this.header = message.header;
      this.listType = message.listType;
    }

    public Builder asset(List<ExternalAssetProto> asset) {
      this.asset = checkForNulls(asset);
      return this;
    }

    public Builder numTotalEntries(Long numTotalEntries) {
      this.numTotalEntries = numTotalEntries;
      return this;
    }

    public Builder correctedQuery(String correctedQuery) {
      this.correctedQuery = correctedQuery;
      return this;
    }

    public Builder altAsset(List<ExternalAssetProto> altAsset) {
      this.altAsset = checkForNulls(altAsset);
      return this;
    }

    public Builder numCorrectedEntries(Long numCorrectedEntries) {
      this.numCorrectedEntries = numCorrectedEntries;
      return this;
    }

    public Builder header(String header) {
      this.header = header;
      return this;
    }

    public Builder listType(Integer listType) {
      this.listType = listType;
      return this;
    }

    @Override
    public AssetsResponseProto build() {
      return new AssetsResponseProto(this);
    }
  }
}
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package elephantdb.generated;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DomainSpec implements org.apache.thrift.TBase<DomainSpec, DomainSpec._Fields>, java.io.Serializable, Cloneable, Comparable<DomainSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DomainSpec");

  private static final org.apache.thrift.protocol.TField NUM_SHARDS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_shards", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COORDINATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("coordinator", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SHARD_SCHEME_FIELD_DESC = new org.apache.thrift.protocol.TField("shard_scheme", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DomainSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DomainSpecTupleSchemeFactory());
  }

  private int num_shards; // required
  private String coordinator; // required
  private String shard_scheme; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_SHARDS((short)1, "num_shards"),
    COORDINATOR((short)2, "coordinator"),
    SHARD_SCHEME((short)3, "shard_scheme");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NUM_SHARDS
          return NUM_SHARDS;
        case 2: // COORDINATOR
          return COORDINATOR;
        case 3: // SHARD_SCHEME
          return SHARD_SCHEME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUM_SHARDS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_SHARDS, new org.apache.thrift.meta_data.FieldMetaData("num_shards", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COORDINATOR, new org.apache.thrift.meta_data.FieldMetaData("coordinator", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHARD_SCHEME, new org.apache.thrift.meta_data.FieldMetaData("shard_scheme", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainSpec.class, metaDataMap);
  }

  public DomainSpec() {
  }

  public DomainSpec(
    int num_shards,
    String coordinator,
    String shard_scheme)
  {
    this();
    this.num_shards = num_shards;
    set_num_shards_isSet(true);
    this.coordinator = coordinator;
    this.shard_scheme = shard_scheme;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainSpec(DomainSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num_shards = other.num_shards;
    if (other.is_set_coordinator()) {
      this.coordinator = other.coordinator;
    }
    if (other.is_set_shard_scheme()) {
      this.shard_scheme = other.shard_scheme;
    }
  }

  public DomainSpec deepCopy() {
    return new DomainSpec(this);
  }

  @Override
  public void clear() {
    set_num_shards_isSet(false);
    this.num_shards = 0;
    this.coordinator = null;
    this.shard_scheme = null;
  }

  public int get_num_shards() {
    return this.num_shards;
  }

  public void set_num_shards(int num_shards) {
    this.num_shards = num_shards;
    set_num_shards_isSet(true);
  }

  public void unset_num_shards() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_SHARDS_ISSET_ID);
  }

  /** Returns true if field num_shards is set (has been assigned a value) and false otherwise */
  public boolean is_set_num_shards() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_SHARDS_ISSET_ID);
  }

  public void set_num_shards_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_SHARDS_ISSET_ID, value);
  }

  public String get_coordinator() {
    return this.coordinator;
  }

  public void set_coordinator(String coordinator) {
    this.coordinator = coordinator;
  }

  public void unset_coordinator() {
    this.coordinator = null;
  }

  /** Returns true if field coordinator is set (has been assigned a value) and false otherwise */
  public boolean is_set_coordinator() {
    return this.coordinator != null;
  }

  public void set_coordinator_isSet(boolean value) {
    if (!value) {
      this.coordinator = null;
    }
  }

  public String get_shard_scheme() {
    return this.shard_scheme;
  }

  public void set_shard_scheme(String shard_scheme) {
    this.shard_scheme = shard_scheme;
  }

  public void unset_shard_scheme() {
    this.shard_scheme = null;
  }

  /** Returns true if field shard_scheme is set (has been assigned a value) and false otherwise */
  public boolean is_set_shard_scheme() {
    return this.shard_scheme != null;
  }

  public void set_shard_scheme_isSet(boolean value) {
    if (!value) {
      this.shard_scheme = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM_SHARDS:
      if (value == null) {
        unset_num_shards();
      } else {
        set_num_shards((Integer)value);
      }
      break;

    case COORDINATOR:
      if (value == null) {
        unset_coordinator();
      } else {
        set_coordinator((String)value);
      }
      break;

    case SHARD_SCHEME:
      if (value == null) {
        unset_shard_scheme();
      } else {
        set_shard_scheme((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_SHARDS:
      return Integer.valueOf(get_num_shards());

    case COORDINATOR:
      return get_coordinator();

    case SHARD_SCHEME:
      return get_shard_scheme();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM_SHARDS:
      return is_set_num_shards();
    case COORDINATOR:
      return is_set_coordinator();
    case SHARD_SCHEME:
      return is_set_shard_scheme();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainSpec)
      return this.equals((DomainSpec)that);
    return false;
  }

  public boolean equals(DomainSpec that) {
    if (that == null)
      return false;

    boolean this_present_num_shards = true;
    boolean that_present_num_shards = true;
    if (this_present_num_shards || that_present_num_shards) {
      if (!(this_present_num_shards && that_present_num_shards))
        return false;
      if (this.num_shards != that.num_shards)
        return false;
    }

    boolean this_present_coordinator = true && this.is_set_coordinator();
    boolean that_present_coordinator = true && that.is_set_coordinator();
    if (this_present_coordinator || that_present_coordinator) {
      if (!(this_present_coordinator && that_present_coordinator))
        return false;
      if (!this.coordinator.equals(that.coordinator))
        return false;
    }

    boolean this_present_shard_scheme = true && this.is_set_shard_scheme();
    boolean that_present_shard_scheme = true && that.is_set_shard_scheme();
    if (this_present_shard_scheme || that_present_shard_scheme) {
      if (!(this_present_shard_scheme && that_present_shard_scheme))
        return false;
      if (!this.shard_scheme.equals(that.shard_scheme))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_num_shards = true;
    builder.append(present_num_shards);
    if (present_num_shards)
      builder.append(num_shards);

    boolean present_coordinator = true && (is_set_coordinator());
    builder.append(present_coordinator);
    if (present_coordinator)
      builder.append(coordinator);

    boolean present_shard_scheme = true && (is_set_shard_scheme());
    builder.append(present_shard_scheme);
    if (present_shard_scheme)
      builder.append(shard_scheme);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(DomainSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_num_shards()).compareTo(other.is_set_num_shards());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_num_shards()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_shards, other.num_shards);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_coordinator()).compareTo(other.is_set_coordinator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_coordinator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coordinator, other.coordinator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_shard_scheme()).compareTo(other.is_set_shard_scheme());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_shard_scheme()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shard_scheme, other.shard_scheme);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DomainSpec(");
    boolean first = true;

    sb.append("num_shards:");
    sb.append(this.num_shards);
    first = false;
    if (!first) sb.append(", ");
    sb.append("coordinator:");
    if (this.coordinator == null) {
      sb.append("null");
    } else {
      sb.append(this.coordinator);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shard_scheme:");
    if (this.shard_scheme == null) {
      sb.append("null");
    } else {
      sb.append(this.shard_scheme);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_num_shards()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_shards' is unset! Struct:" + toString());
    }

    if (!is_set_coordinator()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'coordinator' is unset! Struct:" + toString());
    }

    if (!is_set_shard_scheme()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'shard_scheme' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DomainSpecStandardSchemeFactory implements SchemeFactory {
    public DomainSpecStandardScheme getScheme() {
      return new DomainSpecStandardScheme();
    }
  }

  private static class DomainSpecStandardScheme extends StandardScheme<DomainSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DomainSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_SHARDS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_shards = iprot.readI32();
              struct.set_num_shards_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COORDINATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.coordinator = iprot.readString();
              struct.set_coordinator_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHARD_SCHEME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.shard_scheme = iprot.readString();
              struct.set_shard_scheme_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DomainSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_SHARDS_FIELD_DESC);
      oprot.writeI32(struct.num_shards);
      oprot.writeFieldEnd();
      if (struct.coordinator != null) {
        oprot.writeFieldBegin(COORDINATOR_FIELD_DESC);
        oprot.writeString(struct.coordinator);
        oprot.writeFieldEnd();
      }
      if (struct.shard_scheme != null) {
        oprot.writeFieldBegin(SHARD_SCHEME_FIELD_DESC);
        oprot.writeString(struct.shard_scheme);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainSpecTupleSchemeFactory implements SchemeFactory {
    public DomainSpecTupleScheme getScheme() {
      return new DomainSpecTupleScheme();
    }
  }

  private static class DomainSpecTupleScheme extends TupleScheme<DomainSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DomainSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.num_shards);
      oprot.writeString(struct.coordinator);
      oprot.writeString(struct.shard_scheme);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DomainSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.num_shards = iprot.readI32();
      struct.set_num_shards_isSet(true);
      struct.coordinator = iprot.readString();
      struct.set_coordinator_isSet(true);
      struct.shard_scheme = iprot.readString();
      struct.set_shard_scheme_isSet(true);
    }
  }

}


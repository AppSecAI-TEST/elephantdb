/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
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
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class InvalidConfigurationException extends Exception implements TBase<InvalidConfigurationException, InvalidConfigurationException._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("InvalidConfigurationException");

  private static final TField MISMATCHED_DOMAINS_FIELD_DESC = new TField("mismatched_domains", TType.LIST, (short)1);
  private static final TField PORT_CHANGED_FIELD_DESC = new TField("port_changed", TType.BOOL, (short)2);
  private static final TField HOSTS_CHANGED_FIELD_DESC = new TField("hosts_changed", TType.BOOL, (short)3);

  private List<String> mismatched_domains;
  private boolean port_changed;
  private boolean hosts_changed;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    MISMATCHED_DOMAINS((short)1, "mismatched_domains"),
    PORT_CHANGED((short)2, "port_changed"),
    HOSTS_CHANGED((short)3, "hosts_changed");

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
        case 1: // MISMATCHED_DOMAINS
          return MISMATCHED_DOMAINS;
        case 2: // PORT_CHANGED
          return PORT_CHANGED;
        case 3: // HOSTS_CHANGED
          return HOSTS_CHANGED;
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
  private static final int __PORT_CHANGED_ISSET_ID = 0;
  private static final int __HOSTS_CHANGED_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MISMATCHED_DOMAINS, new FieldMetaData("mismatched_domains", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.PORT_CHANGED, new FieldMetaData("port_changed", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.HOSTS_CHANGED, new FieldMetaData("hosts_changed", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(InvalidConfigurationException.class, metaDataMap);
  }

  public InvalidConfigurationException() {
  }

  public InvalidConfigurationException(
    List<String> mismatched_domains,
    boolean port_changed,
    boolean hosts_changed)
  {
    this();
    this.mismatched_domains = mismatched_domains;
    this.port_changed = port_changed;
    set_port_changed_isSet(true);
    this.hosts_changed = hosts_changed;
    set_hosts_changed_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InvalidConfigurationException(InvalidConfigurationException other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_mismatched_domains()) {
      List<String> __this__mismatched_domains = new ArrayList<String>();
      for (String other_element : other.mismatched_domains) {
        __this__mismatched_domains.add(other_element);
      }
      this.mismatched_domains = __this__mismatched_domains;
    }
    this.port_changed = other.port_changed;
    this.hosts_changed = other.hosts_changed;
  }

  public InvalidConfigurationException deepCopy() {
    return new InvalidConfigurationException(this);
  }

  @Deprecated
  public InvalidConfigurationException clone() {
    return new InvalidConfigurationException(this);
  }

  public int get_mismatched_domains_size() {
    return (this.mismatched_domains == null) ? 0 : this.mismatched_domains.size();
  }

  public java.util.Iterator<String> get_mismatched_domains_iterator() {
    return (this.mismatched_domains == null) ? null : this.mismatched_domains.iterator();
  }

  public void add_to_mismatched_domains(String elem) {
    if (this.mismatched_domains == null) {
      this.mismatched_domains = new ArrayList<String>();
    }
    this.mismatched_domains.add(elem);
  }

  public List<String> get_mismatched_domains() {
    return this.mismatched_domains;
  }

  public void set_mismatched_domains(List<String> mismatched_domains) {
    this.mismatched_domains = mismatched_domains;
  }

  public void unset_mismatched_domains() {
    this.mismatched_domains = null;
  }

  /** Returns true if field mismatched_domains is set (has been asigned a value) and false otherwise */
  public boolean is_set_mismatched_domains() {
    return this.mismatched_domains != null;
  }

  public void set_mismatched_domains_isSet(boolean value) {
    if (!value) {
      this.mismatched_domains = null;
    }
  }

  public boolean is_port_changed() {
    return this.port_changed;
  }

  public void set_port_changed(boolean port_changed) {
    this.port_changed = port_changed;
    set_port_changed_isSet(true);
  }

  public void unset_port_changed() {
    __isset_bit_vector.clear(__PORT_CHANGED_ISSET_ID);
  }

  /** Returns true if field port_changed is set (has been asigned a value) and false otherwise */
  public boolean is_set_port_changed() {
    return __isset_bit_vector.get(__PORT_CHANGED_ISSET_ID);
  }

  public void set_port_changed_isSet(boolean value) {
    __isset_bit_vector.set(__PORT_CHANGED_ISSET_ID, value);
  }

  public boolean is_hosts_changed() {
    return this.hosts_changed;
  }

  public void set_hosts_changed(boolean hosts_changed) {
    this.hosts_changed = hosts_changed;
    set_hosts_changed_isSet(true);
  }

  public void unset_hosts_changed() {
    __isset_bit_vector.clear(__HOSTS_CHANGED_ISSET_ID);
  }

  /** Returns true if field hosts_changed is set (has been asigned a value) and false otherwise */
  public boolean is_set_hosts_changed() {
    return __isset_bit_vector.get(__HOSTS_CHANGED_ISSET_ID);
  }

  public void set_hosts_changed_isSet(boolean value) {
    __isset_bit_vector.set(__HOSTS_CHANGED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MISMATCHED_DOMAINS:
      if (value == null) {
        unset_mismatched_domains();
      } else {
        set_mismatched_domains((List<String>)value);
      }
      break;

    case PORT_CHANGED:
      if (value == null) {
        unset_port_changed();
      } else {
        set_port_changed((Boolean)value);
      }
      break;

    case HOSTS_CHANGED:
      if (value == null) {
        unset_hosts_changed();
      } else {
        set_hosts_changed((Boolean)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MISMATCHED_DOMAINS:
      return get_mismatched_domains();

    case PORT_CHANGED:
      return new Boolean(is_port_changed());

    case HOSTS_CHANGED:
      return new Boolean(is_hosts_changed());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case MISMATCHED_DOMAINS:
      return is_set_mismatched_domains();
    case PORT_CHANGED:
      return is_set_port_changed();
    case HOSTS_CHANGED:
      return is_set_hosts_changed();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InvalidConfigurationException)
      return this.equals((InvalidConfigurationException)that);
    return false;
  }

  public boolean equals(InvalidConfigurationException that) {
    if (that == null)
      return false;

    boolean this_present_mismatched_domains = true && this.is_set_mismatched_domains();
    boolean that_present_mismatched_domains = true && that.is_set_mismatched_domains();
    if (this_present_mismatched_domains || that_present_mismatched_domains) {
      if (!(this_present_mismatched_domains && that_present_mismatched_domains))
        return false;
      if (!this.mismatched_domains.equals(that.mismatched_domains))
        return false;
    }

    boolean this_present_port_changed = true;
    boolean that_present_port_changed = true;
    if (this_present_port_changed || that_present_port_changed) {
      if (!(this_present_port_changed && that_present_port_changed))
        return false;
      if (this.port_changed != that.port_changed)
        return false;
    }

    boolean this_present_hosts_changed = true;
    boolean that_present_hosts_changed = true;
    if (this_present_hosts_changed || that_present_hosts_changed) {
      if (!(this_present_hosts_changed && that_present_hosts_changed))
        return false;
      if (this.hosts_changed != that.hosts_changed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_mismatched_domains = true && (is_set_mismatched_domains());
    builder.append(present_mismatched_domains);
    if (present_mismatched_domains)
      builder.append(mismatched_domains);

    boolean present_port_changed = true;
    builder.append(present_port_changed);
    if (present_port_changed)
      builder.append(port_changed);

    boolean present_hosts_changed = true;
    builder.append(present_hosts_changed);
    if (present_hosts_changed)
      builder.append(hosts_changed);

    return builder.toHashCode();
  }

  public int compareTo(InvalidConfigurationException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    InvalidConfigurationException typedOther = (InvalidConfigurationException)other;

    lastComparison = Boolean.valueOf(is_set_mismatched_domains()).compareTo(typedOther.is_set_mismatched_domains());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_mismatched_domains()) {      lastComparison = TBaseHelper.compareTo(this.mismatched_domains, typedOther.mismatched_domains);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_port_changed()).compareTo(typedOther.is_set_port_changed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port_changed()) {      lastComparison = TBaseHelper.compareTo(this.port_changed, typedOther.port_changed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_hosts_changed()).compareTo(typedOther.is_set_hosts_changed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_hosts_changed()) {      lastComparison = TBaseHelper.compareTo(this.hosts_changed, typedOther.hosts_changed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // MISMATCHED_DOMAINS
          if (field.type == TType.LIST) {
            {
              TList _list9 = iprot.readListBegin();
              this.mismatched_domains = new ArrayList<String>(_list9.size);
              for (int _i10 = 0; _i10 < _list9.size; ++_i10)
              {
                String _elem11;
                _elem11 = iprot.readString();
                this.mismatched_domains.add(_elem11);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PORT_CHANGED
          if (field.type == TType.BOOL) {
            this.port_changed = iprot.readBool();
            set_port_changed_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // HOSTS_CHANGED
          if (field.type == TType.BOOL) {
            this.hosts_changed = iprot.readBool();
            set_hosts_changed_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.mismatched_domains != null) {
      oprot.writeFieldBegin(MISMATCHED_DOMAINS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.mismatched_domains.size()));
        for (String _iter12 : this.mismatched_domains)
        {
          oprot.writeString(_iter12);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PORT_CHANGED_FIELD_DESC);
    oprot.writeBool(this.port_changed);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(HOSTS_CHANGED_FIELD_DESC);
    oprot.writeBool(this.hosts_changed);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InvalidConfigurationException(");
    boolean first = true;

    sb.append("mismatched_domains:");
    if (this.mismatched_domains == null) {
      sb.append("null");
    } else {
      sb.append(this.mismatched_domains);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port_changed:");
    sb.append(this.port_changed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hosts_changed:");
    sb.append(this.hosts_changed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_mismatched_domains()) {
      throw new TProtocolException("Required field 'mismatched_domains' is unset! Struct:" + toString());
    }

    if (!is_set_port_changed()) {
      throw new TProtocolException("Required field 'port_changed' is unset! Struct:" + toString());
    }

    if (!is_set_hosts_changed()) {
      throw new TProtocolException("Required field 'hosts_changed' is unset! Struct:" + toString());
    }

  }

}


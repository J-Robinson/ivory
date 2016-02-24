/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.core.thrift;

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

public class ThriftDictionaryWindow implements org.apache.thrift.TBase<ThriftDictionaryWindow, ThriftDictionaryWindow._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftDictionaryWindow> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDictionaryWindow");

  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("unit", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftDictionaryWindowStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftDictionaryWindowTupleSchemeFactory());
  }

  public int length; // required
  /**
   * 
   * @see ThriftDictionaryWindowUnit
   */
  public ThriftDictionaryWindowUnit unit; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LENGTH((short)1, "length"),
    /**
     * 
     * @see ThriftDictionaryWindowUnit
     */
    UNIT((short)2, "unit");

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
        case 1: // LENGTH
          return LENGTH;
        case 2: // UNIT
          return UNIT;
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
  private static final int __LENGTH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UNIT, new org.apache.thrift.meta_data.FieldMetaData("unit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftDictionaryWindowUnit.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDictionaryWindow.class, metaDataMap);
  }

  public ThriftDictionaryWindow() {
  }

  public ThriftDictionaryWindow(
    int length,
    ThriftDictionaryWindowUnit unit)
  {
    this();
    this.length = length;
    setLengthIsSet(true);
    this.unit = unit;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftDictionaryWindow(ThriftDictionaryWindow other) {
    __isset_bitfield = other.__isset_bitfield;
    this.length = other.length;
    if (other.isSetUnit()) {
      this.unit = other.unit;
    }
  }

  public ThriftDictionaryWindow deepCopy() {
    return new ThriftDictionaryWindow(this);
  }

  @Override
  public void clear() {
    setLengthIsSet(false);
    this.length = 0;
    this.unit = null;
  }

  public int getLength() {
    return this.length;
  }

  public ThriftDictionaryWindow setLength(int length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return EncodingUtils.testBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LENGTH_ISSET_ID, value);
  }

  /**
   * 
   * @see ThriftDictionaryWindowUnit
   */
  public ThriftDictionaryWindowUnit getUnit() {
    return this.unit;
  }

  /**
   * 
   * @see ThriftDictionaryWindowUnit
   */
  public ThriftDictionaryWindow setUnit(ThriftDictionaryWindowUnit unit) {
    this.unit = unit;
    return this;
  }

  public void unsetUnit() {
    this.unit = null;
  }

  /** Returns true if field unit is set (has been assigned a value) and false otherwise */
  public boolean isSetUnit() {
    return this.unit != null;
  }

  public void setUnitIsSet(boolean value) {
    if (!value) {
      this.unit = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Integer)value);
      }
      break;

    case UNIT:
      if (value == null) {
        unsetUnit();
      } else {
        setUnit((ThriftDictionaryWindowUnit)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LENGTH:
      return Integer.valueOf(getLength());

    case UNIT:
      return getUnit();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LENGTH:
      return isSetLength();
    case UNIT:
      return isSetUnit();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftDictionaryWindow)
      return this.equals((ThriftDictionaryWindow)that);
    return false;
  }

  public boolean equals(ThriftDictionaryWindow that) {
    if (that == null)
      return false;

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    boolean this_present_unit = true && this.isSetUnit();
    boolean that_present_unit = true && that.isSetUnit();
    if (this_present_unit || that_present_unit) {
      if (!(this_present_unit && that_present_unit))
        return false;
      if (!this.unit.equals(that.unit))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ThriftDictionaryWindow other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLength()).compareTo(other.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, other.length);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnit()).compareTo(other.isSetUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unit, other.unit);
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
    StringBuilder sb = new StringBuilder("ThriftDictionaryWindow(");
    boolean first = true;

    sb.append("length:");
    sb.append(this.length);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unit:");
    if (this.unit == null) {
      sb.append("null");
    } else {
      sb.append(this.unit);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class ThriftDictionaryWindowStandardSchemeFactory implements SchemeFactory {
    public ThriftDictionaryWindowStandardScheme getScheme() {
      return new ThriftDictionaryWindowStandardScheme();
    }
  }

  private static class ThriftDictionaryWindowStandardScheme extends StandardScheme<ThriftDictionaryWindow> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftDictionaryWindow struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LENGTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.length = iprot.readI32();
              struct.setLengthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.unit = ThriftDictionaryWindowUnit.findByValue(iprot.readI32());
              struct.setUnitIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftDictionaryWindow struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LENGTH_FIELD_DESC);
      oprot.writeI32(struct.length);
      oprot.writeFieldEnd();
      if (struct.unit != null) {
        oprot.writeFieldBegin(UNIT_FIELD_DESC);
        oprot.writeI32(struct.unit.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftDictionaryWindowTupleSchemeFactory implements SchemeFactory {
    public ThriftDictionaryWindowTupleScheme getScheme() {
      return new ThriftDictionaryWindowTupleScheme();
    }
  }

  private static class ThriftDictionaryWindowTupleScheme extends TupleScheme<ThriftDictionaryWindow> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryWindow struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLength()) {
        optionals.set(0);
      }
      if (struct.isSetUnit()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLength()) {
        oprot.writeI32(struct.length);
      }
      if (struct.isSetUnit()) {
        oprot.writeI32(struct.unit.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryWindow struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.length = iprot.readI32();
        struct.setLengthIsSet(true);
      }
      if (incoming.get(1)) {
        struct.unit = ThriftDictionaryWindowUnit.findByValue(iprot.readI32());
        struct.setUnitIsSet(true);
      }
    }
  }

}

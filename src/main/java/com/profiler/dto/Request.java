/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.profiler.dto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("request", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestTupleSchemeFactory());
  }

  private com.profiler.dto.Header header; // required
  private com.profiler.dto.RequestThriftDTO request; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    REQUEST((short)2, "request");

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
        case 1: // HEADER
          return HEADER;
        case 2: // REQUEST
          return REQUEST;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.profiler.dto.Header.class)));
    tmpMap.put(_Fields.REQUEST, new org.apache.thrift.meta_data.FieldMetaData("request", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.profiler.dto.RequestThriftDTO.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }

  public Request() {
  }

  public Request(
    com.profiler.dto.Header header,
    com.profiler.dto.RequestThriftDTO request)
  {
    this();
    this.header = header;
    this.request = request;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    if (other.isSetHeader()) {
      this.header = new com.profiler.dto.Header(other.header);
    }
    if (other.isSetRequest()) {
      this.request = new com.profiler.dto.RequestThriftDTO(other.request);
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @Override
  public void clear() {
    this.header = null;
    this.request = null;
  }

  public com.profiler.dto.Header getHeader() {
    return this.header;
  }

  public void setHeader(com.profiler.dto.Header header) {
    this.header = header;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  public com.profiler.dto.RequestThriftDTO getRequest() {
    return this.request;
  }

  public void setRequest(com.profiler.dto.RequestThriftDTO request) {
    this.request = request;
  }

  public void unsetRequest() {
    this.request = null;
  }

  /** Returns true if field request is set (has been assigned a value) and false otherwise */
  public boolean isSetRequest() {
    return this.request != null;
  }

  public void setRequestIsSet(boolean value) {
    if (!value) {
      this.request = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((com.profiler.dto.Header)value);
      }
      break;

    case REQUEST:
      if (value == null) {
        unsetRequest();
      } else {
        setRequest((com.profiler.dto.RequestThriftDTO)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();

    case REQUEST:
      return getRequest();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEADER:
      return isSetHeader();
    case REQUEST:
      return isSetRequest();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_request = true && this.isSetRequest();
    boolean that_present_request = true && that.isSetRequest();
    if (this_present_request || that_present_request) {
      if (!(this_present_request && that_present_request))
        return false;
      if (!this.request.equals(that.request))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Request typedOther = (Request)other;

    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(typedOther.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, typedOther.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequest()).compareTo(typedOther.isSetRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.request, typedOther.request);
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
    StringBuilder sb = new StringBuilder("Request(");
    boolean first = true;

    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("request:");
    if (this.request == null) {
      sb.append("null");
    } else {
      sb.append(this.request);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RequestStandardSchemeFactory implements SchemeFactory {
    public RequestStandardScheme getScheme() {
      return new RequestStandardScheme();
    }
  }

  private static class RequestStandardScheme extends StandardScheme<Request> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new com.profiler.dto.Header();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.request = new com.profiler.dto.RequestThriftDTO();
              struct.request.read(iprot);
              struct.setRequestIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Request struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.request != null) {
        oprot.writeFieldBegin(REQUEST_FIELD_DESC);
        struct.request.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestTupleSchemeFactory implements SchemeFactory {
    public RequestTupleScheme getScheme() {
      return new RequestTupleScheme();
    }
  }

  private static class RequestTupleScheme extends TupleScheme<Request> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHeader()) {
        optionals.set(0);
      }
      if (struct.isSetRequest()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHeader()) {
        struct.header.write(oprot);
      }
      if (struct.isSetRequest()) {
        struct.request.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.header = new com.profiler.dto.Header();
        struct.header.read(iprot);
        struct.setHeaderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.request = new com.profiler.dto.RequestThriftDTO();
        struct.request.read(iprot);
        struct.setRequestIsSet(true);
      }
    }
  }

}


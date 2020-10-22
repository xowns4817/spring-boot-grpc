// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prototest.proto

package com.example.demo.grpc;

/**
 * Protobuf type {@code com.example.demo.grpc.TextResponse}
 */
public  final class TextResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.demo.grpc.TextResponse)
    TextResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextResponse.newBuilder() to construct.
  private TextResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextResponse() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TextResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            TextMessage.Builder subBuilder = null;
            if (resTextMsg_ != null) {
              subBuilder = resTextMsg_.toBuilder();
            }
            resTextMsg_ = input.readMessage(TextMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resTextMsg_);
              resTextMsg_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Prototest.internal_static_com_example_demo_grpc_TextResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Prototest.internal_static_com_example_demo_grpc_TextResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TextResponse.class, Builder.class);
  }

  public static final int RESTEXTMSG_FIELD_NUMBER = 1;
  private TextMessage resTextMsg_;
  /**
   * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
   */
  public boolean hasResTextMsg() {
    return resTextMsg_ != null;
  }
  /**
   * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
   */
  public TextMessage getResTextMsg() {
    return resTextMsg_ == null ? TextMessage.getDefaultInstance() : resTextMsg_;
  }
  /**
   * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
   */
  public TextMessageOrBuilder getResTextMsgOrBuilder() {
    return getResTextMsg();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (resTextMsg_ != null) {
      output.writeMessage(1, getResTextMsg());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resTextMsg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResTextMsg());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof TextResponse)) {
      return super.equals(obj);
    }
    TextResponse other = (TextResponse) obj;

    boolean result = true;
    result = result && (hasResTextMsg() == other.hasResTextMsg());
    if (hasResTextMsg()) {
      result = result && getResTextMsg()
          .equals(other.getResTextMsg());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResTextMsg()) {
      hash = (37 * hash) + RESTEXTMSG_FIELD_NUMBER;
      hash = (53 * hash) + getResTextMsg().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TextResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TextResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TextResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TextResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TextResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TextResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TextResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TextResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TextResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TextResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TextResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TextResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TextResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.demo.grpc.TextResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.demo.grpc.TextResponse)
      com.example.demo.grpc.TextResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Prototest.internal_static_com_example_demo_grpc_TextResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Prototest.internal_static_com_example_demo_grpc_TextResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TextResponse.class, Builder.class);
    }

    // Construct using com.example.demo.grpc.TextResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (resTextMsgBuilder_ == null) {
        resTextMsg_ = null;
      } else {
        resTextMsg_ = null;
        resTextMsgBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Prototest.internal_static_com_example_demo_grpc_TextResponse_descriptor;
    }

    public TextResponse getDefaultInstanceForType() {
      return TextResponse.getDefaultInstance();
    }

    public TextResponse build() {
      TextResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public TextResponse buildPartial() {
      TextResponse result = new TextResponse(this);
      if (resTextMsgBuilder_ == null) {
        result.resTextMsg_ = resTextMsg_;
      } else {
        result.resTextMsg_ = resTextMsgBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TextResponse) {
        return mergeFrom((TextResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TextResponse other) {
      if (other == TextResponse.getDefaultInstance()) return this;
      if (other.hasResTextMsg()) {
        mergeResTextMsg(other.getResTextMsg());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      TextResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TextResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private TextMessage resTextMsg_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        TextMessage, TextMessage.Builder, TextMessageOrBuilder> resTextMsgBuilder_;
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public boolean hasResTextMsg() {
      return resTextMsgBuilder_ != null || resTextMsg_ != null;
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public TextMessage getResTextMsg() {
      if (resTextMsgBuilder_ == null) {
        return resTextMsg_ == null ? TextMessage.getDefaultInstance() : resTextMsg_;
      } else {
        return resTextMsgBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public Builder setResTextMsg(TextMessage value) {
      if (resTextMsgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resTextMsg_ = value;
        onChanged();
      } else {
        resTextMsgBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public Builder setResTextMsg(
        TextMessage.Builder builderForValue) {
      if (resTextMsgBuilder_ == null) {
        resTextMsg_ = builderForValue.build();
        onChanged();
      } else {
        resTextMsgBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public Builder mergeResTextMsg(TextMessage value) {
      if (resTextMsgBuilder_ == null) {
        if (resTextMsg_ != null) {
          resTextMsg_ =
            TextMessage.newBuilder(resTextMsg_).mergeFrom(value).buildPartial();
        } else {
          resTextMsg_ = value;
        }
        onChanged();
      } else {
        resTextMsgBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public Builder clearResTextMsg() {
      if (resTextMsgBuilder_ == null) {
        resTextMsg_ = null;
        onChanged();
      } else {
        resTextMsg_ = null;
        resTextMsgBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public TextMessage.Builder getResTextMsgBuilder() {
      
      onChanged();
      return getResTextMsgFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    public TextMessageOrBuilder getResTextMsgOrBuilder() {
      if (resTextMsgBuilder_ != null) {
        return resTextMsgBuilder_.getMessageOrBuilder();
      } else {
        return resTextMsg_ == null ?
            TextMessage.getDefaultInstance() : resTextMsg_;
      }
    }
    /**
     * <code>.com.example.demo.grpc.TextMessage resTextMsg = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        TextMessage, TextMessage.Builder, TextMessageOrBuilder>
        getResTextMsgFieldBuilder() {
      if (resTextMsgBuilder_ == null) {
        resTextMsgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            TextMessage, TextMessage.Builder, TextMessageOrBuilder>(
                getResTextMsg(),
                getParentForChildren(),
                isClean());
        resTextMsg_ = null;
      }
      return resTextMsgBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.demo.grpc.TextResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.demo.grpc.TextResponse)
  private static final TextResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TextResponse();
  }

  public static TextResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextResponse>
      PARSER = new com.google.protobuf.AbstractParser<TextResponse>() {
    public TextResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TextResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TextResponse> getParserForType() {
    return PARSER;
  }

  public TextResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


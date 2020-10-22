// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: board.proto

package com.example.demo.grpc.board;

/**
 * Protobuf type {@code com.example.demo.grpc.board.BoardResponse}
 */
public  final class BoardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.demo.grpc.board.BoardResponse)
    BoardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoardResponse.newBuilder() to construct.
  private BoardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoardResponse() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BoardResponse(
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
            BoardDto.Builder subBuilder = null;
            if (res_ != null) {
              subBuilder = res_.toBuilder();
            }
            res_ = input.readMessage(BoardDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(res_);
              res_ = subBuilder.buildPartial();
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
    return Board.internal_static_com_example_demo_grpc_board_BoardResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Board.internal_static_com_example_demo_grpc_board_BoardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BoardResponse.class, Builder.class);
  }

  public static final int RES_FIELD_NUMBER = 1;
  private BoardDto res_;
  /**
   * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
   */
  public boolean hasRes() {
    return res_ != null;
  }
  /**
   * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
   */
  public BoardDto getRes() {
    return res_ == null ? BoardDto.getDefaultInstance() : res_;
  }
  /**
   * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
   */
  public BoardDtoOrBuilder getResOrBuilder() {
    return getRes();
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
    if (res_ != null) {
      output.writeMessage(1, getRes());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (res_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRes());
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
    if (!(obj instanceof BoardResponse)) {
      return super.equals(obj);
    }
    BoardResponse other = (BoardResponse) obj;

    boolean result = true;
    result = result && (hasRes() == other.hasRes());
    if (hasRes()) {
      result = result && getRes()
          .equals(other.getRes());
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
    if (hasRes()) {
      hash = (37 * hash) + RES_FIELD_NUMBER;
      hash = (53 * hash) + getRes().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BoardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BoardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BoardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BoardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BoardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BoardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BoardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BoardResponse parseFrom(
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
  public static Builder newBuilder(BoardResponse prototype) {
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
   * Protobuf type {@code com.example.demo.grpc.board.BoardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.demo.grpc.board.BoardResponse)
      com.example.demo.grpc.board.BoardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Board.internal_static_com_example_demo_grpc_board_BoardResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Board.internal_static_com_example_demo_grpc_board_BoardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BoardResponse.class, Builder.class);
    }

    // Construct using com.example.demo.grpc.board.BoardResponse.newBuilder()
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
      if (resBuilder_ == null) {
        res_ = null;
      } else {
        res_ = null;
        resBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Board.internal_static_com_example_demo_grpc_board_BoardResponse_descriptor;
    }

    public BoardResponse getDefaultInstanceForType() {
      return BoardResponse.getDefaultInstance();
    }

    public BoardResponse build() {
      BoardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public BoardResponse buildPartial() {
      BoardResponse result = new BoardResponse(this);
      if (resBuilder_ == null) {
        result.res_ = res_;
      } else {
        result.res_ = resBuilder_.build();
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
      if (other instanceof BoardResponse) {
        return mergeFrom((BoardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BoardResponse other) {
      if (other == BoardResponse.getDefaultInstance()) return this;
      if (other.hasRes()) {
        mergeRes(other.getRes());
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
      BoardResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BoardResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private BoardDto res_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        BoardDto, BoardDto.Builder, BoardDtoOrBuilder> resBuilder_;
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public boolean hasRes() {
      return resBuilder_ != null || res_ != null;
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public BoardDto getRes() {
      if (resBuilder_ == null) {
        return res_ == null ? BoardDto.getDefaultInstance() : res_;
      } else {
        return resBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public Builder setRes(BoardDto value) {
      if (resBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        res_ = value;
        onChanged();
      } else {
        resBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public Builder setRes(
        BoardDto.Builder builderForValue) {
      if (resBuilder_ == null) {
        res_ = builderForValue.build();
        onChanged();
      } else {
        resBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public Builder mergeRes(BoardDto value) {
      if (resBuilder_ == null) {
        if (res_ != null) {
          res_ =
            BoardDto.newBuilder(res_).mergeFrom(value).buildPartial();
        } else {
          res_ = value;
        }
        onChanged();
      } else {
        resBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public Builder clearRes() {
      if (resBuilder_ == null) {
        res_ = null;
        onChanged();
      } else {
        res_ = null;
        resBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public BoardDto.Builder getResBuilder() {
      
      onChanged();
      return getResFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    public BoardDtoOrBuilder getResOrBuilder() {
      if (resBuilder_ != null) {
        return resBuilder_.getMessageOrBuilder();
      } else {
        return res_ == null ?
            BoardDto.getDefaultInstance() : res_;
      }
    }
    /**
     * <code>.com.example.demo.grpc.board.BoardDto res = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BoardDto, BoardDto.Builder, BoardDtoOrBuilder>
        getResFieldBuilder() {
      if (resBuilder_ == null) {
        resBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BoardDto, BoardDto.Builder, BoardDtoOrBuilder>(
                getRes(),
                getParentForChildren(),
                isClean());
        res_ = null;
      }
      return resBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.demo.grpc.board.BoardResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.demo.grpc.board.BoardResponse)
  private static final BoardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BoardResponse();
  }

  public static BoardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoardResponse>
      PARSER = new com.google.protobuf.AbstractParser<BoardResponse>() {
    public BoardResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BoardResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BoardResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<BoardResponse> getParserForType() {
    return PARSER;
  }

  public BoardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

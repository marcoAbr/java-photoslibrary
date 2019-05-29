// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * Request to add an enrichment to a specific album at a specific position.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.AddEnrichmentToAlbumRequest}
 */
public final class AddEnrichmentToAlbumRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.AddEnrichmentToAlbumRequest)
    AddEnrichmentToAlbumRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AddEnrichmentToAlbumRequest.newBuilder() to construct.
  private AddEnrichmentToAlbumRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddEnrichmentToAlbumRequest() {
    albumId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AddEnrichmentToAlbumRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              albumId_ = s;
              break;
            }
          case 18:
            {
              com.google.photos.library.v1.proto.NewEnrichmentItem.Builder subBuilder = null;
              if (newEnrichmentItem_ != null) {
                subBuilder = newEnrichmentItem_.toBuilder();
              }
              newEnrichmentItem_ =
                  input.readMessage(
                      com.google.photos.library.v1.proto.NewEnrichmentItem.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(newEnrichmentItem_);
                newEnrichmentItem_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.photos.library.v1.proto.AlbumPosition.Builder subBuilder = null;
              if (albumPosition_ != null) {
                subBuilder = albumPosition_.toBuilder();
              }
              albumPosition_ =
                  input.readMessage(
                      com.google.photos.library.v1.proto.AlbumPosition.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(albumPosition_);
                albumPosition_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_AddEnrichmentToAlbumRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_AddEnrichmentToAlbumRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest.class,
            com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest.Builder.class);
  }

  public static final int ALBUM_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object albumId_;
  /**
   *
   *
   * <pre>
   * Identifier of the album where the enrichment is to be added.
   * </pre>
   *
   * <code>string album_id = 1;</code>
   */
  public java.lang.String getAlbumId() {
    java.lang.Object ref = albumId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      albumId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifier of the album where the enrichment is to be added.
   * </pre>
   *
   * <code>string album_id = 1;</code>
   */
  public com.google.protobuf.ByteString getAlbumIdBytes() {
    java.lang.Object ref = albumId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      albumId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_ENRICHMENT_ITEM_FIELD_NUMBER = 2;
  private com.google.photos.library.v1.proto.NewEnrichmentItem newEnrichmentItem_;
  /**
   *
   *
   * <pre>
   * The enrichment to be added.
   * </pre>
   *
   * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
   */
  public boolean hasNewEnrichmentItem() {
    return newEnrichmentItem_ != null;
  }
  /**
   *
   *
   * <pre>
   * The enrichment to be added.
   * </pre>
   *
   * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
   */
  public com.google.photos.library.v1.proto.NewEnrichmentItem getNewEnrichmentItem() {
    return newEnrichmentItem_ == null
        ? com.google.photos.library.v1.proto.NewEnrichmentItem.getDefaultInstance()
        : newEnrichmentItem_;
  }
  /**
   *
   *
   * <pre>
   * The enrichment to be added.
   * </pre>
   *
   * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
   */
  public com.google.photos.library.v1.proto.NewEnrichmentItemOrBuilder
      getNewEnrichmentItemOrBuilder() {
    return getNewEnrichmentItem();
  }

  public static final int ALBUM_POSITION_FIELD_NUMBER = 3;
  private com.google.photos.library.v1.proto.AlbumPosition albumPosition_;
  /**
   *
   *
   * <pre>
   * The position in the album where the enrichment is to be inserted.
   * </pre>
   *
   * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
   */
  public boolean hasAlbumPosition() {
    return albumPosition_ != null;
  }
  /**
   *
   *
   * <pre>
   * The position in the album where the enrichment is to be inserted.
   * </pre>
   *
   * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
   */
  public com.google.photos.library.v1.proto.AlbumPosition getAlbumPosition() {
    return albumPosition_ == null
        ? com.google.photos.library.v1.proto.AlbumPosition.getDefaultInstance()
        : albumPosition_;
  }
  /**
   *
   *
   * <pre>
   * The position in the album where the enrichment is to be inserted.
   * </pre>
   *
   * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
   */
  public com.google.photos.library.v1.proto.AlbumPositionOrBuilder getAlbumPositionOrBuilder() {
    return getAlbumPosition();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getAlbumIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, albumId_);
    }
    if (newEnrichmentItem_ != null) {
      output.writeMessage(2, getNewEnrichmentItem());
    }
    if (albumPosition_ != null) {
      output.writeMessage(3, getAlbumPosition());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAlbumIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, albumId_);
    }
    if (newEnrichmentItem_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNewEnrichmentItem());
    }
    if (albumPosition_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAlbumPosition());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest other =
        (com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest) obj;

    if (!getAlbumId().equals(other.getAlbumId())) return false;
    if (hasNewEnrichmentItem() != other.hasNewEnrichmentItem()) return false;
    if (hasNewEnrichmentItem()) {
      if (!getNewEnrichmentItem().equals(other.getNewEnrichmentItem())) return false;
    }
    if (hasAlbumPosition() != other.hasAlbumPosition()) return false;
    if (hasAlbumPosition()) {
      if (!getAlbumPosition().equals(other.getAlbumPosition())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALBUM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAlbumId().hashCode();
    if (hasNewEnrichmentItem()) {
      hash = (37 * hash) + NEW_ENRICHMENT_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getNewEnrichmentItem().hashCode();
    }
    if (hasAlbumPosition()) {
      hash = (37 * hash) + ALBUM_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getAlbumPosition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to add an enrichment to a specific album at a specific position.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.AddEnrichmentToAlbumRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.AddEnrichmentToAlbumRequest)
      com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_AddEnrichmentToAlbumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_AddEnrichmentToAlbumRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest.class,
              com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      albumId_ = "";

      if (newEnrichmentItemBuilder_ == null) {
        newEnrichmentItem_ = null;
      } else {
        newEnrichmentItem_ = null;
        newEnrichmentItemBuilder_ = null;
      }
      if (albumPositionBuilder_ == null) {
        albumPosition_ = null;
      } else {
        albumPosition_ = null;
        albumPositionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_AddEnrichmentToAlbumRequest_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest
        getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest build() {
      com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest buildPartial() {
      com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest result =
          new com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest(this);
      result.albumId_ = albumId_;
      if (newEnrichmentItemBuilder_ == null) {
        result.newEnrichmentItem_ = newEnrichmentItem_;
      } else {
        result.newEnrichmentItem_ = newEnrichmentItemBuilder_.build();
      }
      if (albumPositionBuilder_ == null) {
        result.albumPosition_ = albumPosition_;
      } else {
        result.albumPosition_ = albumPositionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest) {
        return mergeFrom((com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest other) {
      if (other
          == com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest.getDefaultInstance())
        return this;
      if (!other.getAlbumId().isEmpty()) {
        albumId_ = other.albumId_;
        onChanged();
      }
      if (other.hasNewEnrichmentItem()) {
        mergeNewEnrichmentItem(other.getNewEnrichmentItem());
      }
      if (other.hasAlbumPosition()) {
        mergeAlbumPosition(other.getAlbumPosition());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object albumId_ = "";
    /**
     *
     *
     * <pre>
     * Identifier of the album where the enrichment is to be added.
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public java.lang.String getAlbumId() {
      java.lang.Object ref = albumId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        albumId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album where the enrichment is to be added.
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public com.google.protobuf.ByteString getAlbumIdBytes() {
      java.lang.Object ref = albumId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        albumId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album where the enrichment is to be added.
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public Builder setAlbumId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      albumId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album where the enrichment is to be added.
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public Builder clearAlbumId() {

      albumId_ = getDefaultInstance().getAlbumId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album where the enrichment is to be added.
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public Builder setAlbumIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      albumId_ = value;
      onChanged();
      return this;
    }

    private com.google.photos.library.v1.proto.NewEnrichmentItem newEnrichmentItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.library.v1.proto.NewEnrichmentItem,
            com.google.photos.library.v1.proto.NewEnrichmentItem.Builder,
            com.google.photos.library.v1.proto.NewEnrichmentItemOrBuilder>
        newEnrichmentItemBuilder_;
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public boolean hasNewEnrichmentItem() {
      return newEnrichmentItemBuilder_ != null || newEnrichmentItem_ != null;
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public com.google.photos.library.v1.proto.NewEnrichmentItem getNewEnrichmentItem() {
      if (newEnrichmentItemBuilder_ == null) {
        return newEnrichmentItem_ == null
            ? com.google.photos.library.v1.proto.NewEnrichmentItem.getDefaultInstance()
            : newEnrichmentItem_;
      } else {
        return newEnrichmentItemBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public Builder setNewEnrichmentItem(
        com.google.photos.library.v1.proto.NewEnrichmentItem value) {
      if (newEnrichmentItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newEnrichmentItem_ = value;
        onChanged();
      } else {
        newEnrichmentItemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public Builder setNewEnrichmentItem(
        com.google.photos.library.v1.proto.NewEnrichmentItem.Builder builderForValue) {
      if (newEnrichmentItemBuilder_ == null) {
        newEnrichmentItem_ = builderForValue.build();
        onChanged();
      } else {
        newEnrichmentItemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public Builder mergeNewEnrichmentItem(
        com.google.photos.library.v1.proto.NewEnrichmentItem value) {
      if (newEnrichmentItemBuilder_ == null) {
        if (newEnrichmentItem_ != null) {
          newEnrichmentItem_ =
              com.google.photos.library.v1.proto.NewEnrichmentItem.newBuilder(newEnrichmentItem_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          newEnrichmentItem_ = value;
        }
        onChanged();
      } else {
        newEnrichmentItemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public Builder clearNewEnrichmentItem() {
      if (newEnrichmentItemBuilder_ == null) {
        newEnrichmentItem_ = null;
        onChanged();
      } else {
        newEnrichmentItem_ = null;
        newEnrichmentItemBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public com.google.photos.library.v1.proto.NewEnrichmentItem.Builder
        getNewEnrichmentItemBuilder() {

      onChanged();
      return getNewEnrichmentItemFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    public com.google.photos.library.v1.proto.NewEnrichmentItemOrBuilder
        getNewEnrichmentItemOrBuilder() {
      if (newEnrichmentItemBuilder_ != null) {
        return newEnrichmentItemBuilder_.getMessageOrBuilder();
      } else {
        return newEnrichmentItem_ == null
            ? com.google.photos.library.v1.proto.NewEnrichmentItem.getDefaultInstance()
            : newEnrichmentItem_;
      }
    }
    /**
     *
     *
     * <pre>
     * The enrichment to be added.
     * </pre>
     *
     * <code>.google.photos.library.v1.NewEnrichmentItem new_enrichment_item = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.library.v1.proto.NewEnrichmentItem,
            com.google.photos.library.v1.proto.NewEnrichmentItem.Builder,
            com.google.photos.library.v1.proto.NewEnrichmentItemOrBuilder>
        getNewEnrichmentItemFieldBuilder() {
      if (newEnrichmentItemBuilder_ == null) {
        newEnrichmentItemBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.photos.library.v1.proto.NewEnrichmentItem,
                com.google.photos.library.v1.proto.NewEnrichmentItem.Builder,
                com.google.photos.library.v1.proto.NewEnrichmentItemOrBuilder>(
                getNewEnrichmentItem(), getParentForChildren(), isClean());
        newEnrichmentItem_ = null;
      }
      return newEnrichmentItemBuilder_;
    }

    private com.google.photos.library.v1.proto.AlbumPosition albumPosition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.library.v1.proto.AlbumPosition,
            com.google.photos.library.v1.proto.AlbumPosition.Builder,
            com.google.photos.library.v1.proto.AlbumPositionOrBuilder>
        albumPositionBuilder_;
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public boolean hasAlbumPosition() {
      return albumPositionBuilder_ != null || albumPosition_ != null;
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public com.google.photos.library.v1.proto.AlbumPosition getAlbumPosition() {
      if (albumPositionBuilder_ == null) {
        return albumPosition_ == null
            ? com.google.photos.library.v1.proto.AlbumPosition.getDefaultInstance()
            : albumPosition_;
      } else {
        return albumPositionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public Builder setAlbumPosition(com.google.photos.library.v1.proto.AlbumPosition value) {
      if (albumPositionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        albumPosition_ = value;
        onChanged();
      } else {
        albumPositionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public Builder setAlbumPosition(
        com.google.photos.library.v1.proto.AlbumPosition.Builder builderForValue) {
      if (albumPositionBuilder_ == null) {
        albumPosition_ = builderForValue.build();
        onChanged();
      } else {
        albumPositionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public Builder mergeAlbumPosition(com.google.photos.library.v1.proto.AlbumPosition value) {
      if (albumPositionBuilder_ == null) {
        if (albumPosition_ != null) {
          albumPosition_ =
              com.google.photos.library.v1.proto.AlbumPosition.newBuilder(albumPosition_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          albumPosition_ = value;
        }
        onChanged();
      } else {
        albumPositionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public Builder clearAlbumPosition() {
      if (albumPositionBuilder_ == null) {
        albumPosition_ = null;
        onChanged();
      } else {
        albumPosition_ = null;
        albumPositionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public com.google.photos.library.v1.proto.AlbumPosition.Builder getAlbumPositionBuilder() {

      onChanged();
      return getAlbumPositionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    public com.google.photos.library.v1.proto.AlbumPositionOrBuilder getAlbumPositionOrBuilder() {
      if (albumPositionBuilder_ != null) {
        return albumPositionBuilder_.getMessageOrBuilder();
      } else {
        return albumPosition_ == null
            ? com.google.photos.library.v1.proto.AlbumPosition.getDefaultInstance()
            : albumPosition_;
      }
    }
    /**
     *
     *
     * <pre>
     * The position in the album where the enrichment is to be inserted.
     * </pre>
     *
     * <code>.google.photos.library.v1.AlbumPosition album_position = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.library.v1.proto.AlbumPosition,
            com.google.photos.library.v1.proto.AlbumPosition.Builder,
            com.google.photos.library.v1.proto.AlbumPositionOrBuilder>
        getAlbumPositionFieldBuilder() {
      if (albumPositionBuilder_ == null) {
        albumPositionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.photos.library.v1.proto.AlbumPosition,
                com.google.photos.library.v1.proto.AlbumPosition.Builder,
                com.google.photos.library.v1.proto.AlbumPositionOrBuilder>(
                getAlbumPosition(), getParentForChildren(), isClean());
        albumPosition_ = null;
      }
      return albumPositionBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.AddEnrichmentToAlbumRequest)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.AddEnrichmentToAlbumRequest)
  private static final com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest();
  }

  public static com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddEnrichmentToAlbumRequest> PARSER =
      new com.google.protobuf.AbstractParser<AddEnrichmentToAlbumRequest>() {
        @java.lang.Override
        public AddEnrichmentToAlbumRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AddEnrichmentToAlbumRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AddEnrichmentToAlbumRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddEnrichmentToAlbumRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.AddEnrichmentToAlbumRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
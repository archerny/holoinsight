/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: registry-for-agent.proto

package io.holoinsight.server.registry.grpc.agent;

public interface ReportEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.registry.grpc.agent.ReportEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  boolean hasHeader();

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonRequestHeader getHeader();

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated .io.holoinsight.server.registry.grpc.agent.ReportEventRequest.Event events = 2;</code>
   */
  java.util.List<io.holoinsight.server.registry.grpc.agent.ReportEventRequest.Event> getEventsList();

  /**
   * <code>repeated .io.holoinsight.server.registry.grpc.agent.ReportEventRequest.Event events = 2;</code>
   */
  io.holoinsight.server.registry.grpc.agent.ReportEventRequest.Event getEvents(int index);

  /**
   * <code>repeated .io.holoinsight.server.registry.grpc.agent.ReportEventRequest.Event events = 2;</code>
   */
  int getEventsCount();

  /**
   * <code>repeated .io.holoinsight.server.registry.grpc.agent.ReportEventRequest.Event events = 2;</code>
   */
  java.util.List<? extends io.holoinsight.server.registry.grpc.agent.ReportEventRequest.EventOrBuilder> getEventsOrBuilderList();

  /**
   * <code>repeated .io.holoinsight.server.registry.grpc.agent.ReportEventRequest.Event events = 2;</code>
   */
  io.holoinsight.server.registry.grpc.agent.ReportEventRequest.EventOrBuilder getEventsOrBuilder(
      int index);
}

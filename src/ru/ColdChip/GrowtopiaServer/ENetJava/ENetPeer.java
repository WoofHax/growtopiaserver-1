/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.ColdChip.GrowtopiaServer.ENetJava;

public class ENetPeer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ENetPeer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ENetPeer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        enetJNI.delete_ENetPeer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long getPointer() {
    return swigCPtr;
  }

  public void setDispatchList(ENetListNode value) {
    enetJNI.ENetPeer_dispatchList_set(swigCPtr, this, ENetListNode.getCPtr(value), value);
  }

  public ENetListNode getDispatchList() {
    long cPtr = enetJNI.ENetPeer_dispatchList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetListNode(cPtr, false);
  }

  public void setHost(ENetHost value) {
    enetJNI.ENetPeer_host_set(swigCPtr, this, ENetHost.getCPtr(value), value);
  }

  public ENetHost getHost() {
    long cPtr = enetJNI.ENetPeer_host_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetHost(cPtr, false);
  }

  public void setOutgoingPeerID(int value) {
    enetJNI.ENetPeer_outgoingPeerID_set(swigCPtr, this, value);
  }

  public int getOutgoingPeerID() {
    return enetJNI.ENetPeer_outgoingPeerID_get(swigCPtr, this);
  }

  public void setIncomingPeerID(int value) {
    enetJNI.ENetPeer_incomingPeerID_set(swigCPtr, this, value);
  }

  public int getIncomingPeerID() {
    return enetJNI.ENetPeer_incomingPeerID_get(swigCPtr, this);
  }

  public void setConnectID(long value) {
    enetJNI.ENetPeer_connectID_set(swigCPtr, this, value);
  }

  public long getConnectID() {
    return enetJNI.ENetPeer_connectID_get(swigCPtr, this);
  }

  public void setOutgoingSessionID(short value) {
    enetJNI.ENetPeer_outgoingSessionID_set(swigCPtr, this, value);
  }

  public short getOutgoingSessionID() {
    return enetJNI.ENetPeer_outgoingSessionID_get(swigCPtr, this);
  }

  public void setIncomingSessionID(short value) {
    enetJNI.ENetPeer_incomingSessionID_set(swigCPtr, this, value);
  }

  public short getIncomingSessionID() {
    return enetJNI.ENetPeer_incomingSessionID_get(swigCPtr, this);
  }

  public void setAddress(ENetAddress value) {
    enetJNI.ENetPeer_address_set(swigCPtr, this, ENetAddress.getCPtr(value), value);
  }

  public ENetAddress getAddress() {
    long cPtr = enetJNI.ENetPeer_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetAddress(cPtr, false);
  }

  public void setData(SWIGTYPE_p_void value) {
    enetJNI.ENetPeer_data_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getData() {
    long cPtr = enetJNI.ENetPeer_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setState(ENetPeerState value) {
    enetJNI.ENetPeer_state_set(swigCPtr, this, value.swigValue());
  }

  public ENetPeerState getState() {
    return ENetPeerState.swigToEnum(enetJNI.ENetPeer_state_get(swigCPtr, this));
  }

  public void setChannels(ENetChannel value) {
    enetJNI.ENetPeer_channels_set(swigCPtr, this, ENetChannel.getCPtr(value), value);
  }

  public ENetChannel getChannels() {
    long cPtr = enetJNI.ENetPeer_channels_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetChannel(cPtr, false);
  }

  public void setChannelCount(long value) {
    enetJNI.ENetPeer_channelCount_set(swigCPtr, this, value);
  }

  public long getChannelCount() {
    return enetJNI.ENetPeer_channelCount_get(swigCPtr, this);
  }

  public void setIncomingBandwidth(long value) {
    enetJNI.ENetPeer_incomingBandwidth_set(swigCPtr, this, value);
  }

  public long getIncomingBandwidth() {
    return enetJNI.ENetPeer_incomingBandwidth_get(swigCPtr, this);
  }

  public void setOutgoingBandwidth(long value) {
    enetJNI.ENetPeer_outgoingBandwidth_set(swigCPtr, this, value);
  }

  public long getOutgoingBandwidth() {
    return enetJNI.ENetPeer_outgoingBandwidth_get(swigCPtr, this);
  }

  public void setIncomingBandwidthThrottleEpoch(long value) {
    enetJNI.ENetPeer_incomingBandwidthThrottleEpoch_set(swigCPtr, this, value);
  }

  public long getIncomingBandwidthThrottleEpoch() {
    return enetJNI.ENetPeer_incomingBandwidthThrottleEpoch_get(swigCPtr, this);
  }

  public void setOutgoingBandwidthThrottleEpoch(long value) {
    enetJNI.ENetPeer_outgoingBandwidthThrottleEpoch_set(swigCPtr, this, value);
  }

  public long getOutgoingBandwidthThrottleEpoch() {
    return enetJNI.ENetPeer_outgoingBandwidthThrottleEpoch_get(swigCPtr, this);
  }

  public void setIncomingDataTotal(long value) {
    enetJNI.ENetPeer_incomingDataTotal_set(swigCPtr, this, value);
  }

  public long getIncomingDataTotal() {
    return enetJNI.ENetPeer_incomingDataTotal_get(swigCPtr, this);
  }

  public void setOutgoingDataTotal(long value) {
    enetJNI.ENetPeer_outgoingDataTotal_set(swigCPtr, this, value);
  }

  public long getOutgoingDataTotal() {
    return enetJNI.ENetPeer_outgoingDataTotal_get(swigCPtr, this);
  }

  public void setLastSendTime(long value) {
    enetJNI.ENetPeer_lastSendTime_set(swigCPtr, this, value);
  }

  public long getLastSendTime() {
    return enetJNI.ENetPeer_lastSendTime_get(swigCPtr, this);
  }

  public void setLastReceiveTime(long value) {
    enetJNI.ENetPeer_lastReceiveTime_set(swigCPtr, this, value);
  }

  public long getLastReceiveTime() {
    return enetJNI.ENetPeer_lastReceiveTime_get(swigCPtr, this);
  }

  public void setNextTimeout(long value) {
    enetJNI.ENetPeer_nextTimeout_set(swigCPtr, this, value);
  }

  public long getNextTimeout() {
    return enetJNI.ENetPeer_nextTimeout_get(swigCPtr, this);
  }

  public void setEarliestTimeout(long value) {
    enetJNI.ENetPeer_earliestTimeout_set(swigCPtr, this, value);
  }

  public long getEarliestTimeout() {
    return enetJNI.ENetPeer_earliestTimeout_get(swigCPtr, this);
  }

  public void setPacketLossEpoch(long value) {
    enetJNI.ENetPeer_packetLossEpoch_set(swigCPtr, this, value);
  }

  public long getPacketLossEpoch() {
    return enetJNI.ENetPeer_packetLossEpoch_get(swigCPtr, this);
  }

  public void setPacketsSent(long value) {
    enetJNI.ENetPeer_packetsSent_set(swigCPtr, this, value);
  }

  public long getPacketsSent() {
    return enetJNI.ENetPeer_packetsSent_get(swigCPtr, this);
  }

  public void setPacketsLost(long value) {
    enetJNI.ENetPeer_packetsLost_set(swigCPtr, this, value);
  }

  public long getPacketsLost() {
    return enetJNI.ENetPeer_packetsLost_get(swigCPtr, this);
  }

  public void setPacketLoss(long value) {
    enetJNI.ENetPeer_packetLoss_set(swigCPtr, this, value);
  }

  public long getPacketLoss() {
    return enetJNI.ENetPeer_packetLoss_get(swigCPtr, this);
  }

  public void setPacketLossVariance(long value) {
    enetJNI.ENetPeer_packetLossVariance_set(swigCPtr, this, value);
  }

  public long getPacketLossVariance() {
    return enetJNI.ENetPeer_packetLossVariance_get(swigCPtr, this);
  }

  public void setPacketThrottle(long value) {
    enetJNI.ENetPeer_packetThrottle_set(swigCPtr, this, value);
  }

  public long getPacketThrottle() {
    return enetJNI.ENetPeer_packetThrottle_get(swigCPtr, this);
  }

  public void setPacketThrottleLimit(long value) {
    enetJNI.ENetPeer_packetThrottleLimit_set(swigCPtr, this, value);
  }

  public long getPacketThrottleLimit() {
    return enetJNI.ENetPeer_packetThrottleLimit_get(swigCPtr, this);
  }

  public void setPacketThrottleCounter(long value) {
    enetJNI.ENetPeer_packetThrottleCounter_set(swigCPtr, this, value);
  }

  public long getPacketThrottleCounter() {
    return enetJNI.ENetPeer_packetThrottleCounter_get(swigCPtr, this);
  }

  public void setPacketThrottleEpoch(long value) {
    enetJNI.ENetPeer_packetThrottleEpoch_set(swigCPtr, this, value);
  }

  public long getPacketThrottleEpoch() {
    return enetJNI.ENetPeer_packetThrottleEpoch_get(swigCPtr, this);
  }

  public void setPacketThrottleAcceleration(long value) {
    enetJNI.ENetPeer_packetThrottleAcceleration_set(swigCPtr, this, value);
  }

  public long getPacketThrottleAcceleration() {
    return enetJNI.ENetPeer_packetThrottleAcceleration_get(swigCPtr, this);
  }

  public void setPacketThrottleDeceleration(long value) {
    enetJNI.ENetPeer_packetThrottleDeceleration_set(swigCPtr, this, value);
  }

  public long getPacketThrottleDeceleration() {
    return enetJNI.ENetPeer_packetThrottleDeceleration_get(swigCPtr, this);
  }

  public void setPacketThrottleInterval(long value) {
    enetJNI.ENetPeer_packetThrottleInterval_set(swigCPtr, this, value);
  }

  public long getPacketThrottleInterval() {
    return enetJNI.ENetPeer_packetThrottleInterval_get(swigCPtr, this);
  }

  public void setPingInterval(long value) {
    enetJNI.ENetPeer_pingInterval_set(swigCPtr, this, value);
  }

  public long getPingInterval() {
    return enetJNI.ENetPeer_pingInterval_get(swigCPtr, this);
  }

  public void setTimeoutLimit(long value) {
    enetJNI.ENetPeer_timeoutLimit_set(swigCPtr, this, value);
  }

  public long getTimeoutLimit() {
    return enetJNI.ENetPeer_timeoutLimit_get(swigCPtr, this);
  }

  public void setTimeoutMinimum(long value) {
    enetJNI.ENetPeer_timeoutMinimum_set(swigCPtr, this, value);
  }

  public long getTimeoutMinimum() {
    return enetJNI.ENetPeer_timeoutMinimum_get(swigCPtr, this);
  }

  public void setTimeoutMaximum(long value) {
    enetJNI.ENetPeer_timeoutMaximum_set(swigCPtr, this, value);
  }

  public long getTimeoutMaximum() {
    return enetJNI.ENetPeer_timeoutMaximum_get(swigCPtr, this);
  }

  public void setLastRoundTripTime(long value) {
    enetJNI.ENetPeer_lastRoundTripTime_set(swigCPtr, this, value);
  }

  public long getLastRoundTripTime() {
    return enetJNI.ENetPeer_lastRoundTripTime_get(swigCPtr, this);
  }

  public void setLowestRoundTripTime(long value) {
    enetJNI.ENetPeer_lowestRoundTripTime_set(swigCPtr, this, value);
  }

  public long getLowestRoundTripTime() {
    return enetJNI.ENetPeer_lowestRoundTripTime_get(swigCPtr, this);
  }

  public void setLastRoundTripTimeVariance(long value) {
    enetJNI.ENetPeer_lastRoundTripTimeVariance_set(swigCPtr, this, value);
  }

  public long getLastRoundTripTimeVariance() {
    return enetJNI.ENetPeer_lastRoundTripTimeVariance_get(swigCPtr, this);
  }

  public void setHighestRoundTripTimeVariance(long value) {
    enetJNI.ENetPeer_highestRoundTripTimeVariance_set(swigCPtr, this, value);
  }

  public long getHighestRoundTripTimeVariance() {
    return enetJNI.ENetPeer_highestRoundTripTimeVariance_get(swigCPtr, this);
  }

  public void setRoundTripTime(long value) {
    enetJNI.ENetPeer_roundTripTime_set(swigCPtr, this, value);
  }

  public long getRoundTripTime() {
    return enetJNI.ENetPeer_roundTripTime_get(swigCPtr, this);
  }

  public void setRoundTripTimeVariance(long value) {
    enetJNI.ENetPeer_roundTripTimeVariance_set(swigCPtr, this, value);
  }

  public long getRoundTripTimeVariance() {
    return enetJNI.ENetPeer_roundTripTimeVariance_get(swigCPtr, this);
  }

  public void setMtu(long value) {
    enetJNI.ENetPeer_mtu_set(swigCPtr, this, value);
  }

  public long getMtu() {
    return enetJNI.ENetPeer_mtu_get(swigCPtr, this);
  }

  public void setWindowSize(long value) {
    enetJNI.ENetPeer_windowSize_set(swigCPtr, this, value);
  }

  public long getWindowSize() {
    return enetJNI.ENetPeer_windowSize_get(swigCPtr, this);
  }

  public void setReliableDataInTransit(long value) {
    enetJNI.ENetPeer_reliableDataInTransit_set(swigCPtr, this, value);
  }

  public long getReliableDataInTransit() {
    return enetJNI.ENetPeer_reliableDataInTransit_get(swigCPtr, this);
  }

  public void setOutgoingReliableSequenceNumber(int value) {
    enetJNI.ENetPeer_outgoingReliableSequenceNumber_set(swigCPtr, this, value);
  }

  public int getOutgoingReliableSequenceNumber() {
    return enetJNI.ENetPeer_outgoingReliableSequenceNumber_get(swigCPtr, this);
  }

  public void setAcknowledgements(ENetList value) {
    enetJNI.ENetPeer_acknowledgements_set(swigCPtr, this, ENetList.getCPtr(value), value);
  }

  public ENetList getAcknowledgements() {
    long cPtr = enetJNI.ENetPeer_acknowledgements_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetList(cPtr, false);
  }

  public void setSentReliableCommands(ENetList value) {
    enetJNI.ENetPeer_sentReliableCommands_set(swigCPtr, this, ENetList.getCPtr(value), value);
  }

  public ENetList getSentReliableCommands() {
    long cPtr = enetJNI.ENetPeer_sentReliableCommands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetList(cPtr, false);
  }

  public void setSentUnreliableCommands(ENetList value) {
    enetJNI.ENetPeer_sentUnreliableCommands_set(swigCPtr, this, ENetList.getCPtr(value), value);
  }

  public ENetList getSentUnreliableCommands() {
    long cPtr = enetJNI.ENetPeer_sentUnreliableCommands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetList(cPtr, false);
  }

  public void setOutgoingReliableCommands(ENetList value) {
    enetJNI.ENetPeer_outgoingReliableCommands_set(swigCPtr, this, ENetList.getCPtr(value), value);
  }

  public ENetList getOutgoingReliableCommands() {
    long cPtr = enetJNI.ENetPeer_outgoingReliableCommands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetList(cPtr, false);
  }

  public void setOutgoingUnreliableCommands(ENetList value) {
    enetJNI.ENetPeer_outgoingUnreliableCommands_set(swigCPtr, this, ENetList.getCPtr(value), value);
  }

  public ENetList getOutgoingUnreliableCommands() {
    long cPtr = enetJNI.ENetPeer_outgoingUnreliableCommands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetList(cPtr, false);
  }

  public void setDispatchedCommands(ENetList value) {
    enetJNI.ENetPeer_dispatchedCommands_set(swigCPtr, this, ENetList.getCPtr(value), value);
  }

  public ENetList getDispatchedCommands() {
    long cPtr = enetJNI.ENetPeer_dispatchedCommands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ENetList(cPtr, false);
  }

  public void setNeedsDispatch(int value) {
    enetJNI.ENetPeer_needsDispatch_set(swigCPtr, this, value);
  }

  public int getNeedsDispatch() {
    return enetJNI.ENetPeer_needsDispatch_get(swigCPtr, this);
  }

  public void setIncomingUnsequencedGroup(int value) {
    enetJNI.ENetPeer_incomingUnsequencedGroup_set(swigCPtr, this, value);
  }

  public int getIncomingUnsequencedGroup() {
    return enetJNI.ENetPeer_incomingUnsequencedGroup_get(swigCPtr, this);
  }

  public void setOutgoingUnsequencedGroup(int value) {
    enetJNI.ENetPeer_outgoingUnsequencedGroup_set(swigCPtr, this, value);
  }

  public int getOutgoingUnsequencedGroup() {
    return enetJNI.ENetPeer_outgoingUnsequencedGroup_get(swigCPtr, this);
  }

  public void setUnsequencedWindow(SWIGTYPE_p_unsigned_int value) {
    enetJNI.ENetPeer_unsequencedWindow_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getUnsequencedWindow() {
    long cPtr = enetJNI.ENetPeer_unsequencedWindow_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public void setEventData(long value) {
    enetJNI.ENetPeer_eventData_set(swigCPtr, this, value);
  }

  public long getEventData() {
    return enetJNI.ENetPeer_eventData_get(swigCPtr, this);
  }

  public void setTotalWaitingData(long value) {
    enetJNI.ENetPeer_totalWaitingData_set(swigCPtr, this, value);
  }

  public long getTotalWaitingData() {
    return enetJNI.ENetPeer_totalWaitingData_get(swigCPtr, this);
  }

  public ENetPeer() {
    this(enetJNI.new_ENetPeer(), true);
  }

}

package org.zstack.sdk;

public enum ReplicationNetworkStatus {
	Disconnecting,
	Unconnected,
	Timeout,
	BrokenPipe,
	NetworkFailure,
	ProtocolError,
	TearDown,
	WFConnection,
	WFReportParams,
	Connected,
	StartingSyncS,
	StartingSyncT,
	WFBitMapS,
	WFBitMapT,
	WFSyncUUID,
	SyncSource,
	SyncTarget,
	PausedSyncS,
	PausedSyncT,
	VerifyS,
	VerifyT,
	StandAlone,
	Ready,
	Unknown,
}

package com.shimizukenta.secs.secs1;

import java.time.LocalDateTime;

import com.shimizukenta.secs.AbstractSecsLog;

public class Secs1ReceiveMessageBlockLog extends AbstractSecsLog {
	
	private static final long serialVersionUID = -51638627377922966L;
	
	private static final String commonSubject = "Receive SECS1-Message-Block";
	
	private final Secs1MessageBlock block;
	
	public Secs1ReceiveMessageBlockLog(Secs1MessageBlock block, LocalDateTime timestamp) {
		super(commonSubject, timestamp, block);
		this.block = block;
	}
	
	public Secs1ReceiveMessageBlockLog(Secs1MessageBlock block) {
		super(commonSubject, block);
		this.block = block;
	}
	
	public Secs1MessageBlock messageBlock() {
		return this.block;
	}
	
}

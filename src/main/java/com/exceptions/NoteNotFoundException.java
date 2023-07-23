package com.exceptions;

public class NoteNotFoundException extends AssertionError {

	public NoteNotFoundException() {
	}

	private NoteNotFoundException(String var1) {
		super(var1);
	}

	public NoteNotFoundException(Object var1) {
		this(String.valueOf(var1));
		if (var1 instanceof Throwable) {
			this.initCause((Throwable)var1);
		}

	}

	public NoteNotFoundException(boolean var1) {
		this(String.valueOf(var1));
	}

	public NoteNotFoundException(char var1) {
		this(String.valueOf(var1));
	}

	public NoteNotFoundException(int var1) {
		this(String.valueOf(var1));
	}

	public NoteNotFoundException(long var1) {
		this(String.valueOf(var1));
	}

	public NoteNotFoundException(float var1) {
		this(String.valueOf(var1));
	}

	public NoteNotFoundException(double var1) {
		this(String.valueOf(var1));
	}

	public NoteNotFoundException(String var1, Throwable var2) {
		super(var1, var2);
	}


}

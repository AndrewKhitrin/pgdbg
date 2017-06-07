package org.jkiss.pldbg.control;

public interface Breakpoint {
	
	DebugObject<?> getObj();
	void activate() throws DebugException;
	void drop() throws DebugException;
	long getLineNo();

}

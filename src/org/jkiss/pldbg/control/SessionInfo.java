package org.jkiss.pldbg.control;

public interface SessionInfo<SESSIONID> {
	
    SESSIONID getID();
    boolean isDebugWait();

}

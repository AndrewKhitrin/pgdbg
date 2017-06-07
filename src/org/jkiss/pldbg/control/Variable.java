package org.jkiss.pldbg.control;

public interface Variable<T> {
	
	T getVal();
	String getName();
	VariableType getType();

}

package com.designprinciples.isp;

// An old-fashioned printer which can just print will also have to implement unnecessary methods scan and fax
//So this interface violates ISP
public interface MachineViolatingISP {

	public void print(Document d);
	public void scan(Document d);
	public void fax(Document d);
	
}

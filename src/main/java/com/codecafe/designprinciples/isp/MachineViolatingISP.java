package com.codecafe.designprinciples.isp;

/*
 * ---------------
 *  Fat Interface
 * ---------------
 * An old-fashioned printer which can just print will also
 * have to implement unnecessary methods scan() and fax()
 * So this interface violates ISP !!
 *
 * Never force clients to implement methods they don't want to use!
 *
 */
public interface MachineViolatingISP {

  public void print(Document document);

  public void scan(Document document);

  public void fax(Document document);

}
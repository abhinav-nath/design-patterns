package com.codecafe.designprinciples.isp;

/**
 * ---------------
 *  Fat Interface
 * ---------------
 * An old-fashioned printer which can just print will also
 * have to implement unnecessary methods scan() and fax()
 * So this interface violates ISP !!
 *
 * Never force clients to implement methods they don't want to use!
 */
public interface MachineViolatingISP {

  void print(Document document);

  void scan(Document document);

  void fax(Document document);

}
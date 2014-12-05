package de.mobile.siteops

import com.citrix.netscaler.nitro.exception.nitro_exception;


import com.citrix.netscaler.nitro.service.nitro_service;
import org.apache.log4j.Logger


public class NitroSessionPool extends ObjectPool<NitroSession> {

    private NetscalerAppliance appliance

    public NitroSessionPool(NetscalerAppliance appliance) {
        super();
        Class classToLoad = NitroSession.class;
        Class[] cArg = new Class[1];
        cArg[0] = NetscalerAppliance.class;

        classToLoad.getDeclaredConstructor(cArg).newInstance(appliance);
        this.appliance = appliance
    }

    protected NitroSession create() {
        try {
            return new NitroSession(appliance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validate(NitroSession nitroSession) {

        if (nitroSession.isClosed())
            return false

        return true
    }

    public void expire(NitroSession nitroSession) {
         nitroSession.disconnect()
    }

}

public abstract class ObjectPool<T> {
  private long expirationTime;

  private Hashtable<T, Long> locked, unlocked;

  public ObjectPool() {
    expirationTime = 300000; // milliseconds
    locked = new Hashtable<T, Long>();
    unlocked = new Hashtable<T, Long>();
  }

  protected abstract T create();

  public abstract boolean validate(T o);

  public abstract void expire(T o);

  public synchronized T checkOut() {
    long now = System.currentTimeMillis();
    T t;
    if (unlocked.size() > 0) {
      Enumeration<T> e = unlocked.keys();
      while (e.hasMoreElements()) {
        t = e.nextElement();
        if ((now - unlocked.get(t)) > expirationTime) {
          // object has expired
          unlocked.remove(t);
          expire(t);
          t = null;
        } else {
          if (validate(t)) {
            unlocked.remove(t);
            locked.put(t, now);
            return (t);
          } else {
            // object failed validation
            unlocked.remove(t);
            expire(t);
            t = null;
          }
        }
      }
    }
    // no objects available, create a new one
    t = create();
    locked.put(t, now);
    return (t);
  }

  public synchronized void checkIn(T t) {
    locked.remove(t);
    unlocked.put(t, System.currentTimeMillis());
  }
}

public class NitroSession {

    def logger = Logger.getLogger(getClass())

    private String ip;
    private String protocol;
    private String username;
    private String password;
    def ns_session;

    public NitroSession(NetscalerAppliance netscalerAppliance) {
            this.ip = netscalerAppliance.ipAddress;
            this.protocol = netscalerAppliance.protocol;
            this.username = netscalerAppliance.username;
            this.password = netscalerAppliance.password;
        print "HELLO INSTANTIATOR"
            try {
            print "HELLO WORLD"
                //this.ns_session = new nitro_service(ip,protocol)
                //this.ns_session.login(username, password)
            } catch(nitro_exception error){
                logger.error "NITRO Error -> Code " + error.getErrorCode() + " : " + error.getMessage()
            } catch(Exception e){
                logger.error "Java Error -> " + e.getMessage()
            }

    }

    public void connect() {

    }

    public void disconnect() {
    }

    public boolean isClosed() {
            return false
    }

}
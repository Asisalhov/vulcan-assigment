package objects;

public class Server {

  private Integer id;
  private String hostname;
  private String ip;
  private String os;
  private String osVersion;

    public Server(Integer id, String hostname, String ip, String os, String osVersion) {
        this.id = id;
        this.hostname = hostname;
        this.ip = ip;
        this.os = os;
        this.osVersion = osVersion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}

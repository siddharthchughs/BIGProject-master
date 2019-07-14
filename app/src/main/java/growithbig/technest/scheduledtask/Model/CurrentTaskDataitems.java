package growithbig.technest.scheduledtask.Model;

public class CurrentTaskDataitems {


    public CurrentTaskDataitems(String id, String clientname, String client_address, String client_landmark, String client_contactno, String client_installation) {
        this.id = id;
        this.clientname = clientname;
        this.client_address = client_address;
        this.client_landmark = client_landmark;
        this.client_contactno = client_contactno;
        this.client_installation = client_installation;
    }

    private String id;
    private String clientname;
    private String client_address;
    private String client_landmark;
    private String client_contactno;

    private String client_installation;

    public String getClient_installation() {
        return client_installation;
    }

    public void setClient_installation(String client_installation) {
        this.client_installation = client_installation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClient_address() {
        return client_address;
    }

    public void setClient_address(String client_address) {
        this.client_address = client_address;
    }

    public String getClient_landmark() {
        return client_landmark;
    }

    public void setClient_landmark(String client_landmark) {
        this.client_landmark = client_landmark;
    }

    public String getClient_contactno() {
        return client_contactno;
    }

    public void setClient_contactno(String client_contactno) {
        this.client_contactno = client_contactno;
    }
}

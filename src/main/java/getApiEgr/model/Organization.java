package getApiEgr.model;

public class Organization {
    private String VUNP;
    private String VNAIMP;
    private String VNAIMK;
    private String VPADRES;
    private String DREG;
    private String NMNS;
    private String VMNS;
    private String CKODSOST;
    private String VKODS;

    public String getVUNP() {
        return VUNP;
    }

    public void setVUNP(String VUNP) {
        this.VUNP = VUNP;
    }

    public String getVNAIMP() {
        return VNAIMP;
    }

    public void setVNAIMP(String VNAIMP) {
        this.VNAIMP = VNAIMP;
    }

    public String getVNAIMK() {
        return VNAIMK;
    }

    public void setVNAIMK(String VNAIMK) {
        this.VNAIMK = VNAIMK;
    }

    public String getVPADRES() {
        return VPADRES;
    }

    public void setVPADRES(String VPADRES) {
        this.VPADRES = VPADRES;
    }

    public String getDREG() {
        return DREG;
    }

    public void setDREG(String DREG) {
        this.DREG = DREG;
    }

    public String getNMNS() {
        return NMNS;
    }

    public void setNMNS(String NMNS) {
        this.NMNS = NMNS;
    }

    public String getVMNS() {
        return VMNS;
    }

    public void setVMNS(String VMNS) {
        this.VMNS = VMNS;
    }

    public String getCKODSOST() {
        return CKODSOST;
    }

    public void setCKODSOST(String CKODSOST) {
        this.CKODSOST = CKODSOST;
    }

    public String getVKODS() {
        return VKODS;
    }

    public void setVKODS(String VKODS) {
        this.VKODS = VKODS;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "VUNP='" + VUNP + '\'' +
                ", VNAIMP='" + VNAIMP + '\'' +
                ", VNAIMK='" + VNAIMK + '\'' +
                ", VPADRES='" + VPADRES + '\'' +
                ", DREG='" + DREG + '\'' +
                ", NMNS='" + NMNS + '\'' +
                ", VMNS='" + VMNS + '\'' +
                ", CKODSOST='" + CKODSOST + '\'' +
                ", VKODS='" + VKODS + '\'' +
                '}';
    }
}

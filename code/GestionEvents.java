package code;

public class GestionEvents {
    private boolean aParticipe, peutParticiper, vaParticiper, veutParticiper;

    public GestionEvents(boolean aParticipe, boolean peutParticiper, boolean vaParticiper, boolean veutParticiper){
        this.aParticipe = aParticipe;
        this.peutParticiper = peutParticiper;
        this.vaParticiper = vaParticiper;
        this.veutParticiper = veutParticiper;
    }

    public boolean getAParticipe() {
        return aParticipe;
    }

    public void setAParticipe(boolean aParticipe) {
        this.aParticipe = aParticipe;
    }

    public boolean getPeutParticiper() {
        return peutParticiper;
    }

    public void setPeutParticiper(boolean peutParticiper) {
        this.peutParticiper = peutParticiper;
    }

    public boolean getVaParticiper() {
        return vaParticiper;
    }

    public void setVaParticiper(boolean vaParticiper) {
        this.vaParticiper = vaParticiper;
    }

    public boolean getVeutParticiper() {
        return veutParticiper;
    }

    public void setVeutParticiper(boolean veutParticiper) {
        this.veutParticiper = veutParticiper;
    }

}

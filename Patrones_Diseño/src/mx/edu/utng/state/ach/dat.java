package mx.edu.utng.state.ach;

public class dat {

    private info inf;

    public dat() {
        setInfo(new Programacion());
    }

    public void setInfo(info inf) {
        this.inf = inf;
        this.inf.setDat(this);
    }

    public void rh() {
       this.inf.rh();
    }

    public void jud() {
        this.inf.jud();
    }

    public void prog() {
        this.inf.prog();
    }

    public void prueb() {
        this.inf.prueb();
    }

}

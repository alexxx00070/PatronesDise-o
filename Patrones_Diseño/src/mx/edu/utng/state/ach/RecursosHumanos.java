package mx.edu.utng.state.ach;

import javax.swing.JOptionPane;

public class RecursosHumanos implements info{
	private dat d;

	@Override
    public void prog(){
		JOptionPane.showMessageDialog(null,"Son muy capaces de realizar hasta lo imposible");
    }

    @Override
    public void jud() {
    	JOptionPane.showMessageDialog(null,"Tienen que estar leyendo mucho, asi que trata de no interrumpirlos");
    	d.setInfo(new Juridico());
    }
    
    @Override
    public void prueb() {
    	JOptionPane.showMessageDialog(null,"Tienen que pensar siempre como un usuario y tratar de cometer cualquier tipo de error");
    }
    
    @Override
    public void rh() {
    	JOptionPane.showMessageDialog(null,"Tienen que estar al pendiente de las necesidades del equipo");
    }

    @Override
    public void setDat(dat d) {
        this.d = d;
    }

}

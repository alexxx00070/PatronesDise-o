package mx.edu.utng.state.ach;

import javax.swing.JOptionPane;

public class AreaPruebas implements info{
	private dat d;

	@Override
    public void prog(){
		JOptionPane.showMessageDialog(null,"No esta tan chido, te tratan como un peon :|");
    }

    @Override
    public void rh() {
    	JOptionPane.showMessageDialog(null,"Esta cool solo contratas y despides personas xD");
    }
    
    @Override
    public void jud() {
    	JOptionPane.showMessageDialog(null,"Tienes que saber mucho y estra preparado para la ocasión");
    }
    
    @Override
    public void prueb() {
    	JOptionPane.showMessageDialog(null,"Tienes que tener buen ojo en lo más minimo");
    }

    @Override
    public void setDat(dat d) {
        this.d = d;
    }

}

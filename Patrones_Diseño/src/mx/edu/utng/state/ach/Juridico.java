package mx.edu.utng.state.ach;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Juridico implements info{
	private dat d;

    @Override
    public void prog(){
    	JOptionPane.showMessageDialog(null,"Tienes que saber muchos lenguajes de programación");
    }

    @Override
    public void rh() {
    	JOptionPane.showMessageDialog(null,"Son los que te pagan y checan tu hora de entrada y salida ¡Cuidado!!");
    }

    @Override
    public void jud() {
    	JOptionPane.showMessageDialog(null,"Suelen ser intelectuales y muy bien capacitados");
    }

    @Override
    public void prueb() {
    	JOptionPane.showMessageDialog(null,"Los programadores los odian, donde quieran sacan errores.");
    	d.setInfo(new Programacion());
    }

    @Override
    public void setDat(dat d) {
        this.d = d;
    }

}

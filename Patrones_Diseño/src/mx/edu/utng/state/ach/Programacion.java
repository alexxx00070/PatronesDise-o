package mx.edu.utng.state.ach;

import javax.swing.JOptionPane;

public class Programacion implements info {

	private dat d;

	@Override
    public void prog(){
		JOptionPane.showMessageDialog(null,"Es el que se encarga de elaborar los programas que se ejecutan en las computadoras, modifican los existentes y vigilan que todos los procesos se ejecuten correctamente.");
		d.setInfo(new RecursosHumanos());
	}

    @Override
    public void rh() {
    	JOptionPane.showMessageDialog(null,"Se denomina recursos humanos al conjunto de los empleados o colaboradores de una organización");
    }
    
    @Override
    public void jud() {
    	JOptionPane.showMessageDialog(null,"Es la encargada de acordar todo lo referente a la normatividad interna de la empresa, asi mismo, sera representante legal de la empresa");
    }
    
    @Override
    public void prueb() {
    	JOptionPane.showMessageDialog(null,"Se encargan de revisar un conjunto de actividades que se realizan para identificar posibles fallos de funcionamiento, configuración o usabilidad de un programa o aplicación, por medio de pruebas sobre el comportamiento del mismo.");
    }

    @Override
    public void setDat(dat d) {
        this.d = d;
    }

}

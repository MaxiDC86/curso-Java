package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class MarcoSpinner {

	public static void main(String[] args) {

		FrameSpinner mimarco = new FrameSpinner();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameSpinner extends JFrame {
	FrameSpinner() {
		setBounds(550, 400, 550, 350);
		LaminaSpinner milamina = new LaminaSpinner();
		add(new LaminaSpinner());
	}
}

class LaminaSpinner extends JPanel {
	LaminaSpinner() {
		// String lista[]=
		// GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		// control = new JSpinner(new SpinnerListModel(lista));
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
			public Object getNextValue() {return super.getPreviousValue();}
			public Object getPreviousValue(){return super.getNextValue();}});
		Dimension d = new Dimension(100, 20);
		control.setPreferredSize(d);
		add(control);
	}
	/*
	private class MiModeloSpinner extends SpinnerNumberModel {
		public MiModeloSpinner() {
			super(5, 0, 10, 1);
		}
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}*/

}
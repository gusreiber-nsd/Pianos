import javax.swing.*;
//			listOfMajorKeys[i] = new Key(this,i);
//			

public class KeyBoard extends JFrame {

	private Key[] listOfMajorKeys = new Key[7];
	private mKey[] listOfMinorKeys = new mKey[5];

	private MusicStaff staff = new MusicStaff(this);
	private Instrument change = new Instrument(this);

	public KeyBoard() {
		this.setBounds(100, 100, 1244, 733);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		for (int i = 0; i < listOfMajorKeys.length; i++) {
			listOfMajorKeys[i] = new Key(this, i, false, this.change);
		}
		for (int i = 0; i < listOfMinorKeys.length; i++) {
			listOfMinorKeys[i] = new mKey(this, i, true, this.change);
		}

//		for(int i = 0; i <  listOfMajorKeys.length; i++)  {
//		}

	}

}

// public void setKey(int i) {
// listOfMajorKeys[i] = new Key(this, i);
// listOfMinorKeys[i] = new mKey(this, i);
// }

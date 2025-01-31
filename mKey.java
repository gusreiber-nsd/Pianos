import javax.swing.*;
import java.awt.Color;

public class mKey extends Key {

	private JFrame frame;

	private String[] noteName = { "C#/D(flat)", "D#/E(flat)", "F#/G(flat)", "G#/A(flat)", "A#/B(flat)" };

	private final Note note;

	public mKey(JFrame KeyBoard, int i, boolean minorKey, Instrument change) {

		super(KeyBoard, i, minorKey, change);

		this.note = new Note(KeyBoard, i);
		this.note.setBounds(830, 425 - i * 10, 300, 80);
		this.note.setText("B");

		int noteRemainder = i % this.noteName.length;

		setTheFont(13);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);

		setWIDTH(127);

		// if(noteRemainder == 2) {
		// setWIDTH(177);
		// } else {
		// setWIDTH(127);
		// }

		// setStart(79);
		setBounds(getLeft(i, minorKey), 57, 116, 212);

		switch (noteRemainder) {
		case 0:
			this.setText(this.noteName[noteRemainder]);
			break;
		case 1:
			this.setText(this.noteName[noteRemainder]);
			break;
		case 2:
			this.setText(this.noteName[noteRemainder]);
			break;
		case 3:
			this.setText(this.noteName[noteRemainder]);
			break;
		case 4:
			this.setText(this.noteName[noteRemainder]);
			break;
		case 5:
			this.setText(this.noteName[noteRemainder]);
			break;
		}

	}
}
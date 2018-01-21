package cs3151.project1.view_model;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class MainWindow {
	@FXML
	private AnchorPane anchor;

	@FXML
	private Button directoryChooser;

	@FXML
	private TextArea displayText;

	@FXML
	private TextField patternBox;

	@FXML
	private RadioButton selectAll;

	@FXML
	private ToggleGroup group1;

	@FXML
	private RadioButton selectDirectories;

	@FXML
	private RadioButton selectFiles;

	@FXML
	private RadioButton nameOnly;

	@FXML
	private ToggleGroup group2;

	@FXML
	private RadioButton fullPath;
	
	

	@FXML
	void initialize() {
		assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert directoryChooser != null : "fx:id=\"directoryChooser\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert displayText != null : "fx:id=\"displayText\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert patternBox != null : "fx:id=\"patternBox\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert selectAll != null : "fx:id=\"selectAll\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert group1 != null : "fx:id=\"group1\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert selectDirectories != null : "fx:id=\"selectDirectories\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert selectFiles != null : "fx:id=\"selectFiles\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert nameOnly != null : "fx:id=\"nameOnly\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert group2 != null : "fx:id=\"group2\" was not injected: check your FXML file 'mainWindow.fxml'.";
		assert fullPath != null : "fx:id=\"fullPath\" was not injected: check your FXML file 'mainWindow.fxml'.";

	}

}

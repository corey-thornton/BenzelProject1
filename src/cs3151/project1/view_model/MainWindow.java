package cs3151.project1.view_model;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;

import cs3151.project1.model.DirectorySearch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class MainWindow {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

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

	private ArrayList<String> list;

	private JFileChooser fchooser;

	private DirectorySearch search;

	@FXML
	void onDirectoryClick(ActionEvent event) {
		this.search = new DirectorySearch();
		this.list = new ArrayList<String>();
		this.fchooser = new JFileChooser();
		ArrayList<String> patternList = new ArrayList<String>();
		StringBuilder sBuild = new StringBuilder();
		fchooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fchooser.setAcceptAllFileFilterUsed(false);
		int value = fchooser.showOpenDialog(null);
		if (value != JFileChooser.APPROVE_OPTION) {
			return;
		}

		search.directorySearch(fchooser.getSelectedFile(), list);
		patternList = search.patternMatch(this.patternBox.getText(), list);

		for (String name : patternList) {
			if (this.nameOnly.isSelected()) {
				if(this.selectFiles.isSelected()) {
					this.list = new ArrayList<String>();
					search.directorySearch(fchooser.getSelectedFile(), list);
				}
				String[] sArray = name.split("\\\\");
				String file = sArray[sArray.length - 1];
				sBuild.append(file + "\n");
			} else {
				sBuild.append(name + "\n");
			}

		}
		this.displayText.setText(sBuild.toString());

	}

//	private void cheskIsFile(ArrayList<String> list) {
//		if (this.selectFiles.isSelected()) {
//			for(String name : list) {
//				if(name.)
//			}
//
//		}
//	}

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

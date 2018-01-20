package cs3151.view_model;

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

}

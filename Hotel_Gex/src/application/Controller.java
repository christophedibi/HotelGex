package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class Controller {
	@FXML
	private Button btnOk;
	@FXML
	private Label lblMessage;

	// Event Listener on Button[#btnOk].onAction
	@FXML
	public void handleBtnOk(ActionEvent event) {
		// TODO Autogenerated
		lblMessage.setText("Hello World !");
	}
}

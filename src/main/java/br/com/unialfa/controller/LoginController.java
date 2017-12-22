package br.com.unialfa.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;

import br.com.unialfa.AlunoDocumentacaoApplication;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;

@FXMLController
public class LoginController implements Initializable {
	
	@FXML
	private AnchorPane achorPane;

	@FXML
	private JFXTextField txtUsuario;

	@FXML
	private JFXPasswordField txtSenha;

	@FXML
	private JFXButton btnIniciar;
	
	@FXML
	private JFXSpinner spinner;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		AlunoDocumentacaoApplication.getStage().setResizable(false);
		AlunoDocumentacaoApplication.getStage().initStyle(StageStyle.UNDECORATED);
		spinner.setVisible(false);
	}

	public void entrar(Event event) {
		if(txtUsuario.getText().equals("thales") && txtSenha.getText().equals("123")){
			spinner.setVisible(true);
		}
	}

}

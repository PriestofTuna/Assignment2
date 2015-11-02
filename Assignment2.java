
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Assignment4 extends Application {
	/**
	 * Author, PriestofTuna requirements not yet met, javadoc initialization, I
	 * just need to know where it is in eclipse Requirements 3 & 5 in the nova
	 * page and least importantly UMLs, if there's extra time
	 */

	public static void main(String[] args) {
		launch(args);
	}

	// Account was here

	@Override
	public void start(Stage primaryStage) {
		Label UserLbl = new Label("Username");
		Label PassLbl = new Label("Password");
		Label AccountLbl = new Label("Accounts");
		Label FiNameLbl = new Label("First name");
		Label LaNameLbl = new Label("Last name");
		Label EmailLbl = new Label("Email");
		Label FirmPassLbl = new Label("Confirm password");
		Label PassFail = new Label("Passwords do not match");
		Button signUp = new Button("Sign up");

		primaryStage.setTitle("Account creator");
		TextField UserTxt = new TextField();
		PasswordField PassTxt = new PasswordField();
		PasswordField FirmPassTxt = new PasswordField();
		TextField fiNameTxt = new TextField();
		TextField laNameTxt = new TextField();
		TextField emailTxt = new TextField();
		ObservableList<String> options = FXCollections.observableArrayList("Admin ", "Student", "Guest");
		final ComboBox comboBox = new ComboBox(options);
		final String inputPassword = PassTxt.getText();
		final String inputFirmPassword = FirmPassTxt.getText();

		// The below "input" based variables are to gain the values of the
		// user's information
		signUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				String inputUser, inputfiName, inputlaName, inputAccount, inputEmail;
				// inputPassword was previously a string, inputFirmPassword was
				// previously a String above

				inputUser = UserTxt.getText();
				// inputPassword = PassTxt.getText();
				// inputFirmPassword = FirmPassTxt.getText();
				inputAccount = comboBox.toString(); // needs to be connected to
													// the comboBox
				inputfiName = fiNameTxt.getText();
				inputlaName = laNameTxt.getText();
				inputEmail = emailTxt.getText();

				Account asdf = new Account(inputUser, inputfiName, inputlaName, inputFirmPassword, inputAccount,
						inputEmail, inputPassword);

				inputUser.equalsIgnoreCase(inputUser);

				if (!inputPassword.equals(inputFirmPassword)) {
					PassTxt.setStyle("-fx-background-color: red;");
					FirmPassTxt.setStyle("-fx-background-color: red");

				} else {
					PassTxt.setStyle("-fx-background-color: white;");
				}

				if (inputUser.isEmpty()) {
					UserTxt.setStyle("-fx-background-color: red;");
				} else {
					UserTxt.setStyle("-fx-background-color: white;");
				}
				if (inputPassword.isEmpty()) {
					PassTxt.setStyle("-fx-background-color: red;");
				}

				if (inputFirmPassword.isEmpty()) {
					FirmPassTxt.setStyle("-fx-background-color: red;");
				}

				if (inputAccount.isEmpty()) {
					comboBox.setStyle("-fx-background-color: red;");
				} else {
					comboBox.setStyle("-fx-background-color: white;");
				}
				if (inputfiName.isEmpty()) {
					fiNameTxt.setStyle("-fx-background-color: red;");
				} else {
					fiNameTxt.setStyle("-fx-background-color: white;");
				}
				if (inputlaName.isEmpty()) {
					laNameTxt.setStyle("-fx-background-color: red;");
				} else {
					laNameTxt.setStyle("-fx-background-color: white;");
				}
				if (inputEmail.isEmpty()) {
					emailTxt.setStyle("-fx-background-color: red;");
				} else {
					emailTxt.setStyle("-fx-background-color: white;");
				}

				// Full array build here
				// Full array build here
				// Full array build here

				// below was an attempt to create a working loup that causes you
				// to check the password
				// below was an attempt to create a working loup that causes you
				// to check the password

				// System.out.println(inputUser);*/
				System.out.println(asdf);
				// below had lots of bits for Accounts, none of it required

			}
		});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);

		grid.add(UserLbl, 0, 0);
		grid.add(UserTxt, 1, 0);
		grid.add(PassLbl, 0, 2);
		grid.add(PassTxt, 1, 2);
		grid.add(FirmPassLbl, 0, 3);
		if (inputPassword.equals(inputFirmPassword)) {
			grid.add(FirmPassTxt, 1, 3);
		} else {
			grid.add(PassFail, 0, 3);
		}
		grid.add(AccountLbl, 0, 4);
		grid.add(comboBox, 1, 4);
		// Need to use a drop down list for account
		grid.add(FiNameLbl, 0, 5);
		grid.add(fiNameTxt, 1, 5);
		grid.add(LaNameLbl, 0, 6);
		grid.add(laNameTxt, 1, 6);
		grid.add(EmailLbl, 0, 7);
		grid.add(emailTxt, 1, 7);
		grid.add(signUp, 1, 8);
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private boolean isValidEmail(String str) {
		char firstCharacter = str.charAt(0);
		int y = 0;
		str.length();
		while (y < str.length()) {
			y++;
			System.out.print(str.charAt(y));
			if (str.charAt(y) == '@') {
                if(isSpecial(str.charAt(y)) ) {
                	
                }
			} else {

			}

		}
		return false;

	}
	
	private boolean isSpecial(char c){
		return !(Character.isDigit(c) && Character.isAlphabetic(c));
	}
	
	
	
}

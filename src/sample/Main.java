// Anuneet Anand
// DBMS Project

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application
{
    private static Stage stage;

    public static void setRoot_Home() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Home.fxml"))));stage.show(); }
    public static void setRoot_Team() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Team.fxml"))));stage.show(); }
    public static void setRoot_Hindi() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Hindi.fxml"))));stage.show(); }
    public static void setRoot_Error() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Error.fxml"))));stage.show(); }
    public static void setRoot_Student() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Student.fxml"))));stage.show(); }
    public static void setRoot_Teacher() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Teacher.fxml"))));stage.show(); }
    public static void setRoot_Guardian() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Guardian.fxml"))));stage.show(); }
    public static void setRoot_Admin() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Admin.fxml"))));stage.show(); }
    public static void setRoot_Govt() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Govt.fxml"))));stage.show(); }
    public static void setRoot_Login() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Login.fxml"))));stage.show(); }
    public static void setRoot_X() throws IOException {stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("PerformX.fxml"))));stage.show(); }
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        ConnectDB.SetUpDB();
        stage = primaryStage;
        stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("Home.fxml"))));
        stage.setResizable(false);
        stage.show();
        stage.addEventHandler(KeyEvent.KEY_RELEASED, (KeyEvent event) -> {if (KeyCode.ESCAPE == event.getCode()) {primaryStage.close();}});
    }
}




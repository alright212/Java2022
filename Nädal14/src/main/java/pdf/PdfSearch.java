package pdf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PdfSearch extends Application {

    // application code goes here

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pdf.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root, 400, 600));
        stage.setTitle("Pdf search");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

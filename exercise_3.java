import javafx.fxml.FXML;
                                    //  |- esse implements vem do conceito de criar uma interface
public class FXMLDocumentController implements Initializable{

    @FXML
    private Button btnClick;
    private Label lblMensagem;
    @FXML
    private void clicouBotao(){
        lblMensagem.setText("Olá, mundo!");
    }
}
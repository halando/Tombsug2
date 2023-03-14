package views;

import com.github.andoattila.inputlib.InputPanel;
import com.github.andoattila.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel  extends VBox{
    TitlePanel titlePanel;
    InputPanel sidePanel;
    InputPanel alphaPanel;
    public MainPanel() {
        this.titlePanel = new TitlePanel();
        this.alphaPanel = new InputPanel();
        this.sidePanel = new InputPanel();
        this.titlePanel.setText("Rombuszba írható kör sugara");
        this.sidePanel.setText("Oldal");
        this.alphaPanel.setText("Alfa szög");
        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.sidePanel);
        this.getChildren().add(this.alphaPanel);
       
    }

    
}
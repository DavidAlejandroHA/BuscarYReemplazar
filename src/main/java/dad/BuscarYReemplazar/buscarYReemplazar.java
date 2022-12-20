package dad.BuscarYReemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 
 * @author David Alejandro Hernández Alonso 2º DAM A
 *
 */
public class buscarYReemplazar extends Application{
	
	// view
	
		private TextField buscarTxtLabel, reemplazarTxtLabel;
		private Button buscarButton, reemplazarButton, reemptodoButton, cerrarButton, helpButton;
		private CheckBox mayusminChBox, expRegChBox, buscarAtrasChBox, resaltResultChBox;
		
	// modelo
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarTxtLabel = new TextField();
		reemplazarTxtLabel = new TextField();
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemptodoButton = new Button("Reemplazar todo");
		cerrarButton = new Button("Cerrar");
		helpButton = new Button("Ayuda");
		
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemptodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		helpButton.setMaxWidth(Double.MAX_VALUE);
		
		mayusminChBox = new CheckBox("Mayúsculas y minúsculas");
		expRegChBox = new CheckBox("Expresión regular");
		buscarAtrasChBox = new CheckBox("Buscar hacia atrás");
		resaltResultChBox = new CheckBox("Resaltar hacia atrás");
		
		
		BorderPane root = new BorderPane();
		GridPane zona1 = new GridPane();
		GridPane checkboxPanel = new GridPane();

		zona1.setHgap(5);
		zona1.setVgap(5);
		zona1.setPadding(new Insets(5));
		zona1.addRow(0, new Label("Buscar:"), buscarTxtLabel);
		zona1.addRow(1, new Label("Reemplazar con:"), reemplazarTxtLabel);
		zona1.addRow(2, new Label(""), checkboxPanel);
		//zona1.setGridLinesVisible(true);
		
		checkboxPanel.addRow(0, mayusminChBox, buscarAtrasChBox);
		checkboxPanel.addRow(1, expRegChBox, resaltResultChBox);
		//checkboxPanel.setAlignment(Pos.CENTER_LEFT);
		
		VBox zonaBotones = new VBox();
		zonaBotones.setSpacing(5);
		zonaBotones.setFillWidth(true);
		zonaBotones.setAlignment(Pos.TOP_CENTER);
		zonaBotones.setPadding(new Insets(5));
		zonaBotones.getChildren().addAll(buscarButton, reemplazarButton, reemptodoButton, cerrarButton, helpButton);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		
		zona1.getColumnConstraints().setAll(cols);
		
		cols[0].setHalignment(HPos.LEFT);
		cols[1].setHgrow(Priority.ALWAYS); // estirar hacia los lados
		
		ColumnConstraints [] cols2 = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		
		checkboxPanel.getColumnConstraints().setAll(cols2);
		checkboxPanel.setHgap(5);
		checkboxPanel.setVgap(5);
		cols2[0].setHgrow(Priority.ALWAYS);
		cols2[1].setHgrow(Priority.ALWAYS);
		
		root.setCenter(zona1);
		root.setRight(zonaBotones);
		
		primaryStage.setTitle("Buscar y reemplazar - David Alejandro Hernández Alonso 2º DAM A");
		primaryStage.setScene(new Scene(root, 540, 200));
		primaryStage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}

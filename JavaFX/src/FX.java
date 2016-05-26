
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
 
public class FX extends Application { 
 
  public static void main(String[] args) { 
  
    System.out.println("Launching JavaFX application."); 
  
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the init() method. 
  public void init() { 
    System.out.println("Inside the init() method."); 
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    System.out.println("Inside the start() method."); 
 
    // Give the stage a title - присвоить заголовок подмосткам
    myStage.setTitle("JavaFX Skeleton."); 
 
    // Create a root node (Создать корневой узел). In this case, a flow layout 
    //pane is used, but several alternatives exist. 
    //В данном случае используется панель поточной компоновки
    FlowPane rootNode = new FlowPane(); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 300, 200); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Show the stage and its scene. 
    myStage.show(); 
 
  } 
 
  // Override the stop() method. 
  public void stop() { 
    System.out.println("Inside the stop() method."); 
  } 
}
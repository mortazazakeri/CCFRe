/*
 *   ClassChin Main Class. 
 *   First Create by Ali @ 1392-02-20
 *   Last Edit by Morteza, Add some Comment! and Fix Import!
 *   Ready to Connect to DataBase! 
 */
package jclasschin;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jclasschin.controller.PreloaderLayoutController;

/**
 *
 * @author Ali
 */
public class JClassChin extends Application {

    private static Stage mainStage;
    private static BorderPane mainLayout;
    private static AnchorPane dashboardLayout;
    
    private static AnchorPane preloaderLayout;
    private PreloaderLayoutController preloaderLayoutController;

    /**
     * @return the mainStage
     */
    public static Stage getMainStage() {
        return mainStage;
    }

    /**
     * @return the mainLayout
     */
    public static BorderPane getMainLayout() {
        return mainLayout;
    }

    @Override
    public void start(Stage mainStage) throws IOException, InterruptedException {

        JClassChin.mainStage = mainStage;
        mainStage.setTitle("JClassChin");
        FXMLLoader mainLayoutLoader
                = new FXMLLoader(JClassChin.class.getResource("view/MainLayout.fxml"));
        
        FXMLLoader preloaderLayoutLoader
                = new FXMLLoader(JClassChin.class.getResource("view/PreloaderLayout.fxml"));
        
        mainLayout = (BorderPane) mainLayoutLoader.load();
        
        preloaderLayout=(AnchorPane) preloaderLayoutLoader.load();
        preloaderLayoutController=preloaderLayoutLoader.getController();
        
        Scene mainScene = new Scene(getMainLayout());
        
        Scene preloaderScene = new Scene(preloaderLayout);
        
//        mainStage.setScene(mainScene);
        
        mainStage.setScene(preloaderScene);
        
        mainStage.setResizable(false);
        mainStage.centerOnScreen();
        mainStage.show();
        
        preloaderLayoutController.loading();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

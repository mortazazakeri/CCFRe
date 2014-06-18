/*
 * The MIT License
 *
 * Copyright 2014 Ali.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jclasschin.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import jclasschin.JClassChin;
import jclasschin.model.*;

/**
 * FXML Controller class
 *
 * @author Ali
 */
public class PreloaderLayoutController implements Initializable {

    private FXMLLoader mainLayoutLoader;
    private BorderPane mainLayout;
    private MainLayoutController mainLayoutController;

    @FXML
    private ProgressIndicator progressIndicator;

    public PreloaderLayoutController() throws IOException {

        mainLayoutLoader = new FXMLLoader(JClassChin.class.getResource("view/MainLayout.fxml"));
        mainLayout = (BorderPane) mainLayoutLoader.load();
        mainLayoutController = mainLayoutLoader.getController();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        progressIndicator.setProgress(0.001F);
    }

    public void start() throws InterruptedException {

        Task loadingTask = new Task<Void>() {
            @Override
            public Void call() {

                TermManager.selectAll();
                FieldManager.selectAll();
                return null;
            }
        };

        Task progressIndicatorTask = new Task<Void>() {
            @Override
            public Void call() throws InterruptedException {

                double max = 10000000;
                for (double i = 0; i <= max; i += 0.1) {
                    if (isCancelled()) {
                        break;
                    }
                    updateProgress(i, max);
                }
                return null;
            }
        };

        progressIndicator.progressProperty().bind(progressIndicatorTask.progressProperty());

        Thread progressIndicatorThread = new Thread(progressIndicatorTask);
        Thread loadingThread = new Thread(loadingTask);

        progressIndicatorThread.start();
        loadingThread.start();

    }

}

/*
 * Copyright 2018 Rohit Awate.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rohitawate.everest;

import com.rohitawate.everest.misc.ThemeManager;
import com.rohitawate.everest.settings.SettingsLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;



public class Main extends Application {
    public static final String APP_NAME = "Everest";

    private Button btnHello;  // Declare a "Button" control

    @Override
    public void start(Stage primaryStage) {
        // Construct the "Button" and attach an "EventHandler"
        btnHello = new Button();
        btnHello.setText("Say Hello");
        // Using JDK 8 Lambda Expression to construct an EventHandler<ActionEvent>
        btnHello.setOnAction(evt -> System.out.println("Hello World!"));

        // Construct a scene graph of nodes
        StackPane root = new StackPane();  // The root of scene graph is a layout node
        root.getChildren().add(btnHello);  // The root node adds Button as a child

        Scene scene = new Scene(root, 300, 100);  // Construct a scene given the root of scene graph
        primaryStage.setScene(scene);    // The stage sets scene
        primaryStage.setTitle("Hello");  // Set window's title
        primaryStage.show();             // Set visible (show it)
    }

    public static void main(String args[]) {
        launch(args);
    }
}

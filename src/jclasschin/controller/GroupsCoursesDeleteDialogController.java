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

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import jclasschin.entity.Course;
import jclasschin.model.CourseManager;

/**
 * FXML Controller class
 *
 * @author Ali
 */
public class GroupsCoursesDeleteDialogController implements Initializable
{

    private Stage groupsCoursesDeleteDialogStage;
    private Course editableCourse;

    @FXML
    private HBox yesHBox;
    @FXML
    private ImageView okImageView;
    @FXML
    private HBox noHBox;
    @FXML
    private ImageView cancelImageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void yesHBoxOnMouseExited(MouseEvent event)
    {
    }

    @FXML
    private void yesHBoxOnMouseEntered(MouseEvent event)
    {
    }

    @FXML
    private void yesHBoxOnMouseClicked(MouseEvent event)
    {
        CourseManager cm = new CourseManager();
        cm.delete(editableCourse.getId());
        groupsCoursesDeleteDialogStage.close();
    }

    @FXML
    private void noHBoxOnMouseExited(MouseEvent event)
    {
    }

    @FXML
    private void noHBoxOnMouseEntered(MouseEvent event)
    {
    }

    @FXML
    private void noHBoxOnMouseClicked(MouseEvent event)
    {
        groupsCoursesDeleteDialogStage.close();
    }

    /**
     * @return the groupsCoursesEditDialogStage
     */
    public Stage getGroupsCoursesDeleteDialogStage()
    {
        return groupsCoursesDeleteDialogStage;
    }

    /**
     * @param groupsCoursesEditDialogStage the groupsCoursesEditDialogStage to
     * set
     */
    public void setGroupsCoursesDeleteDialogStage(Stage groupsCoursesDeleteDialogStage)
    {
        this.groupsCoursesDeleteDialogStage = groupsCoursesDeleteDialogStage;
    }

    /**
     * @return the editableCourse
     */
    public Course getEditableCourse()
    {
        return editableCourse;
    }

    /**
     * @param editableCourse the editableCourse to set
     */
    public void setEditableCourse(Course editableCourse)
    {
        this.editableCourse = editableCourse;
    }

}

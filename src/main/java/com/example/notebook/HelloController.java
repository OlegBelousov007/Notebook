package com.example.notebook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import user.User;
import user.Users;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField  passwordTextFild;
    @FXML
    private Label errorLable;
    public void passwordTextFild(ActionEvent actionEvent) {
    }

    public void onLoginBtnClick(ActionEvent actionEvent) throws IOException {
        if (checkData()){
            showDiary();
        }else {
            errorLable.setText("Введён неверный номер телефона!");
        }
    }
    private void showDiary() throws IOException {
        Stage daryStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 540);
        daryStage.setTitle("Hello!");
        daryStage.setScene(scene);
        daryStage.show();

    }

    private boolean checkData(){
      for (User users: Users.users){
          if (users.getPhone().equals(passwordTextFild.getText())){
              return true;
          }
      }
      return false;
    }
}
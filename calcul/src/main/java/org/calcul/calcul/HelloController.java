package org.calcul.calcul;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class HelloController {
    @FXML
    private Label result;
    private int calcul;
    private String[] nums = new String[2];
    private String tmp = "";

    @FXML
    protected void OnClickNumber(javafx.event.ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getSource()).getText();
        tmp = tmp + value;
        result.setText(tmp);

        if (value.equals("=")) {
            if (tmp.contains("+")) {
                nums = tmp.split("\\+");
                calcul = Integer.parseInt(nums[0].replace("=", "")) + Integer.parseInt(nums[1].replace("=", ""));
                result.setText(String.valueOf(calcul));
            } else if (tmp.contains("-")) {
                nums = tmp.split("-");
                calcul = Integer.parseInt(nums[0].replace("=", "")) - Integer.parseInt(nums[1].replace("=", ""));
                result.setText(String.valueOf(calcul));
            }
        } else if (value.equals("CE")) {
            tmp = "";
            calcul = 0;
            result.setText(tmp);
        }
    }
}
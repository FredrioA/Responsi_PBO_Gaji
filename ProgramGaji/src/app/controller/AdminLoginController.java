package app.controller;

import app.model.AdminModel;
import app.view.AdminLoginView;

import java.awt.event.ActionEvent;

public class AdminLoginController {
    AdminLoginView adminLoginView;
    AdminModel adminModel;

    public  AdminLoginController(AdminLoginView adminLoginView, AdminModel adminModel) {
        this.adminLoginView = adminLoginView;
        this.adminModel = adminModel;

        adminLoginView.login.addActionListener((ActionEvent e) -> {
            String username = this.adminLoginView.user.getText();
            String password = this.adminLoginView.pass.getText();
            if (this.adminModel.getAdmin(username, password)) {
                Transition transition = new Transition();
                transition.adminTransition();
                this.adminLoginView.dispose();
            }
        });
    }
}

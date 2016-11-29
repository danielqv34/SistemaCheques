package com.dqv.controller;

import com.dqv.Entities.Usuarios;
import com.dqv.dto.ObtenerSession;
import com.dqv.validations.LoginValidator;
import com.dqv.validations.SessionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by ezequ on 11/28/2016.
 */
@ManagedBean(name = "loginController")
@Controller
public class LoginController extends ObtenerSession {

    private Usuarios usuario;

    @Autowired
    private LoginValidator loginValidator;


    public String validaLogin() throws IOException {
        boolean valido = loginValidator.validaUsuario(usuario.getNombreUsuario(), usuario.getClave());
        if (valido) {
            HttpSession session = SessionController.getSession();
            session.setAttribute("username", usuario.getNombreUsuario());
            FacesContext.getCurrentInstance().getExternalContext().redirect("dashboard.xhtml");
            return "dashboard";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o Contraseña invalidos",null));
            return "login";
        }
    }

    public String logout() throws IOException {
        HttpSession session = SessionController.getSession();
        session.invalidate();
        FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        return "login";
    }



    public LoginController() {
        usuario = new Usuarios();
        loginValidator = new LoginValidator();

    }

    public Usuarios getLogin() {
        return usuario;
    }

    public void setLogin(Usuarios usuario) {
        this.usuario = usuario;
    }

    public LoginValidator getLoginValidator() {
        return loginValidator;
    }

    public void setLoginValidator(LoginValidator loginValidator) {
        this.loginValidator = loginValidator;
    }
}

package com.example.nodesperdicio;


public class ControladorLogin implements LoginIterface.Controlador {
    private LoginIterface.View view;

    public ControladorLogin(LoginIterface.View view) {
        this.view = view;
    }

    @Override
    public Boolean validarLogin(String editText, String indicador) {
        if (indicador.equals("usuario")) {
            if (editText.trim().isEmpty()) {
                view.validarResultado(indicador, "Los campos no pueden estar vacios");
                return false;
            }
            if (editText.trim().length() <= 5) {
                view.validarResultado(indicador, "Los campos no pueden tener menos de 4 caracteres");
                return false;
            }

        } else if (indicador.equals("password")) {
            if (editText.trim().isEmpty()) {
                view.validarResultado(indicador, "Los campos no pueden estar vacios");
                return false;
            }
            if (editText.trim().length() <= 8) {
                view.validarResultado(indicador, "Los campos no pueden tener menos de 8 caracteres");
                return false;
            }
        }return true;
    }

    @Override

    public Boolean usuarioPermitido(String usuario, String password) {
        if ("prueba".equals(usuario) && "12345".equals(password)) {
            view.usuarioAutorizado(true);
            return true;
        } else {
            view.usuarioAutorizado(false);
            return false;
        }
    }
}


package com.example.nodesperdicio;

public interface LoginIterface {
            interface View{
                void validarResultado(String editText, String mensaje);
                void usuarioAutorizado(Boolean validar);

            }
            interface Controlador{
                Boolean validarLogin(String editText, String indice);
                Boolean usuarioPermitido(String usuario, String password);
            }
            interface  Modelo{

            }
        }



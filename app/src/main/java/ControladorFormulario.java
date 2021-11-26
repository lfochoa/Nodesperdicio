public class ControladorFormulario implements FormularioInterfaz.Controlador {

    private final FormularioInterfaz.View view;

    public ControladorFormulario(FormularioInterfaz.View view) {
        this.view = view;
    }


    @Override
    public Boolean validarFormulario(FormularioDTO formularioDTO) {
        if (formularioDTO.getEditNombres().trim().isEmpty()) {
            view.validarResultadoFormulario("nombre", "Los campos no pueden estar vacíos");
            return false;
        } else if (formularioDTO.getEditApellidos().trim().isEmpty()) {
            view.validarResultadoFormulario("apellido", "Los campos no pueden estar vacíos");
            return false;
        }else if (formularioDTO.getEditDireccion().trim().isEmpty()) {
            view.validarResultadoFormulario("direccion", "Los campos no pueden estar vacíos");
            return false;
        }else if (formularioDTO.getEditCorreo().trim().isEmpty()) {
            view.validarResultadoFormulario("correo", "Los campos no pueden estar vacíos");
            return false;
        }else if (formularioDTO.getEditCiudad().trim().isEmpty()) {
            view.validarResultadoFormulario("ciudad", "Los campos no pueden estar vacíos");
            return false;
        }else if (formularioDTO.getEditCelular().trim().isEmpty()) {
            view.validarResultadoFormulario("celular", "Los campos no pueden estar vacíos");
            return false;
        }else if (formularioDTO.getEditUsuario().trim().isEmpty()) {
            view.validarResultadoFormulario("usuario", "Los campos no pueden estar vacíos");
            return false;
        }else if (formularioDTO.getEditPassword().length() < 5) {
            view.validarResultadoFormulario("password", "Los campos no pueden estar vacíos");
            return false;
        } else if (formularioDTO.getEditPassword().trim().isEmpty()) {
            view.validarResultadoFormulario("password", "Los campos no pueden estar vacíos");
            return false;
        } else {
            if (formularioDTO.getSpSexo().trim().isEmpty()) {
                view.validarResultadoFormulario("sexo", "Los campos no pueden estar vacíos");
                return false;
            }
        }



        return true;


    }

    @Override
    public Boolean usuarioGuardarUsuario(FormularioDTO formularioDTO) {
        if (formularioDTO != null) {
            UsuarioDto usuario = UsuarioDto.getInstance();
            usuario.setNombre(formularioDTO.getEditNombres());
            usuario.setApellido(formularioDTO.getEditApellidos());
            view.respuestaGuardadoUsuario(true);
            return true;
        } else {
            view.respuestaGuardadoUsuario(false);
            return false;
        }
    }
}






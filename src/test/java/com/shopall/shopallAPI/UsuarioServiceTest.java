package com.shopall.shopallAPI;

import com.shopall.shopallAPI.Entity.Usuario;
import com.shopall.shopallAPI.Exception.CorreoElectronicoDuplicadoException;
import com.shopall.shopallAPI.Repository.UsuarioRepository;
import com.shopall.shopallAPI.Service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioServiceTest {

    @InjectMocks
    UsuarioService usuarioService;

    @Mock
    UsuarioRepository usuarioRepository;


    Usuario usuario;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        usuario = new Usuario();
        usuario.setID(1);
        usuario.setNombreUsuario("cesar");
        usuario.setContraseña("1245");
        usuario.setNombreCompleto("cesarangel");
        usuario.setCorreoElectronico("cesar@hotmail.com");
    }

    @Test
    public void testConsultarUsuarios() {
        // Simular el comportamiento del usuarioRepository para devolver una lista que contiene el usuario que configuraste en el setUp
        List<Usuario> usuarios = Collections.singletonList(usuario);
        Mockito.when(usuarioRepository.findAll()).thenReturn(usuarios);

        List<Usuario> result = usuarioService.ConsultarUsuarios();

        // Imprimir los detalles de los usuarios en la consola
        for (Usuario u : result) {
            System.out.println("ID: " + u.getID());
            System.out.println("Nombre: " + u.getNombreUsuario());
            System.out.println("contraseña... " + u.getContraseña());
            System.out.println("nombrecompleto... " + u.getNombreCompleto());
            System.out.println("correo electronico.. " + u.getCorreoElectronico());
        }

        assertEquals(usuarios, result);
    }
    @Test
    public void testCrearUsuario_CorreoElectronicoDuplicado() {
        // Configurar el comportamiento de usuarioRepository.existsByCorreoElectronico
        Mockito.when(usuarioRepository.existsByCorreoElectronico(Mockito.anyString())).thenAnswer(invocation -> {
            String correoElectronico = invocation.getArgument(0);
            return usuario.getCorreoElectronico().equals(correoElectronico);
        });

        // Crear un nuevo usuario con el correo electrónico duplicado
        Usuario usuarioDuplicado = new Usuario();
        usuarioDuplicado.setID(2);
        usuarioDuplicado.setNombreUsuario("braulio");
        usuarioDuplicado.setContraseña("12456");
        usuarioDuplicado.setNombreCompleto("Brauliocaleb");
        usuarioDuplicado.setCorreoElectronico("cesar@hotmail.com");

        // Verificar que se lance la excepción y obtener el mensaje de la excepción
        CorreoElectronicoDuplicadoException exception = assertThrows(CorreoElectronicoDuplicadoException.class, () -> {
            usuarioService.crearUsuario(usuarioDuplicado);
        });

        // Imprimir el mensaje de la excepción en la consola
        System.out.println("Mensaje de la excepción: " + exception.getMessage());

        // Asegurarse de que el método save no se haya llamado (o se haya llamado con un objeto diferente)
        Mockito.verify(usuarioRepository, Mockito.never()).save(Mockito.any(Usuario.class));
    }

    @Test
    public void testCrearUsuario_CorreoElectronicoNoDuplicado() {
        // Configurar el comportamiento de usuarioRepository.existsByCorreoElectronico
        Mockito.when(usuarioRepository.existsByCorreoElectronico(Mockito.anyString())).thenReturn(false);

        // Crear un nuevo usuario con un correo electrónico que no está duplicado
        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.setID(3);
        usuarioNuevo.setNombreUsuario("carlos");
        usuarioNuevo.setContraseña("78910");
        usuarioNuevo.setNombreCompleto("CarlosGomez");
        usuarioNuevo.setCorreoElectronico("cesar@hotmail.com");

        // No debería lanzarse una excepción, ya que el correo electrónico no está duplicado
        assertDoesNotThrow(() -> {
            usuarioService.crearUsuario(usuarioNuevo);
        });

        // Asegurarse de que el método save se haya llamado con el usuarioNuevo
        Mockito.verify(usuarioRepository, Mockito.times(1)).save(usuarioNuevo);
    }
}











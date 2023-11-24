package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Resena;

import java.util.List;

public interface ResenaService {

    public List<Resena> ConsultarResena();

    public Resena crearResena(Resena resena);

    public Resena actualizarResena(Resena resena);

    public void  eliminarResena(int id);
}

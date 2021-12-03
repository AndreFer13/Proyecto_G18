package com.ServTecnico_G18.Familia.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="agenda")
public class AgendaModel {
    @Id
    private String id;
    private String fecha;
    private String Servicio;
    //private int golesvisitante;
    //private StecnicoModel local;
    //private StecnicoModel visitante;
    private UsuarioModel usuario;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getServicio() {
        return Servicio;
    }
    public void setServicio(String servicio) {
        Servicio = servicio;
    }
    public UsuarioModel getUsuario() {
        return usuario;
    }
    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    
    
}

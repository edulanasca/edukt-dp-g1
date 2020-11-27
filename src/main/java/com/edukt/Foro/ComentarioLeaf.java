package com.edukt.Foro;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComentarioLeaf extends  IComponentForo{

    public ComentarioLeaf(String texto, LocalDateTime postDate, String curso, String autor) {
        super(texto, postDate, curso, autor);
        this.setId(UUID.randomUUID());
    }

    @Override
    public String mostrar(int profundidad) {
        String s = new String();
        for (int i=0;i<profundidad;i++){
            s=s+"-";
        }
        return s+this.getTexto()+"\n\r";
    }

}

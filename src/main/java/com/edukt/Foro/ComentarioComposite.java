package com.edukt.Foro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class ComentarioComposite extends  IComponentForo{
    private ArrayList<IComponentForo> comentarios;

    public ComentarioComposite(String texto, LocalDateTime postDate, String curso, String autor) {
        super(texto, postDate, curso, autor);
        setId(UUID.randomUUID());
        comentarios = new ArrayList<IComponentForo>();
    }

    @Override
    public String mostrar(int profundidad) {
        String s = new String();
        for (int i=0;i<profundidad;i++){
            s=s+"-";
        }
        StringBuilder infoElemento = new StringBuilder(s);
        //informacion del compuesto
        infoElemento.append("compuesto: "  +this.getTexto()+ " | Comentarios: "+comentarios.stream().count()+"\r\n");
        //adicionamos elementos
        for (IComponentForo c:comentarios) {
            infoElemento.append(c.mostrar(profundidad+1));
        }
        return infoElemento.toString();
    }

    //AGREGAR COMENTARIO
    public void addComentario(IComponentForo comentario){

        comentarios.add(comentario);
    };

    //ELIMINAR COMENTARIO
    public IComponentForo removeComentario(int n){
        if(n < comentarios.size()){
            IComponentForo eliminado = comentarios.get(n);
            comentarios.remove(n);
            return eliminado;}
        return null;
    }

    public ArrayList<IComponentForo> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<IComponentForo> comentarios) {
        this.comentarios = comentarios;
    }
}
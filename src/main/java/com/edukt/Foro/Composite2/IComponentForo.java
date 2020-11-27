package com.edukt.Foro.Composite2;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class IComponentForo {
    private String texto;
    private LocalDateTime postDate;
    private String curso;
    private String autor;//autor lo reemplasaremos por un objeto de la clase usuario
    private UUID id;

    public IComponentForo(String texto, LocalDateTime postDate, String curso, String autor) {
        this.texto = texto;
        this.postDate = postDate;
        this.curso = curso;
        this.autor = autor;
        id = UUID.randomUUID();
    }

    public abstract String mostrar(int profundidad);

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

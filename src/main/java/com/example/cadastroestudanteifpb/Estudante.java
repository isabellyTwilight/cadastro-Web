package com.example.cadastroestudanteifpb;

import java.time.LocalDate;

public record Estudante(
        Integer id,
        String nome,
        String email,
        String telefone,
        LocalDate dataNascimento,
        int anoIngresso,
        String turma,
        String cidade,
        String turno,
        boolean participaProjeto
) {
    public Estudante comId(Integer novoId) {
        return new Estudante(
                novoId,
                nome,
                email,
                telefone,
                dataNascimento,
                anoIngresso,
                turma,
                cidade,
                turno,
                participaProjeto);
        }

    public boolean observacoes() {
        return false;
    }
}

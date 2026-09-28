@import com.example.cadastroestudanteifpb.Estudante

@param com.example.cadastroestudanteifpb.Estudante
@param Estudante estudantes

<!doctype html>
<html lang="pt-BR">
<html lang="pt-BR">
<head>
    <meta charset="UTF-8"><title>Dados recebidos</title>
    <link rel="stylesheet" href="/css/enfeite.css">
</head>

<body>
    <h1>Dados recebidos</h1>
    <p><strong>Nome:</strong> ${estudantes.nome()}</p>
    <p><strong>E-mail:</strong> ${estudantes.email()}</p>
    <p>strong>Telefone:</strong> ${estudantes.telefone()}</p>
    <p>strong>Data de Nascimento:</strong> ${estudantes.dataNascimento().toString()}</p>
    <p>strong>Ano de Ingresso:</strong> ${estudantes.anoIngresso()}</p>
    <p>strong>Turma:</strong> ${estudantes.turma()}</p>
    <p>strong>Cidade:</strong> ${estudantes.cidade()}</p>
    <p>strong>Turno:</strong> ${estudantes.turno()}</p>
    <p>strong>Observações:</strong> ${estudantes.observacoes()}</p>
</body>
</html>

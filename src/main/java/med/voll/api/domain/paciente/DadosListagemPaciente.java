package med.voll.api.domain.paciente;

public record DadosListagemPaciente(

        Long id,
        String nome,
        String email,
        String cpf,
        Boolean ativo
) {
    public DadosListagemPaciente(Paciente dados){
        this(dados.getId(), dados.getNome(), dados.getEmail(), dados.getCpf(), dados.getAtivo());
    }
}

package med.voll.api.medico;

public record DadosListagemMedico(

        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade,

        Boolean ativo
) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getEspecialidade(), medico.isAtivo());
        // pode ter mais construtores mas todos tem que chamar o construtor principal (assinatura do record)
    }
}

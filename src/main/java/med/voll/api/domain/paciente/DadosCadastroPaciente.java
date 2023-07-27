package med.voll.api.domain.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;
import med.voll.api.domain.endereco.Endereco;

public record DadosCadastroPaciente(
                                    @NotBlank(message = "{nome.obrigatorio}")
                                    String nome,
                                    @NotBlank(message = "{email.obrigatorio}")
                                    @Email(message = "{email.invalido}")
                                    String email,
                                    @NotBlank(message = "{cpf.obrigatorio}")
                                    String cpf,
                                    @NotBlank(message = "{telefone.obrigatorio}")
                                    String telefone,
                                    @NotNull(message = "{endereco.obrigatorio}")
                                    @Valid
                                    DadosEndereco endereco) {
}

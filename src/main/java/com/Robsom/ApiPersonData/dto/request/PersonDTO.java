package com.Robsom.ApiPersonData.dto.request;


import com.Robsom.ApiPersonData.entity.Phone;
import lombok.*;

import org.hibernate.validator.constraints.br.CPF;


import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {


    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 100)
    private String lastName;


    @CPF
    private String cpf;

    public String birthDate;

    @Valid
    @NotNull
    private List<PhoneDTO> phones;
}

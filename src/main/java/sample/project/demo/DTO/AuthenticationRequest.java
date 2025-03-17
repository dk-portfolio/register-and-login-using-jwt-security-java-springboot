package sample.project.demo.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {

    @Email(message = "Email is not well formatted")
    @NotEmpty(message="Firstname is mandatory")
    @NotNull(message = "Firstname is mandatory")
    private String email;
    @NotEmpty(message="Firstname is mandatory")
    @NotNull(message = "Firstname is mandatory")
    @Size(min = 8, message = "Password should be 8 character long minimum")
    private String password;

}

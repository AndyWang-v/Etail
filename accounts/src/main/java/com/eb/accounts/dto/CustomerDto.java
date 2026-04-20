package com.eb.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",
            example = "John Doe"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the customer",
            example = "john.doe@example.com"
    )
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address is not valid")
    private String email;

    @Schema(
            description = "Mobile number of the customer",
            example = "1234567890"
    )
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number should be of 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Accounts details of the customer"
    )
    private AccountsDto accountsDto;
}

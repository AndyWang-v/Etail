package com.eb.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/* Data Transfer Object for Account class */

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account details"
)
public class AccountsDto {

    @Schema(
            description = "Account number of an EB account"
    )
    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "AccountNumber should be of 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of ann EB account",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Branch address of ann EB account",
            example = "123 Main St, Anytown, USA"
    )
    @NotEmpty(message = "BranchAddress cannot be null or empty")
    private String branchAddress;
}

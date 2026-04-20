package com.eb.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response details"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API path of the error",
            example = "/api/create"
    )
    private String apiPath;

    @Schema(
            description = "HTTP Status code of the error",
            example = "400"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message of the error",
            example = "Invalid mobile number"
    )
    private String errorMessage;

    @Schema(
            description = "Error time of the error",
            example = "2022-01-01T00:00:00"
    )
    private LocalDateTime errorTime;


}

package com.unaiz.user.exception;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiError  {

    private String title;
    private String errorMessage;
    private int status;
    private LocalDateTime timestamp;
    private boolean success;

}

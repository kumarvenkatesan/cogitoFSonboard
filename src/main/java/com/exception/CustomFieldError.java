package com.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created on February, 2020
 *
 * @author kamer
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class CustomFieldError {

    private String field;

    private String message;




}
package com.test.azriel.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BooksDto {
    private String title;
    private int pages;
    private int price;
}

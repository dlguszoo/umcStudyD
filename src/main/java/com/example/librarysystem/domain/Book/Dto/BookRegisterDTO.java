package com.example.librarysystem.domain.Book.Dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookRegisterDTO {
    @NonNull
    private String name;

    @NonNull
    private String publisher;

    @NonNull
    private String author;

    @NonNull
    private String description;

    @NonNull
    private String classification;

}

package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Edge {
    char validChar;
    Vertex next;

    public boolean accepts(char ch) {
        return validChar == ch;
    }
}

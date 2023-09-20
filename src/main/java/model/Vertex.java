package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vertex {
    boolean isTerminal;
    List<Edge> outgoingEdges;

    public Vertex process(char ch) {
        return outgoingEdges.stream()
                .filter(edge -> edge.accepts(ch))
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getNext();
    }
}

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
    List<Edge> incomingEdges;
    List<Edge> outgoingEdges;
}

package Neo4j.Backend;

import java.util.List;

public record MovieDetailsDto(String title, List<CastMemberDto> cast) {
}

package combuild.domain.part;

import combuild.domain.PCPart;
import combuild.domain.part.enums.Brand;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PCCase implements PCPart {
    final long price;
    final String name;
    final Brand brand;

    final List<Integer> dimension; // Width x Length x Height
    final List<String> formFactors;
}

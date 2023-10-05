package combuild.domain.part;

import combuild.domain.PCPart;
import combuild.domain.part.enums.Brand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GPU implements PCPart {
    final long price;
    final String name;
    final Brand brand;

    final Brand cardManufacturer;
    final int length;
}

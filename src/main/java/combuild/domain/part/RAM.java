package combuild.domain.part;

import combuild.domain.PCPart;
import combuild.domain.part.enums.Brand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RAM implements PCPart {
    final long price;
    final String name;
    final Brand brand;

    final Brand stickManufacturer;
    final String generation;
    final int speed;
    final int capacity;
}

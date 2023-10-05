package combuild.domain.part;

import combuild.domain.PCPart;
import combuild.domain.part.enums.Brand;
import combuild.domain.part.enums.FormFactor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PSU implements PCPart {
    final long price;
    final String name;
    final Brand brand;

    final FormFactor formFactor;
    final int wattage;
}
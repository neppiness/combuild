package combuild.domain.part;

import combuild.domain.PCPart;
import combuild.domain.part.enums.Brand;
import combuild.domain.part.enums.FormFactor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Mainboard implements PCPart {
    final long price;
    final String name;
    final Brand brand;

    final String cpuSocket;
    final String ramSocket;
    final FormFactor formFactor;
}

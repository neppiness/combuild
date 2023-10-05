package combuild.domain.part;

import combuild.domain.PCPart;
import combuild.domain.part.enums.Brand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CPU implements PCPart {
    final long price;
    final String name;
    final Brand brand;

    final String socket;
    public final boolean hasIGpu;
    public final boolean hasStockCooler;
}
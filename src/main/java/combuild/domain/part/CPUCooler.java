package combuild.domain.part;

import combuild.domain.PCPart;
import combuild.domain.part.enums.Brand;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CPUCooler implements PCPart {
    final long price;
    final String name;
    final Brand brand;

    final int coolerHeight;
    final List<String> sockets;
}

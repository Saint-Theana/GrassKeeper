package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PhaseChange {
    @Tag(tag=7) public List<Uint32Pair> allowControllerMap = new ArrayList<>();
    @Tag(tag=13) public Integer afterPhase = null;
    @Tag(tag=8) public Integer beforePhase = null;
}

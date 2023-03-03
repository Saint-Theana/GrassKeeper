package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGOperationReboot {
    @Tag(tag=7) public List<Integer> costCardGuidList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> diceIndexList = new ArrayList<>();
}

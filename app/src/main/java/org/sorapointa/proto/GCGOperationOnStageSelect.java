package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGOperationOnStageSelect {
    @Tag(tag=5) public Integer cardGuid = null;
    @Tag(tag=4) public List<Integer> costDiceIndexList = new ArrayList<>();
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ModifyRemove {
    @Tag(tag=7) public Integer controllerId = null;
    @Tag(tag=3) public List<Integer> cardGuidList = new ArrayList<>();
    @Tag(tag=1) public Integer reason = null;
    @Tag(tag=2) public Integer ownerCardGuid = null;
}

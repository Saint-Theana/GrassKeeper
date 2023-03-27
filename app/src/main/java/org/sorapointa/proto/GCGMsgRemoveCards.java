package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgRemoveCards {
    @Tag(tag=14) public List<Integer> cardGuidList = new ArrayList<>();
    @Tag(tag=9) public Integer zone = null;
    @Tag(tag=4) public Integer controllerId = null;
    @Tag(tag=6) public Integer reason = null;
}

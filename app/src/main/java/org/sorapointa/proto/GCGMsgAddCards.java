package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgAddCards {
    @Tag(tag=11) public Integer controllerId = null;
    @Tag(tag=1) public Integer reason = null;
    @Tag(tag=6) public Integer pos = null;
    @Tag(tag=9) public Integer zone = null;
    @Tag(tag=5) public List<Integer> cardGuidList = new ArrayList<>();
}

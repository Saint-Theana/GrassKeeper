package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;

public class GCGMsgModifyAdd {
    @Tag(tag=11) public Integer pos = null;
    @Tag(tag=10) public Integer ownerCardGuid = null;
    @Tag(tag=7) public Integer controllerId = null;
    @Tag(tag=14) public Integer reason = null;
    @Tag(tag=4) public List<Integer> cardGuidList = new ArrayList<>();
}

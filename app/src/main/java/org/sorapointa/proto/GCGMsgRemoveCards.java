package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;
import org.sorapointa.proto.GCGZoneType.*;
import org.sorapointa.proto.GCGZoneType;

public class GCGMsgRemoveCards {
    @Tag(tag=15) public Integer controllerId = null;
    @Tag(tag=10) public Integer zone = null;
    @Tag(tag=5) public Integer reason = null;
    @Tag(tag=1) public List<Integer> cardGuidList = new ArrayList<>();
}

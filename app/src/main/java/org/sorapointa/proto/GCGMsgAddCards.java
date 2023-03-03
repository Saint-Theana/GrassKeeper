package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;
import org.sorapointa.proto.GCGZoneType.*;
import org.sorapointa.proto.GCGZoneType;

public class GCGMsgAddCards {
    @Tag(tag=11) public Integer pos = null;
    @Tag(tag=2) public Integer zone = null;
    @Tag(tag=15) public Integer reason = null;
    @Tag(tag=13) public Integer controllerId = null;
    @Tag(tag=14) public List<Integer> cardGuidList = new ArrayList<>();
}

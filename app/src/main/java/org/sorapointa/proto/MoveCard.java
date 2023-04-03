package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGZoneType.*;
import org.sorapointa.proto.GCGZoneType;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;

public class MoveCard {
    @Tag(tag=6) public Integer controllerId = null;
    @Tag(tag=3) public Integer from = null;
    @Tag(tag=15) public List<Integer> cardGuidList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> failGuidList = new ArrayList<>();
    @Tag(tag=12) public Integer to = null;
    @Tag(tag=4) public Integer reason = null;
}

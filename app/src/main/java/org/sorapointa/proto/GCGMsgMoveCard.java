package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGReason.*;
import org.sorapointa.proto.GCGReason;
import org.sorapointa.proto.GCGZoneType.*;
import org.sorapointa.proto.GCGZoneType;

public class GCGMsgMoveCard {
    @Tag(tag=14) public Integer controllerId = null;
    @Tag(tag=5) public Integer to = null;
    @Tag(tag=12) public Integer from = null;
    @Tag(tag=10) public Boolean isFail = null;
    @Tag(tag=7) public Integer cardGuid = null;
    @Tag(tag=6) public Integer reason = null;
}

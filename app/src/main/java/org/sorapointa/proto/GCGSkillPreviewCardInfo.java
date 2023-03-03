package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGZoneType.*;
import org.sorapointa.proto.GCGZoneType;

public class GCGSkillPreviewCardInfo {
    @Tag(tag=3) public Integer controllerId = null;
    @Tag(tag=11) public Integer ownerCardGuid = null;
    @Tag(tag=14) public Integer zoneType = null;
    @Tag(tag=13) public Integer cardId = null;
    @Tag(tag=6) public Integer cardGuid = null;
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGZoneType.*;
import org.sorapointa.proto.GCGZoneType;

public class GCGSkillPreviewCardInfo {
    @Tag(tag=13) public Integer zoneType = null;
    @Tag(tag=1) public Integer controllerId = null;
    @Tag(tag=7) public Integer ownerCardGuid = null;
    @Tag(tag=12) public Integer cardGuid = null;
    @Tag(tag=10) public Integer faceType = null;
    @Tag(tag=5) public Integer cardId = null;
}

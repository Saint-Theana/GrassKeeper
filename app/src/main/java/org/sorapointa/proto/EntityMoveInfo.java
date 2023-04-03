package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class EntityMoveInfo {
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=2) public MotionInfo motionInfo = null;
    @Tag(tag=3) public Integer sceneTime = null;
    @Tag(tag=4) public Integer reliableSeq = null;
    @Tag(tag=5) public Boolean isReliable = null;
}

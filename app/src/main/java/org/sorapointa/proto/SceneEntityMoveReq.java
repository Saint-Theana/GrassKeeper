package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class SceneEntityMoveReq {
    @Tag(tag=7) public MotionInfo motionInfo = null;
    @Tag(tag=4) public Integer sceneTime = null;
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=15) public Integer reliableSeq = null;
}

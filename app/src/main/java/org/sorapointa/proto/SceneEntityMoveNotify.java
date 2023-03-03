package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class SceneEntityMoveNotify {
    @Tag(tag=6) public MotionInfo motionInfo = null;
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=15) public Integer sceneTime = null;
    @Tag(tag=2) public Integer reliableSeq = null;
}

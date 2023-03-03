package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class ForceDragAvatarNotify {
    @Tag(tag=3) public Integer sceneTime = null;
    @Tag(tag=1) public Long deltaTimeMs = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=10) public MotionInfo motionInfo = null;
    @Tag(tag=8) public Boolean isFirstValid = null;
    @Tag(tag=12) public Long lastMoveTimeMs = null;
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class EntityForceSyncReq {
    @Tag(tag=1) public Integer roomId = null;
    @Tag(tag=11) public MotionInfo motionInfo = null;
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=12) public Integer sceneTime = null;
}

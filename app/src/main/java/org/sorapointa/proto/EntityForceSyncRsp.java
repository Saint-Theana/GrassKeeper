package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class EntityForceSyncRsp {
    @Tag(tag=14) public Integer sceneTime = null;
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=8) public MotionInfo failMotion = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}

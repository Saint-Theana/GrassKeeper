package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class SceneEntityMoveRsp {
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=1) public MotionInfo failMotion = null;
    @Tag(tag=10) public Integer sceneTime = null;
    @Tag(tag=6) public Integer reliableSeq = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}

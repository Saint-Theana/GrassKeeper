package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class EntityMoveFailInfo {
    @Tag(tag=2) public MotionInfo failMotion = null;
    @Tag(tag=7) public Integer sceneTime = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=4) public Integer reliableSeq = null;
}

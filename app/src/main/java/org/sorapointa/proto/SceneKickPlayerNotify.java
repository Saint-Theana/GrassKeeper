package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneKickPlayerNotify {
    @Tag(tag=8) public Integer targetUid = null;
    @Tag(tag=9) public Integer kickerUid = null;
}

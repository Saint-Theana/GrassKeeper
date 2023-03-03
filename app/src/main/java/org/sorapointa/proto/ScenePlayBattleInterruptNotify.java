package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleInterruptNotify {
    @Tag(tag=6) public Integer interruptState = null;
    @Tag(tag=5) public Integer playId = null;
    @Tag(tag=1) public Integer playType = null;
}

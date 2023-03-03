package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneTimeNotify {
    @Tag(tag=14) public Long sceneTime = null;
    @Tag(tag=1) public Boolean isPaused = null;
    @Tag(tag=7) public Integer sceneId = null;
}

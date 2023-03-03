package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePointUnlockNotify {
    @Tag(tag=13) public List<Integer> pointList = new ArrayList<>();
    @Tag(tag=6) public Integer sceneId = null;
    @Tag(tag=12) public List<Integer> unhidePointList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> hidePointList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> lockedPointList = new ArrayList<>();
}

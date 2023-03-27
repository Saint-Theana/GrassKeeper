package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePointUnlockNotify {
    public enum ScenePointUnlockNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=239) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<Integer> lockedPointList = new ArrayList<>();
    @Tag(tag=12) public Integer sceneId = null;
    @Tag(tag=9) public List<Integer> pointList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> hidePointList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> unhidePointList = new ArrayList<>();
}

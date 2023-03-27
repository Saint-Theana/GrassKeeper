package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerEnterSceneNotify {
    public enum PlayerEnterSceneNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=205) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Boolean isFirstLoginEnterScene = null;
    @Tag(tag=2) public Integer enterSceneToken = null;
    @Tag(tag=4) public Integer prevSceneId = null;
    @Tag(tag=1090) public Integer worldType = null;
    @Tag(tag=317) public Boolean isSkipUi = null;
    @Tag(tag=3) public Integer sceneId = null;
    @Tag(tag=13) public Vector pos = null;
    @Tag(tag=5) public Integer worldLevel = null;
    @Tag(tag=647) public String sceneTransaction = null;
    @Tag(tag=74) public Integer enterReason = null;
    @Tag(tag=9) public Integer type = null;
    @Tag(tag=11) public Integer dungeonId = null;
    @Tag(tag=8) public List<Integer> sceneTagIdList = new ArrayList<>();
    @Tag(tag=12) public Vector prevPos = null;
    @Tag(tag=15) public Long sceneBeginTime = null;
    @Tag(tag=1) public Integer targetUid = null;
}

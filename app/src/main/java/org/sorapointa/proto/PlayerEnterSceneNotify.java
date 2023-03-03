package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EnterType.*;
import org.sorapointa.proto.EnterType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PlayerEnterSceneNotify {
    @Tag(tag=6) public Integer prevSceneId = null;
    @Tag(tag=12) public Integer dungeonId = null;
    @Tag(tag=1732) public Boolean isSkipUi = null;
    @Tag(tag=15) public Integer sceneId = null;
    @Tag(tag=13) public Integer type = null;
    @Tag(tag=14) public Long sceneBeginTime = null;
    @Tag(tag=11) public Integer worldLevel = null;
    @Tag(tag=1490) public Integer worldType = null;
    @Tag(tag=4) public Integer targetUid = null;
    @Tag(tag=3) public Boolean isFirstLoginEnterScene = null;
    @Tag(tag=5) public List<Integer> sceneTagIdList = new ArrayList<>();
    @Tag(tag=1842) public String sceneTransaction = null;
    @Tag(tag=8) public Vector prevPos = null;
    @Tag(tag=1828) public Integer enterReason = null;
    @Tag(tag=7) public Vector pos = null;
    @Tag(tag=2) public Integer enterSceneToken = null;
}

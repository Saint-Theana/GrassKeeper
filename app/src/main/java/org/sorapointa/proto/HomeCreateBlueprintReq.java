package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeCreateBlueprintReq {
    public enum LHOAMCJJEGB {
        @Tag(tag=0) None ,
        @Tag(tag=4645) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public HomeSceneArrangementInfo sceneArrangementInfo = null;
    @Tag(tag=13) public Integer slotId = null;
    @Tag(tag=8) public String serverShareCode = null;
    @Tag(tag=1) public Integer genShareCodeCount = null;
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSceneArrangementInfo.*;
import org.sorapointa.proto.HomeSceneArrangementInfo;

public class HomeUpdateArrangementInfoReq {
    public enum HomeUpdateArrangementInfoReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4689) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public HomeSceneArrangementInfo sceneArrangementInfo = null;
}

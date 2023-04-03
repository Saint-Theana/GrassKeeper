package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSceneArrangementInfo.*;
import org.sorapointa.proto.HomeSceneArrangementInfo;

public class HomePreviewBlueprintRsp {
    public enum GACMGFBMJLD {
        @Tag(tag=0) None ,
        @Tag(tag=4625) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public String shareCode = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public HomeSceneArrangementInfo sceneArrangementInfo = null;
}

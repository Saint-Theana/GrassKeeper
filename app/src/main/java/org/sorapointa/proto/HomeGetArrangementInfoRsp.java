package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeGetArrangementInfoRsp {
    public enum HomeGetArrangementInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4624) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<HomeSceneArrangementInfo> sceneArrangementInfoList = new ArrayList<>();
}

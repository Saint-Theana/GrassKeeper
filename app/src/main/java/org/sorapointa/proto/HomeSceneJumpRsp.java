package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSceneJumpRsp {
    public enum HomeSceneJumpRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4822) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean isEnterRoomScene = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}

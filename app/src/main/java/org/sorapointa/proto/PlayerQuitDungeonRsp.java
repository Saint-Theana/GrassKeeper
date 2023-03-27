package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerQuitDungeonRsp {
    public enum PlayerQuitDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=974) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer pointId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RemoveCustomDungeonRsp {
    public enum RemoveCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6202) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Long dungeonGuid = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}

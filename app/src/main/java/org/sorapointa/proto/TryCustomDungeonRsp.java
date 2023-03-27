package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TryCustomDungeonRsp {
    public enum TryCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6237) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer roomId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}

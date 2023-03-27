package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerBuffSelectRsp {
    public enum TowerBuffSelectRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2416) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer towerBuffId = null;
}

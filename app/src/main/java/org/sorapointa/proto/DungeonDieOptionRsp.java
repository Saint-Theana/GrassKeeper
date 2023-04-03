package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieOption.*;
import org.sorapointa.proto.PlayerDieOption;

public class DungeonDieOptionRsp {
    public enum DungeonDieOptionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=978) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer dieOption = null;
    @Tag(tag=10) public Integer reviveCount = null;
}

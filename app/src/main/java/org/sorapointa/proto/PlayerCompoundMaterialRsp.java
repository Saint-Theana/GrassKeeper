package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CompoundQueueData.*;
import org.sorapointa.proto.CompoundQueueData;

public class PlayerCompoundMaterialRsp {
    public enum PlayerCompoundMaterialRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=150) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public CompoundQueueData compoundQueData = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}

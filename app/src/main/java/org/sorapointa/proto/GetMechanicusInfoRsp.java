package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetMechanicusInfoRsp {
    public enum GetMechanicusInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3955) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public MechanicusInfo mechanicusInfo = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}

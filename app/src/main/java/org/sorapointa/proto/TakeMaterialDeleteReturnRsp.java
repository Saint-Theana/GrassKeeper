package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeMaterialDeleteReturnRsp {
    public enum TakeMaterialDeleteReturnRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=690) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}

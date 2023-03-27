package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetCodexPushtipsReadRsp {
    public enum SetCodexPushtipsReadRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4210) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer codexId = null;
    @Tag(tag=4) public Integer typeId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeDeleteBlueprintRsp {
    public enum BAMMGLKEGBD {
        @Tag(tag=0) None ,
        @Tag(tag=4564) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer slotId = null;
}

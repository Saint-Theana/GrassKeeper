package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UseItemRsp {
    public enum UseItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=662) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Long guid = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer itemId = null;
    @Tag(tag=11) public Long targetGuid = null;
    @Tag(tag=3) public Integer optionIdx = null;
}

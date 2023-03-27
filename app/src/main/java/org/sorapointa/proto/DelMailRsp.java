package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelMailRsp {
    public enum DelMailRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1480) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<Integer> mailIdList = new ArrayList<>();
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TryEnterHomeRsp {
    public enum TryEnterHomeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4820) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer targetUid = null;
    @Tag(tag=10) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryPromoteRsp {
    public enum ReliquaryPromoteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=675) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<Integer> curAppendPropList = new ArrayList<>();
    @Tag(tag=2) public Long targetReliquaryGuid = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<Integer> oldAppendPropList = new ArrayList<>();
    @Tag(tag=7) public Integer oldPromoteLevel = null;
    @Tag(tag=15) public Integer curPromoteLevel = null;
}

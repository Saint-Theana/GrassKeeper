package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetCompoundDataRsp {
    public enum GetCompoundDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=152) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<CompoundQueueData> compoundQueDataList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> unlockCompoundList = new ArrayList<>();
}

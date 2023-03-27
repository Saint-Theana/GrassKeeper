package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryUpgradeRsp {
    public enum ReliquaryUpgradeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=658) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<Integer> oldAppendPropList = new ArrayList<>();
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer powerUpRate = null;
    @Tag(tag=12) public Long targetReliquaryGuid = null;
    @Tag(tag=4) public List<Integer> curAppendPropList = new ArrayList<>();
    @Tag(tag=15) public Integer oldLevel = null;
    @Tag(tag=13) public Integer curLevel = null;
}

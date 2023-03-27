package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomePlantSeedReq {
    public enum HomePlantSeedReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4669) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer index = null;
    @Tag(tag=13) public Integer fieldGuid = null;
    @Tag(tag=10) public List<Integer> seedIdList = new ArrayList<>();
}

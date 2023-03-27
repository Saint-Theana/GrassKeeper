package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryUpgradeReq {
    public enum ReliquaryUpgradeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=625) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public List<Long> foodReliquaryGuidList = new ArrayList<>();
    @Tag(tag=14) public Long targetReliquaryGuid = null;
    @Tag(tag=8) public List<ItemParam> itemParamList = new ArrayList<>();
}

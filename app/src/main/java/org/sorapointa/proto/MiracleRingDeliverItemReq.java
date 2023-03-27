package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MiracleRingDeliverItemReq {
    public enum MiracleRingDeliverItemReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5231) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public List<Long> foodWeaponGuidList = new ArrayList<>();
    @Tag(tag=2) public Integer opType = null;
    @Tag(tag=14) public Integer gadgetId = null;
    @Tag(tag=5) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=6) public Integer gadgetEntityId = null;
}

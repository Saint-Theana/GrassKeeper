package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FoundationOpType.*;
import org.sorapointa.proto.FoundationOpType;

public class FoundationReq {
    public enum FoundationReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=869) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer pointConfigId = null;
    @Tag(tag=10) public Integer opType = null;
    @Tag(tag=13) public Integer buildingId = null;
    @Tag(tag=4) public Integer gadgetEntityId = null;
}

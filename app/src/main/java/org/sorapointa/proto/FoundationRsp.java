package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FoundationOpType.*;
import org.sorapointa.proto.FoundationOpType;

public class FoundationRsp {
    public enum FoundationRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=806) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer pointConfigId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer gadgetEntityId = null;
    @Tag(tag=15) public Integer opType = null;
    @Tag(tag=8) public Integer buildingId = null;
}

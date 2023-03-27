package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MiracleRingDeliverItemRsp {
    public enum MiracleRingDeliverItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5235) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer gadgetEntityId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer interactType = null;
    @Tag(tag=4) public Integer gadgetId = null;
    @Tag(tag=15) public Integer opType = null;
}

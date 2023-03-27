package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FurnitureMakeCancelRsp {
    public enum FurnitureMakeCancelRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4561) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=10) public Integer makeId = null;
}

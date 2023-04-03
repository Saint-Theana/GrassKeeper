package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;

public class FurnitureMakeStartRsp {
    public enum FurnitureMakeStartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4756) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}

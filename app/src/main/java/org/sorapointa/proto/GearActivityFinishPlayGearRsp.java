package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GearActivityFinishPlayGearRsp {
    public enum GearActivityFinishPlayGearRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=24722) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Boolean isSuccess = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer levelId = null;
}

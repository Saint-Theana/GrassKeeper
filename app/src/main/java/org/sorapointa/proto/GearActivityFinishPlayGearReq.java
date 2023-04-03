package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GearColumnInfo.*;
import org.sorapointa.proto.GearColumnInfo;

public class GearActivityFinishPlayGearReq {
    public enum GearActivityFinishPlayGearReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=20920) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Boolean isSuccess = null;
    @Tag(tag=9) public List<GearColumnInfo> gearColumnInfoList = new ArrayList<>();
    @Tag(tag=13) public Boolean useClue = null;
    @Tag(tag=2) public Integer levelId = null;
}

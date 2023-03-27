package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PersonalLineAllDataRsp {
    public enum PersonalLineAllDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=443) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<Integer> ongoingPersonalLineList = new ArrayList<>();
    @Tag(tag=7) public Integer legendaryKeyCount = null;
    @Tag(tag=2) public Integer curFinishedDailyTaskCount = null;
    @Tag(tag=4) public List<Integer> canBeUnlockedPersonalLineList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<LockedPersonallineData> lockedPersonalLineList = new ArrayList<>();
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AsterMidCampInfo.*;
import org.sorapointa.proto.AsterMidCampInfo;

public class AsterMidCampInfoNotify {
    public enum AsterMidCampInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2151) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<AsterMidCampInfo> campList = new ArrayList<>();
}

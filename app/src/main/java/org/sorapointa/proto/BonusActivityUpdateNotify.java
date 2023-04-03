package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BonusActivityInfo.*;
import org.sorapointa.proto.BonusActivityInfo;

public class BonusActivityUpdateNotify {
    public enum BonusActivityUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2529) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<BonusActivityInfo> bonusActivityInfoList = new ArrayList<>();
}

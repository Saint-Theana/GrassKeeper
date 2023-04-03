package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class BattlePassBuySuccNotify {
    public enum BattlePassBuySuccNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2642) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer productPlayType = null;
    @Tag(tag=6) public Integer addPoint = null;
    @Tag(tag=14) public Integer scheduleId = null;
    @Tag(tag=2) public List<ItemParam> itemList = new ArrayList<>();
}

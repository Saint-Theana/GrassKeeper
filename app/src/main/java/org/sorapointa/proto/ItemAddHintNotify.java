package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.ItemHint.*;
import org.sorapointa.proto.ItemHint;

public class ItemAddHintNotify {
    public enum ItemAddHintNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=620) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer questId = null;
    @Tag(tag=1) public List<ItemHint> overflowTransformedItemList = new ArrayList<>();
    @Tag(tag=14) public Boolean isPositionValid = null;
    @Tag(tag=12) public Boolean isTransferedFromAvatarCard = null;
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=9) public Vector position = null;
    @Tag(tag=8) public List<ItemHint> itemList = new ArrayList<>();
    @Tag(tag=11) public Boolean isGeneralRewardHiden = null;
}

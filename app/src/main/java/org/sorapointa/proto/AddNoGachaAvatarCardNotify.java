package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AddNoGachaAvatarCardTransferItem.*;
import org.sorapointa.proto.AddNoGachaAvatarCardTransferItem;

public class AddNoGachaAvatarCardNotify {
    public enum AddNoGachaAvatarCardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1669) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer itemId = null;
    @Tag(tag=3) public Integer initialLevel = null;
    @Tag(tag=14) public Boolean isTransferToItem = null;
    @Tag(tag=9) public Integer reason = null;
    @Tag(tag=10) public List<AddNoGachaAvatarCardTransferItem> transferItemList = new ArrayList<>();
    @Tag(tag=13) public Integer initialPromoteLevel = null;
    @Tag(tag=4) public Integer avatarId = null;
}

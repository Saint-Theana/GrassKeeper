package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AddNoGachaAvatarCardTransferItem.*;
import org.sorapointa.proto.AddNoGachaAvatarCardTransferItem;

public class AddNoGachaAvatarCardNotify {
    @Tag(tag=4) public List<AddNoGachaAvatarCardTransferItem> transferItemList = new ArrayList<>();
    @Tag(tag=2) public Integer initialPromoteLevel = null;
    @Tag(tag=8) public Integer avatarId = null;
    @Tag(tag=6) public Boolean isTransferToItem = null;
    @Tag(tag=9) public Integer reason = null;
    @Tag(tag=10) public Integer initialLevel = null;
    @Tag(tag=14) public Integer itemId = null;
}

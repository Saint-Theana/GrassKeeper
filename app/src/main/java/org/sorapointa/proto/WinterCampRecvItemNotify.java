package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampRecvItemData.*;
import org.sorapointa.proto.WinterCampRecvItemData;

public class WinterCampRecvItemNotify {
    public enum WinterCampRecvItemNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8667) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public WinterCampRecvItemData recvItemData = null;
}

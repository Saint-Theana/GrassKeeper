package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlossomChestInfoNotify {
    public enum BlossomChestInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=870) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public BlossomChest blossomChestInfo = null;
    @Tag(tag=13) public Integer entityId = null;
}

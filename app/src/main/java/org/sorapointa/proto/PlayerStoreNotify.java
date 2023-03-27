package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerStoreNotify {
    public enum PlayerStoreNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=605) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<TrifleItem> itemList = new ArrayList<>();
    @Tag(tag=6) public Integer weightLimit = null;
    @Tag(tag=10) public Integer storeType = null;
}

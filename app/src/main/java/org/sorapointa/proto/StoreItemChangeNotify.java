package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StoreItemChangeNotify {
    public enum StoreItemChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=687) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<TrifleItem> itemList = new ArrayList<>();
    @Tag(tag=5) public Integer storeType = null;
}

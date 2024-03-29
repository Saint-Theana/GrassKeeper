package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;

public class StoreItemDelNotify {
    public enum StoreItemDelNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=698) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Long> guidList = new ArrayList<>();
    @Tag(tag=10) public Integer storeType = null;
}

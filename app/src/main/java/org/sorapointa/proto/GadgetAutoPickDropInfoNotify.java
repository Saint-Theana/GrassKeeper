package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetAutoPickDropInfoNotify {
    public enum GadgetAutoPickDropInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=816) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<TrifleItem> itemList = new ArrayList<>();
}

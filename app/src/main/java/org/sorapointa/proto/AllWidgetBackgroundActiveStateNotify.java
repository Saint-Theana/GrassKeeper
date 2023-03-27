package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AllWidgetBackgroundActiveStateNotify {
    public enum FHMOGDOBJLM {
        @Tag(tag=0) None ,
        @Tag(tag=6011) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<Integer> backgroundActiveWidgetList = new ArrayList<>();
}

package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomePreChangeEditModeNotify {
    public enum HomePreChangeEditModeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4637) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Boolean isEnterEditMode = null;
}

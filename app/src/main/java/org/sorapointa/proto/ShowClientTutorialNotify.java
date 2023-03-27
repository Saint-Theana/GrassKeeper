package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowClientTutorialNotify {
    public enum ShowClientTutorialNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3381) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer tutorialId = null;
}

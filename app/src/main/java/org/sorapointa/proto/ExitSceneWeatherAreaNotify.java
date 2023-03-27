package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExitSceneWeatherAreaNotify {
    public enum ExitSceneWeatherAreaNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=294) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer weatherGadgetId = null;
}

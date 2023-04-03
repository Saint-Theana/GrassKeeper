package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ScenePlayInfo.*;
import org.sorapointa.proto.ScenePlayInfo;

public class ScenePlayInfoListNotify {
    public enum ScenePlayInfoListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4374) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<ScenePlayInfo> playInfoList = new ArrayList<>();
}

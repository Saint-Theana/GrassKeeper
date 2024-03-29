package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VisionType.*;
import org.sorapointa.proto.VisionType;
import org.sorapointa.proto.SceneEntityInfo.*;
import org.sorapointa.proto.SceneEntityInfo;

public class ScenePlayerBackgroundAvatarRefreshNotify {
    public enum ABMJKMHPLAD {
        @Tag(tag=0) None ,
        @Tag(tag=3464) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer param = null;
    @Tag(tag=14) public List<SceneEntityInfo> entityList = new ArrayList<>();
    @Tag(tag=2) public Integer appearType = null;
}

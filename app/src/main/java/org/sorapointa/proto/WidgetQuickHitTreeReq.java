package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HitTreeInfo.*;
import org.sorapointa.proto.HitTreeInfo;

public class WidgetQuickHitTreeReq {
    public enum JOCCFEJFEFF {
        @Tag(tag=0) None ,
        @Tag(tag=3428) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public List<HitTreeInfo> hitTreeInfoList = new ArrayList<>();
}

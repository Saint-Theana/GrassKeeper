package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksLaunchSchemeData.*;
import org.sorapointa.proto.FireworksLaunchSchemeData;

public class FireworksLaunchDataNotify {
    public enum FireworksLaunchDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5979) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer lastUseSchemeId = null;
    @Tag(tag=2) public List<FireworksLaunchSchemeData> schemeDataList = new ArrayList<>();
}

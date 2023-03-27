package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeComfortInfoNotify {
    public enum HomeComfortInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4879) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<HomeModuleComfortInfo> moduleInfoList = new ArrayList<>();
}

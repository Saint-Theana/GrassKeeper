package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DeshretObeliskChestInfoNotify {
    public enum ABOJDFAFAIE {
        @Tag(tag=0) None ,
        @Tag(tag=807) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<DeshretObeliskChestInfo> chestInfoList = new ArrayList<>();
}

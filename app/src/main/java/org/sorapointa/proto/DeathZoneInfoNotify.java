package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DeathZoneInfoNotify {
    public enum OHCAJKINFPJ {
        @Tag(tag=0) None ,
        @Tag(tag=6295) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<DeathZoneInfo> deathZoneInfoList = new ArrayList<>();
}

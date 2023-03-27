package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeWidgetBackgroundActiveStateRsp {
    public enum MLOHDHDAHDD {
        @Tag(tag=0) None ,
        @Tag(tag=6088) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer materialId = null;
}

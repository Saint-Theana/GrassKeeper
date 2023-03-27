package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSFieldUnlockNotify {
    public enum JAIHIOOIECC {
        @Tag(tag=0) None ,
        @Tag(tag=7075) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer fieldId = null;
}

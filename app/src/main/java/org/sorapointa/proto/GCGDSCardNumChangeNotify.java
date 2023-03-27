package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardNumChangeNotify {
    public enum ILMHAKGOCAK {
        @Tag(tag=0) None ,
        @Tag(tag=7605) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer cardId = null;
    @Tag(tag=3) public Integer num = null;
}

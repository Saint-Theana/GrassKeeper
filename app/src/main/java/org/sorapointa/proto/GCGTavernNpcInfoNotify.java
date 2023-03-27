package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTavernNpcInfoNotify {
    public enum EEEIHMNDOCL {
        @Tag(tag=0) None ,
        @Tag(tag=7851) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<GCGTavernNpcInfo> constNpcList = new ArrayList<>();
    @Tag(tag=5) public List<GCGTavernNpcInfo> weekNpcList = new ArrayList<>();
    @Tag(tag=12) public GCGTavernNpcInfo characterNpc = null;
}

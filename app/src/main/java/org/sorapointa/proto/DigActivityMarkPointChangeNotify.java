package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DigMarkPoint.*;
import org.sorapointa.proto.DigMarkPoint;

public class DigActivityMarkPointChangeNotify {
    public enum DigActivityMarkPointChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8508) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<DigMarkPoint> digMarkPointList = new ArrayList<>();
}
